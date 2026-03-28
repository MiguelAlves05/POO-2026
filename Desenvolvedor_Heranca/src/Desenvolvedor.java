public class Desenvolvedor {
    protected String nome, linguagens;
    protected float salarioBase;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String linguagens, float slarioBase) {
        this.nome = nome;
        this.linguagens = linguagens;
        this.salarioBase = slarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    public float getSlarioBase() {
        return salarioBase;
    }

    public void setSlarioBase(float slarioBase) {
        this.salarioBase = slarioBase;
    }

    public void codar(){
        System.out.println("Desenvolvedor criado código");
    }

    public float calculaBonus(){
        return this.salarioBase * 0.05f;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", linguagens='" + linguagens + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
