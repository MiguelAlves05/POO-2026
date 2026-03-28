import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestaDesenvolvedor {
    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calculaBonus());
    }
    public static void main(String[] args){
        Junior jr = new Junior("Clayton", "Vitor", "Java",4000);
        exibeDados(jr);

        Pleno pl = new Pleno(10, "Arthur", "Java",6000);
        exibeDados(pl);

        Senior sn = new Senior(30000, "Miguel", "Java",9000);
        exibeDados(sn);

        // vetor desenvolvedor
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        // adicionar os desenvolvedores no vetor
        desenvolvedores.add(jr);
        desenvolvedores.add(sn);
        desenvolvedores.add(pl);

    }
}
