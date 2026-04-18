package Package;
import java.util.ArrayList;
import java.util.Arrays;

public class EmpresaLogistica{
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;

    public EmpresaLogistica() {
    }

    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();

    }
    public void adicionarVeiculo(Veiculo v){
        frota.add(v);
    }
    public void gerarRelatorioCustos(double distancia){
        for (Veiculo v : frota) {
            v.exibirDados();
            double custo = v.calcularCustoViagem(distancia);
            System.out.println("Custo da viagem (" + distancia + " km): R$ " + custo);
        }
    }

    @Override
    public String toString() {
        return "EmpresaLogistica{" +
                super.toString() +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", frota=" + frota +
                '}';
    }
}
