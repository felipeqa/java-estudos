import jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants;

public class TestaPontoFlutuante {

    public static void main(String[] args){
        double salario;
        salario = 1234.50;
        System.out.println("Meu salário é " + salario);

        double idade = 37;

        System.out.println("Minha idade " +  idade);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        double novaTentativa = 5 / 2;
        System.out.println(novaTentativa);

        double novaTentativaUm = 5 / 2.0;
        System.out.println(novaTentativaUm);

        double novaTentativaDois = 5.0 / 2;
        System.out.println(novaTentativaDois);
    }
}
