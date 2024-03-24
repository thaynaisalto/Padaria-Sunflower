import java.util.Scanner;

public class TestePadaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VetorProdutos vetorProdutos = new VetorProdutos();

        while (true) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Olá! Bem vindo a Padaria Sunflower. Observe o nosso menu. ");
            System.out.println("1. Adicionar um produto.");
            System.out.println("2. Visualizar produtos.");
            System.out.println("3. Atualizar produto.");
            System.out.println("4. Remover um produto.");
            System.out.println("5. Sair.");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Preço: ");
                        if (scanner.hasNextDouble()) {
                            double preco = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Quantidade: ");
                            if (scanner.hasNextInt()) {
                                int quantidade = scanner.nextInt();
                                scanner.nextLine();
                                vetorProdutos.adicionarProduto(new Produto(nome, preco, quantidade));
                            } else {
                                System.out.println("Quantidade inválida. Tente novamente.");
                                scanner.nextLine();
                            }
                        } else {
                            System.out.println("Preço inválido. Tente novamente.");
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        vetorProdutos.visualizarProdutos();
                        break;
                    case 3:
                        System.out.print("Nome do produto a ser atualizado: ");
                        nome = scanner.nextLine();
                        System.out.print("Novo preço: ");
                        if (scanner.hasNextDouble()) {
                            double novoPreco = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Nova quantidade: ");
                            if (scanner.hasNextInt()) {
                                int novaQuantidade = scanner.nextInt();
                                scanner.nextLine();
                                vetorProdutos.atualizarProduto(nome, novoPreco, novaQuantidade);
                            } else {
                                System.out.println("Quantidade inválida. Tente novamente.");
                                scanner.nextLine();
                            }
                        } else {
                            System.out.println("Preço inválido. Tente novamente.");
                            scanner.nextLine();
                        }
                        break;
                    case 4:
                        System.out.print("Nome do produto a ser removido: ");
                        nome = scanner.nextLine();
                        vetorProdutos.removerProduto(nome);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.nextLine();
            }
        }
    }
}
