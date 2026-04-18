package Package;

public class Van extends Veiculo {
    private boolean refrigerada;

    public Van(double distancia, boolean refrigerada) {
        super();
        this.refrigerada = refrigerada;
    }

    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custo = (distancia * 3.00);
        if (refrigerada) {
            custo += 100.00;
        }
        return custo;
    }

    @Override
    public String toString() {
        return "Van{" +
                super.toString() +
                "refrigerada=" + refrigerada +
                '}';
    }
}