import java.util.Scanner;

public class impressora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a cadeia de controle:");
        String input = leia.nextLine();
        System.out.println(printer_error(input));
    }

    public static String printer_error(String input) {
        int erro = 0;
        int caracter = input.length();

        for (int i = 0; i < input.length(); i++) {
            char caracterAtual = input.charAt(i);

            if (caracterAtual < 'a' || caracterAtual > 'm') {
                erro++;
            }
        }

        return erro+ "/" +caracter;
    }
}
