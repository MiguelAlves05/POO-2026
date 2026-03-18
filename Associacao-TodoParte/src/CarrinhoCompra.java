import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itens;

    public CarrinhoCompra() {
        this.itens = new ArrayList<>();
    }
    // esse construtor caracteriza uma agregação
    // motivo: cliente já veio criado, é independente

    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItemCarrinho(int id, float quantidade, Produto produto) {
        ItemCarrinho aux = new ItemCarrinho(id, quantidade, produto);
        this.itens.add(aux);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    // é agregação - cliente já veio criado, é independente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void TotalCompra() {
        float total = 0;
        for (ItemCarrinho aux : this.itens) {
            total += aux.getQuantidade() * aux.getProduto().getPreco();
        }
        System.out.println("Total de compras: " + total);
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                ", itens=\n" + itens +
                '}';
    }

}
