package Lista5_Recursividade;
import java.util.Scanner;
public class Ex05_Multiplicacao {
    //5. Escreva uma função recursiva que retorne o resultado da multiplicação dos dois
    //parâmetros utilizando apenas o operador somas.
    public static int resMultiplicacao(int x, int y){
        if (x == 0 || y == 0)
            return 0;
        else if (y == 1) {
            return x;
        }
        else
            return x + resMultiplicacao(x, y-1);
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor, vezes;
        System.out.print("Informe um valor: ");
        valor = tec.nextInt();
        System.out.print("Informe quantas vezes o numero sera somado: ");
        vezes = tec.nextInt();
        System.out.println("Resultado de "+valor+" * "+vezes+" = "+resMultiplicacao(valor, vezes));
        tec.close();
    }
}
