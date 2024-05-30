package Lista5_Recursividade;
public class Ex09_MenorValor {
    //9. Construa uma função recursiva na linguagem JAVA que recebe por parâmetro um vetor
    //de inteiros e retorne o elemento de menor valor.
    public static int menorValor(int[] vet, int i, int menorV) {
        if (i == vet.length) {
            return menorV;
        } else if (vet[i] < menorV) {
            menorV = vet[i];
        }
        return menorValor(vet, i+1, menorV);
    }
    public static void main(String[] args) {
        int[] vetor = {9,3,1,6,7,13, -1};
        System.out.println("O menor valor no vetor é: "+menorValor(vetor,0, Integer.MAX_VALUE));
    }
}
