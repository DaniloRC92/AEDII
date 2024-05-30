package Lista5_Recursividade;

import java.util.Scanner;

public class Ex10_Notacao {
    //Dada a notação implemente uma função recursiva em JAVA
    //t(0) = 1;
    //t(1) = 2;
    //t(n) = t(n-1) * t(n-2) - t(n-1)
    public static int resNotacao(int n){
        if (n == 0){
            return 1;
        } else if (n == 1) {
            return 2;
        }else{
            return resNotacao(n-1) * resNotacao(n - 2) - resNotacao(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n;
        System.out.print("Informe um valor de n para a função t: ");
        n = tec.nextInt();
        System.out.print("t("+n+") = "+resNotacao(n));
        tec.close();
    }
}
