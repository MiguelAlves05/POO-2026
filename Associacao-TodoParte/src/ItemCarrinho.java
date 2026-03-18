public class ItemCarrinho {
    private int id;
    private float quantidade;
    private Produto produto;

    public ItemCarrinho() {
    }
    // esse construtor caracteriza agregação
    // motivo: produto já veio criado, é independente
    public ItemCarrinho(int id, float quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    // agregação - produto já veio criado, é independente
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItemCarrinho{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
