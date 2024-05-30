package Lista5_Recursividade;
public class Ex02_Divisao {
//  2. Escreva uma função recursiva divide(A,B) para calcular a
//  divisão inteira de A por B utilizando apenas subtrações
    public static int resDivisao(int m, int n){
        if (n > m)
            return 0;
        return 1 + resDivisao(m-n, n);
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(resDivisao(m, n));
    }
}
