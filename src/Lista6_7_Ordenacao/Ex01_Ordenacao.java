package Lista6_7_Ordenacao;
import java.util.*;
public class Ex01_Ordenacao {

    // Método para gerar um vetor de valores aleatórios double dentro de um intervalo

    public static double[] gerarAleatorio(int tamanho, double minimo, double maximo) {
        double[] vetorAleatorio = new double[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetorAleatorio[i] = minimo + (maximo - minimo) * random.nextDouble(); // valores dentro do intervalo
        }
        return vetorAleatorio;
    }

    // Método para gerar um vetor decrescente com aleatorização da parte fracionada

    public static double[] gerarDecrescenteAleatorio(int tamanho) {
        double[] vetorDecrescenteAleatorio = new double[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            double valor = tamanho - i; // gera o valor decrescente

            // Aleatoriza a parte fracionada

            double parteFracionadaAleatoria = random.nextDouble();
            valor += parteFracionadaAleatoria;

            vetorDecrescenteAleatorio[i] = valor;
        }
        return vetorDecrescenteAleatorio;
    }

    //------------------------------------BUBBLE SORT------------------------------------------------//
    public static double[] bubblesort(double[] vet) {
        int t = vet.length;
        double temp;
        for (int aux = t - 1; aux > 0; aux--) {
            for (int i = t - 1; i > t - aux - 1; i--) {
                if (vet[i] < vet[i - 1]) {
                    temp = vet[i];
                    vet[i] = vet[i - 1];
                    vet[i - 1] = temp;
                }
            }
        }
        return vet;
    }
    //------------------------------------SELECTION SORT----------------------------------------------//
    public static double[] selectionsort(double[] vet){
        int menor;
        double temp;
        for (int fixo = 0; fixo < vet.length-1; fixo++){
            menor = fixo;
            for (int aux = menor + 1; aux < vet.length; aux++){
                if (vet[aux] < vet[menor]){
                    menor = aux;
                }
            }
            if (menor != fixo){
               temp = vet[fixo];
               vet[fixo] = vet[menor];
               vet[menor] = temp;
            }
        }
        return vet;
    }
    //------------------------------------INSERTION SORT----------------------------------------------//
    public static double[] insertsort(double[] vet){
        double chaveTemp; // Armazena o valor temporario durante a comparação
        int i;
        for (int aux = 1; aux < vet.length; aux++){
            chaveTemp = vet[aux];
            i = aux - 1;
            while(i >= 0 && vet[i] > chaveTemp){
                vet[i+1] = vet[i];
                i--;
            }
            vet[i+1] = chaveTemp;
        }
        return vet;
    }
    //------------------------------------MERGE SORT----------------------------------------------//
    public static double[] leftHalf(double[] vet){ //Metodo para dividir a parte esquerda do vetor
        int size1 = vet.length / 2;
        double[] left = new double[size1];
        for (int aux = 0; aux < size1; aux++){
            left[aux] = vet[aux];
        }
        return left;
    }

    public static double[] rightHalf(double[] vet){
        int size1 = vet.length / 2;
        int size2 = vet.length - size1;
        double[] right = new double[size2];
        for (int aux = 0; aux < size2; aux++){
            right[aux] = vet[aux + size1];
        }
        return right;
    }

    public static void merge(double[] result, double[] left, double[] right){
        //Metodo para fundir as partes esquerda e direta do vetor ordenado
        int i1 = 0; //Indice para a parte esquerda
        int i2 = 0; //Indice para a parte direita
        for(int aux = 0; aux < result.length; aux++){
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])){
                result[aux] = left[i1];
                i1++;
            } else {
                result[aux] = right[i2];
                i2++;
            }
        }
    }

    public static void mergesort(double[] vet){
        if (vet == null)
            return;
        else if (vet.length > 1) {
            double[] left = leftHalf(vet);
            double[] right = rightHalf(vet);

            mergesort(left);
            mergesort(right);

            merge(vet,left,right);
        }
    }
    //------------------------------------QUICK SORT----------------------------------------------//
    public static void swap(double[] vet, int i, int j){
        double temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;
    }

    public static void quicksort(double[] vet, int esq, int dir){
        int i = esq, j = dir;
        double pivo = vet[(dir + esq) / 2];
        while (i <= j){
            while (vet[i] < pivo) i++;
            while (vet[j] > pivo) j--;
            if (i <= j){
                swap(vet, i, j);
                i++;
                j--;
            }
        }
        if (esq < j)
            quicksort(vet, esq, j);
        else if (i < dir)
            quicksort(vet, i, dir);
    }
    //------------------------------------SHELL SORT----------------------------------------------//
    public static void shellsort(double[] vet){
        int i, j, h = 1;
        double value;

        do {
            h = 3 * h + 1;
        }while (h < vet.length);

        do {
            h = h / 3;
            for (i = h; i < vet.length; i++){
                value = vet[i];
                j = i - h;
                while (j>=0 && value < vet[j]){
                    vet[j + h] = vet[j];
                    j = j - h;
                }
                vet[j + h] = value;
            }
        }while(h > 1);
    }
    //------------------------------------HEAP SORT----------------------------------------------//
    public static void heapify(double[] vet, int n, int i){
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < n && vet[esq] > vet[maior]){
            maior = esq;
        } else if (dir < n && vet[dir] > vet[maior]) {
            maior = dir;
        } else if (maior != i) {
            double swap = vet[i];
            vet[i] = vet[maior];
            vet[maior] = swap;

            heapify(vet, n, maior);
        }
    }
    public static void heapsort(double[] vet){
        int n = vet.length;

        //Construção do max-heap
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(vet, n, i);
        }
        for (int i = n - 1; i >= 0; i--){
            double temp = vet[0];
            vet[0] = vet[i];
            vet[i] = temp;

            heapify(vet, i, 0);
        }
    }
    public static void main(String[] args) {
        double[] vet = gerarDecrescenteAleatorio(30000);
        //double[] vet = gerarAleatorio(30000, 1, 50000);

        //bubblesort(vet);
        //selectionsort(vet);
        //insertsort(vet);
        //mergesort(vet);
        //quicksort(vet, 0, vet.length-1);
        //shellsort(vet);
        heapsort(vet);

        long startTime = System.nanoTime();

        //bubblesort(vet);
        //selectionsort(vet);
        //insertsort(vet);
        //mergesort(vet);
        //quicksort(vet, 0, vet.length-1);
        //shellsort(vet);
        heapsort(vet);

        long endTime = System.nanoTime();

        long elapsedTimeInMillis = (endTime - startTime);// Calcula o tempo decorrido em milissegundos

        System.out.println("Tempo decorrido: " + elapsedTimeInMillis + " nanosegundos");
    }
}
