import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leia.nextInt();
        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException exception){
            System.out.println("Número dois deve ser maior que número um.");
        }
    }
    public static void contar (int num1, int num2) throws ParametrosInvalidosException {

        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = num2 - num1;
        if (num1 == num2) {
            System.out.println(0);
        }
        for(int i=0; i < contagem; i++) {
            System.out.println("Número "+ (i+1));
        }
    }
    static class ParametrosInvalidosException extends Exception {   
    }
}
