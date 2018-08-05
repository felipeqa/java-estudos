public class TestaMultiplos3VersaoDois {
    public static void main(String[] args) {
        for(int contador = 1; (contador * 3) < 100 ; contador ++) System.out.println(contador * 3);
        for(int contador = 0; contador < 100 ; contador += 3) System.out.println(contador);
    }
}
