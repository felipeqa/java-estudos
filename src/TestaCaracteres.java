public class TestaCaracteres {

    public static void main(String[] args) {
        // char sempre aspas simples e equivale a um numera que represnta a letra na tabela ASC
        char letra = 'a';
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor);
        // casting da operação char + int
        valor = (char) (valor + 1);
        System.out.println(valor);

        String frase = "Alura cursos online de tecnologia";
        System.out.println(frase);

        frase = frase + 2020;
        System.out.println(frase);

    }
}
