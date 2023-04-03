import java.util.Scanner;

public class maior10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite número: ");
        num = entrada.nextInt();
        if (num>10) {
            System.out.println("O número digitado é maior que 10");

        }

    }
}
