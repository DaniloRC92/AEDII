package Lista5_Recursividade;

public class Ex01_OrdemInversa {
//    1. Escreva uma função recursiva que recebe um vetor de
//    comprimento N e o imprime na tela na ordem inversa de entrada.
    public static void vetor(int []v, int n){
        if (n == 0)
            return;
        System.out.println(v[n-1]);
        vetor(v, n-1);
    }
    public static void main(String[] args) {
        int [] vet = {1,2,3,4,5,6,7,8,9,10};
        vetor(vet, vet.length);
    }
}
