import java.util.Date;

public class TestaEcommerce {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("438", "Miguel", "Rua A");
        Produto produto1 = new Produto(1, "Iphone", "17 Pro Max", 8000);

        CarrinhoCompra carrinhoCompra = new CarrinhoCompra(2, new Date(), cliente1);
        carrinhoCompra.adicionarItemCarrinho(1, 1, produto1);
        System.out.println(carrinhoCompra.toString());
        carrinhoCompra.TotalCompra();
    }
}
