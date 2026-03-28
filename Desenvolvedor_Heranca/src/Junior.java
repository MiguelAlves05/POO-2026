public class Junior extends Desenvolvedor{
    private String mentor;
    public Junior(){
        super();
    }
    public Junior(String mentor, String nome, String linguagem, float slarioBase){
        super(nome,linguagem,slarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void codar(){
        System.out.println("Junior criando com a mentoria de " + this.mentor);
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }
}
