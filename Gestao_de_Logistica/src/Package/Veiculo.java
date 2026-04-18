package Package;

public abstract class Veiculo {
    protected String placa;
    protected double capacidadeCarga;

    public Veiculo() {
    }

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public void exibirDados(){
        System.out.println("Placa: " + this.placa);
    }
    public abstract double calcularCustoViagem(double distancia);

    @Override
    public String toString() {
        return "Veiculo{" +
                super.toString() +
                "placa='" + placa + '\'' +
                ", capacidadeCarga=" + capacidadeCarga +
                '}';
    }
}
