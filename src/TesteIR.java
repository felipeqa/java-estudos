public class TesteIR {

    public static void main(String[] args) {

        double salario = 4664.0;
        double minimoAliquotaInicial = 1900.0;
        double maximoAliquotaInicial = 2800.0;
        double minimoAliquotaIntermediaria = 2800.01;
        double maximoAliquotaIntermediaria = 3751.0;
        double minimoAliquotaMaxima = 3751.01;
        double maximaAliquotaMaxima = 4664.00;
        double deducaoMinima = 142.00;
        double deducaoIntermediaria = 350;
        double deducaoMaxima = 636;


        if (salario >= minimoAliquotaInicial && salario <= maximoAliquotaInicial ){
            System.out.println("Sua aliquota é de 7.5%!");
            System.out.println("E sua dedução pode ser de até " + deducaoMinima);
        } else if (salario >= minimoAliquotaIntermediaria && salario <= maximoAliquotaIntermediaria){
            System.out.println("Sua aliquota é de 15%%!");
            System.out.println("E sua dedução pode ser de até " + deducaoIntermediaria);
        } else if (salario >= minimoAliquotaMaxima && salario <= maximaAliquotaMaxima) {
            System.out.println("Sua aliquota é de 22.5!");
            System.out.println("E sua dedução pode ser de até " + deducaoMaxima);
        }
    }
}
