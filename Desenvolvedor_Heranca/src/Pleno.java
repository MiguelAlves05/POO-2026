public class Pleno extends Desenvolvedor{
    private int projEntr;
    public Pleno(){
        super();
    }
    public Pleno(int projEntre, String nome, String linguagem, float salarioBase){
        super(nome,linguagem,salarioBase);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }
    @Override
    public void codar(){
        System.out.println("Pleno codando e fazendo Code Review");
    }
    @Override
    public float calculaBonus(){
        return this.salarioBase * 0.15f;
    }
    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntr=" + projEntr +
                '}';
    }
}
