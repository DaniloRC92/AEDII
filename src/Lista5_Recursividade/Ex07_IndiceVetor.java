package Lista5_Recursividade;
import java.util.*;
public class Ex07_IndiceVetor {
    //7. Escreva uma função recursiva que recebe um vetor como parâmetro e um valor k.
    //Caso o valor k exista no vetor, a função deverá retornar a sua posição, senão deverá
    //retornar -1.
    public static int retornaPosicao(int []vet, int k, int i){
        if (i >= vet.length)
            return -1;
        else if (vet[i] == k) {
            return i;
        }
        else{
            return retornaPosicao(vet, k, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int[] vetor = {1,2,3,4,5,6};
        int k;
        System.out.print("Informe o valor a ser procurado: ");
        k = tec.nextInt();
        System.out.println("O valor "+k+" está na posição "+retornaPosicao(vetor,k,0));
        tec.close();
    }
}
