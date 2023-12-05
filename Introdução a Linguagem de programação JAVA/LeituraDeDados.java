import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the keyboard
        Scanner teclado = new Scanner(System.in);

        // Declare variables for two integers (a and b) and their sum
        int a;
        int b;
        int soma;

        // Prompt the user to input the value for variable a
        System.out.println("Informe o valor inteiro para a: ");
        // Read the integer input and assign it to variable a
        a = teclado.nextInt()

        // Prompt the user to input the value for variable b
        System.out.println("Informe o valor inteiro para b: ");
        // Read the integer input and assign it to variable b
        b = teclado.nextInt()

        // Calculate the sum of a and b
        soma = a + b;

        // Display the result (sum) to the user
        System.out.println("A soma de a+b vale: " + soma);

        // Close the Scanner to avoid resource leaks (not necessary in this case)
        teclado.close();
    }
}