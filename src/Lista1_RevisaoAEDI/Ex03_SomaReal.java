package Lista1_RevisaoAEDI;
import java.util.Scanner;
public class Ex03_SomaReal {
    public static void main(String[] args) {

        int num, den, n;
        double soma = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Insira um valor para N: ");
        n = tec.nextInt();

        for (int aux = 1; aux <= n; aux++){
            num = 1;
            if (aux == 1){
                den = 1;
            }
            else {
                den = aux;
            }
            soma += (double) num / den;
            System.out.println(soma);
        }

        System.out.println("Soma real = "+soma);
        tec.close();
    }
}
