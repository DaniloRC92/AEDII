package Lista1_RevisaoAEDI;
import java.util.Scanner;

public class Ex04_MatrizTransposta {
    public static void main(String[] args) {
        int x, y;
        Scanner tec = new Scanner(System.in);

        //  Codigo para preencher a matriz automaticamente atraves do for

        System.out.print("Informe um valor para a dimensão X da matriz: ");
        x = tec.nextInt();
        System.out.print("Informe um valor para a dimensão Y da matriz: ");
        y = tec.nextInt();

        int[][] matriz = new int[x][y];

        for (int m = 0; m < x; m++) {
            for (int n = 0; n < y; n++) {
                matriz[m][n] = m + n;
            }
        }

//        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Matriz: ");
        imprimirMatriz(matriz);

        System.out.println("Matriz Transposta: ");
        imprimirMatriz(transposta(matriz));

        tec.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int m = 0; m < matriz.length; m++) {
            for (int n = 0; n < matriz[m].length; n++) {
                System.out.print(matriz[m][n] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int m = 0; m < linhas; m++) {
            for (int n = 0; n < colunas; n++) {
                transposta[n][m] = matriz[m][n];
            }
        }
        return transposta;
    }
}

