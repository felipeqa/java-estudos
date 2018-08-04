public class TestaConversão {

    public static void main(String[] args) {
        double salario = 1234.50;
        // Fazer casting
        int valor = (int) salario;
        System.out.println(valor);
        // Exemplo long => usa o l no final
        long numeroGrande = 3232323232l;
        short valorPequeno = 2131;
        byte umByte = 127;
        float pontoFlutuante = 3.14f;

        double valor1 = 0.1;
        double valor2 = 0.2;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
