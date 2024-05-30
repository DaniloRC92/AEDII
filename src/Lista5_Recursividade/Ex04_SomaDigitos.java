package Lista5_Recursividade;
import java.util.Scanner;
public class Ex04_SomaDigitos {
    //4. Escreva uma função recursiva que recebe um número inteiro e retorne a soma dos
    //seus dígitos. Exemplo = N = 45. Saída deverá ser 9.
    public static int somaDigitos(int n){
        if (n < 10)
            return n;
        return n % 10 + somaDigitos(n/10);
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Informe um número aleatorio: ");
        int numero = tec.nextInt();
        System.out.println("Soma dos digitos: "+somaDigitos(numero));
    }
}
