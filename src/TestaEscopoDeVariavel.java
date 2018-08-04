public class TestaEscopoDeVariavel {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 12;
        int quantidadePessoas = 1;

        boolean acompanhado = quantidadePessoas >=2;


        if (idade >= 18 || acompanhado){
            System.out.println("Seja bem vindo");
        }else{
            System.out.println("Infelizmente vc não pode entrar");
        }

        // não compila


        // não compila

//        if (quantidadePessoas >= 2){
//            boolean acompanhado = true;
//        } else {
//            boolean acompanhado = false;
//        }
//
//        // acompanhado aqui não compila
//
//        if (idade >= 18 || acompanhado){
//            System.out.println("Seja bem vindo");
//        }else{
//            System.out.println("Infelizmente vc não pode entrar");
//        }

        // não compila

//        if (quantidadePessoas >= 2){
//            acompanhado = true;
//        } else {
//            acompanhado = false;
//        }
//
//
//
//        if (idade >= 18 || acompanhado){
//            System.out.println("Seja bem vindo");
//        }else{
//            System.out.println("Infelizmente vc não pode entrar");
//        }


        // falta de chaves para proteger o if
        double salario = 3300.0;

        if(salario < 2600.0)
            System.out.println("A sua aliquota é de 15%");
        System.out.println("Você pode deduzir até R$ 350");

        if(salario < 3750.0)
            System.out.println("A sua aliquota é de 22,5%");
        System.out.println("Você pode deduzir até R$ 636");
    }
}
