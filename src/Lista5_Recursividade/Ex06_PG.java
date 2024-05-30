package Lista5_Recursividade;
import java.util.Scanner;
public class Ex06_PG {
    //6. Escreva uma função recursiva que calcule o n-ésimo termo de uma progressão
    //geométrica onde o primeiro termo e a razão são informados pelo usuário.
    public static int progressaoGeometrica(int n1, int r, int n){
        if (n == 1)
            return n1;
        return r * progressaoGeometrica(n1, r, n-1);
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n1, razao, n;
        System.out.print("Informe o primeiro termo da Progressão: ");
        n1 = tec.nextInt();
        System.out.print("Informe a razão da Progressão: ");
        razao = tec.nextInt();
        System.out.print("Informe o indice do numero a ser calculado: ");
        n = tec.nextInt();
        System.out.println("O numero na posição "+n+" da PG é = "+progressaoGeometrica(n1,razao, n));
        tec.close();
    }
}
