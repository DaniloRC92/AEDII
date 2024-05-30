package Lista5_Recursividade;
import java.util.*;
public class Ex03_Digitos {
    //3. Escreva uma função recursiva que recebe um número inteiro e
    // retorne o número de dígitos. Exemplo. N = 50 – saída deverá
    // ser 2.
    public static int retornaDigito(int n){
        if (n < 10)
            return 1;
        return 1 + retornaDigito(n/10);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Informe um número aleatorio: ");
        int numero = tec.nextInt();
        System.out.println("Numero de digitos: "+retornaDigito(numero));
    }
}
