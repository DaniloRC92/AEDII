package Lista6_7_Ordenacao;

public class teste {
    public static void selectionsort(double[] vet){
        int menor;
        double temp;
        for (int fixo = 0; fixo < vet.length-1; fixo++){
            System.out.println();
            for (int rep = 0; rep < vet.length; rep++)System.out.print(vet[rep] + " | ");
            System.out.println();
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
    }
    public static double [] insertsort(double[] vet){
        double chave;
        int i;

        for (int aux = 1; aux < vet.length ; aux++){
            System.out.println();
            for (int rep = 0; rep < vet.length; rep++)System.out.print(vet[rep] + " | ");
            System.out.println();
            chave = vet[aux];
            i = aux - 1;
            while(i >= 0 && vet[i] > chave){
                vet[i+1] = vet[i];
                i = i - 1;
            }
            vet[i+1] = chave;
        }
        System.out.println();
        for (int rep = 0; rep < vet.length; rep++)System.out.print(vet[rep] + " | ");
        return vet;
    }

    public static void main(String[] args) {
        double[] vet = {15,32,98,0,45,10,2,1};
        selectionsort(vet);
        System.out.println();
        for (int rep = 0; rep < vet.length; rep++)System.out.print(vet[rep] + " | ");

        //insertsort(vet);
    }
}
