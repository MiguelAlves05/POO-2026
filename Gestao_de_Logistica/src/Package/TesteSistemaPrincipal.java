package Package;

public class TesteSistemaPrincipal {
    public static void main(String[] args) {

        EmpresaLogistica empresaLogistica = new EmpresaLogistica("Logg");

        Caminhao caminhao1 = new Caminhao("EVZ8", 800, 8);
        Caminhao caminhao2 = new Caminhao("ABC6", 600, 6);

        Van van1 = new Van("CDE8", 300, true);
        Van van2 = new Van("CDE9", 300, false);

        empresaLogistica.adicionarVeiculo(caminhao1);
        empresaLogistica.adicionarVeiculo(caminhao2);
        empresaLogistica.adicionarVeiculo(van1);
        empresaLogistica.adicionarVeiculo(van2);

        empresaLogistica.gerarRelatorioCustos(300);
    }
}
