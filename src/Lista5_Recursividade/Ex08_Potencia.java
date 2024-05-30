package Lista5_Recursividade;
import java.util.*;
public class Ex08_Potencia {
    //8.Crie uma função recursiva na linguagem JAVA que recebe como parâmetro um número
    //e seu expoente e calcule a potência desse número a esse expoente.
    public static int calculoPotencia(int b, int e){
        if (b == 0){
            return 0;
        } else if (e == 0) {
            return 1;
        } else {
            return b * calculoPotencia(b, e-1);
        }
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int base, expoente;
        System.out.print("Dê um valor a base: ");
        base = tec.nextInt();
        System.out.print("Informe um valor para o expoente: ");
        expoente = tec.nextInt();
        System.out.println(base+"^"+expoente+" = "+calculoPotencia(base, expoente));
        tec.close();
    }
}
