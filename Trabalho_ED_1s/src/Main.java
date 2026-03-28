import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Aluno[] alunos = new Aluno[100];
    static int total = 0;

    public static void cadastrar() {

        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("RA: ");
        int ra = sc.nextInt();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Média: ");
        double media = sc.nextDouble();

        alunos[total++] = new Aluno(nome, ra, idade, sexo, media);

        System.out.println("Aluno cadastrado!");
    }

    public static void ordenarNome() {

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {

                if (alunos[j].nome.compareTo(alunos[j + 1].nome) > 0) {
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--- ORDENADO POR NOME ---");
        for (int i = 0; i < total; i++) {
            System.out.println(alunos[i]);
        }
    }

    public static void ordenarRA() {

        for (int i = 0; i < total - 1; i++) {

            int max = i;

            for (int j = i + 1; j < total; j++) {
                if (alunos[j].ra > alunos[max].ra) {
                    max = j;
                }
            }

            Aluno temp = alunos[i];
            alunos[i] = alunos[max];
            alunos[max] = temp;
        }

        System.out.println("\n--- ORDENADO POR RA (DECRESCENTE) ---");
        for (int i = 0; i < total; i++) {
            System.out.println(alunos[i]);
        }
    }

    public static void aprovados() {

        // ordenar por nome primeiro
        ordenarNome();

        System.out.println("\n--- APROVADOS ---");

        for (int i = 0; i < total; i++) {
            if (alunos[i].resultado.equals("Aprovado")) {
                System.out.println(alunos[i]);
            }
        }
    }
    public static void buscaSequencial(int ra) {
        for (int i = 0; i < total; i++) {
            if (alunos[i].ra == ra) {
                System.out.println(alunos[i]);
                return;
            }
        }
        System.out.println("Aluno não encontrado");
    }

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n===== SISTEMA ACADÊMICO =====");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Relatório por Nome (A-Z)");
            System.out.println("3 - Relatório por RA (Decrescente)");
            System.out.println("4 - Aprovados por Nome");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> ordenarNome();
                case 3 -> ordenarRA();
                case 4 -> aprovados();
                case 5 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
    }
}