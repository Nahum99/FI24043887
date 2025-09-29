
public class Inverso {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor ingrese un número natural como argumento.");
            return;
        }

        int numero = Integer.parseInt(args[0]);
        int inverso = invertir(numero, 0);

        System.out.println(numero + " → " + inverso);
    }

    public static int invertir(int n, int resultado) {
        if (n == 0) {
            return resultado;
        }
        int residuo = n % 10;
        int cociente = n / 10;
        return invertir(cociente, resultado * 10 + residuo);
    }
}

