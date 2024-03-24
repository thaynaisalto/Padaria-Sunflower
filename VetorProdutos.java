import java.util.ArrayList;

public class VetorProdutos {
    private ArrayList<Produto> produtos;

    public VetorProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void visualizarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
            }
        }
    }

    public void atualizarProduto(String nome, double novoPreco, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
