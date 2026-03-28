public class Aluno {

    String nome, sexo, resultado;
    int ra;
    int idade;
    double media;

    public Aluno(String nome, int ra, int idade, String sexo, double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
        this.resultado = (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    public String toString() {
        return "Nome: " + nome +
                " | RA: " + ra +
                " | Idade: " + idade +
                " | Sexo: " + sexo +
                " | Média: " + media +
                " | Resultado: " + resultado;
    }

}