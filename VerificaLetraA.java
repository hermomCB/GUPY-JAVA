import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String lowerCaseInput = input.toLowerCase();

        int count = 0;

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == 'a') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string fornecida.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string fornecida.");
        }

        scanner.close();
    }
}
