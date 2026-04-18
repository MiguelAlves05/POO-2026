package Package;

public class Caminhao extends Veiculo {
    private int quantidadeExixos;
    public Caminhao(){
        super();
    }
    public Caminhao(int quantidadeExixos) {
        this.quantidadeExixos = quantidadeExixos;
    }

    public Caminhao(String placa, double capacidadeCarga, int quantidadeExixos) {
        super(placa, capacidadeCarga);
        this.quantidadeExixos = quantidadeExixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        System.out.println("O custo da viagem é " + (distancia * 5.0) + (quantidadeExixos * 50.00));
        return distancia;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                super.toString() +
                "quantidadeExixos=" + quantidadeExixos +
                '}';
    }
}
