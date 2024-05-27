package Lista1_RevisaoAEDI;
import java.util.Scanner;
public class Ex02_Fibonacci {
    public static void main(String[] args) {

        int n;
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o valor de n: ");
        n = tec.nextInt();

        for (int aux = 0; aux <= n; aux++){
            System.out.print(fibonacci(aux) + " ");
        }
    }
    private static int fibonacci (int aux){
        if (aux <= 1){
            return aux;
        } else {
            return fibonacci(aux - 1) + fibonacci(aux - 2);
        }
    }
}
