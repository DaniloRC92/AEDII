package Lista4_AlgoritmosPesquisa;
import java.util.*;
public class Listas {

    static ArrayList<String> lsNomes = new ArrayList<>();
    static Scanner tec = new Scanner(System.in);
    static String pesq = "Neymar";

    public static ArrayList<String> addNomesEx01(ArrayList<String> lsNomes){
        // 1. Cria um procedimento que receba um ArraList<String> como parâmetro e adicione N
        // nomes inseridos pelo usuário até que o usuário digite a FLAG “STOP” para encerrar a
        // inserção. DICA Lstring.add("Neymar"); // Adiciona o nome Neymar na lista

        String flag;

        System.out.print("Informe o nome a ser adicionado na lista para putaria (DIGITE STOP PARA PARAR): ");
        flag = tec.nextLine();

        while (!flag.equalsIgnoreCase("Stop")){

            lsNomes.add(flag);

            System.out.print("Informe o nome a ser adicionado na lista para putaria (DIGITE STOP PARA PARAR): ");
            flag = tec.nextLine();
        }

        return lsNomes;
    }

    public static void printNomesEx02(ArrayList<String> lsNomes){
        //2. Crie um procedimento que receba como parâmetro um ArraList<String> e imprima
        //todos os valores da lista. DICA Lstring.get(5);//acessando a posição 5 da lista

        System.out.println();
        lsNomes.forEach(System.out::println);

    }

    public static boolean buscaSequencialEx03(ArrayList<String> lsNomes, String pesq){
        /*
        * 3. Cria uma função booleana que receba como parâmetro a lista de nomes e uma String e
            faça o algoritmo de busca sequencial iterativa na Lista e retorne verdadeiro caso encontre
            o ou falso em caso contrário.
        */

        boolean resp = false;

        for (int aux = 0; aux < lsNomes.size() && !resp; aux++){
            if (lsNomes.get(aux).equalsIgnoreCase(pesq)){
                resp = true;
            }
        }
        System.out.println();
        if (resp == true){
            System.out.println("NOME ENCONTARDO!!!!");
        }
        else {
            System.out.println("NOME NAO ENCONTRADO");
        }
        System.out.println(resp);
        return resp;
    }

    public static boolean buscaBinariaEx04(ArrayList<String> lsNomes, String pesq){

        /*4. Cria uma função booleana que receba como parâmetro a lista de nomes e uma String e
             faça o algoritmo de busca binária iterativa na Lista e retorne verdadeiro caso encontre-o
             ou falso em caso contrário. Você deve ordenar a lista com uso da biblioteca nativa
             JAVA. DICA import java.util.Collections;
             Collections.sort(Lstring); // método nativo que ordena em ordem crescente */

        boolean resp = false;
        Collections.sort(lsNomes);
        int dir = lsNomes.size() - 1, esq = 0, meio;

        while (esq <= dir){
            meio = (esq + dir) / 2;

            if (pesq.equalsIgnoreCase(lsNomes.get(meio))){
                resp = true;
                esq = lsNomes.size();
            } else if (pesq.compareToIgnoreCase(lsNomes.get(meio)) > 0) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }
        System.out.println();
        if (resp == true){
            System.out.println("NOME ENCONTARDO!!!!");
        }
        else {
            System.out.println("NOME NAO ENCONTRADO");
        }
        System.out.println(resp);

        return resp;
    }

    public static void remocaoSequencialEx05(ArrayList<String> lsNomes, String pesq){

        /*5. Cria um procedimento que receba a lista de String e uma string com um nome, e faça
        uma busca sequencial na lista e remova a primeira ocorrência do nome, se caso este seja
        encontrado. Dica Lstring.remove(7);//remova o oitavo elemento da lista */

        for (int aux = 0; aux < lsNomes.size(); aux++){
            if (lsNomes.get(aux).equalsIgnoreCase(pesq)){
                lsNomes.remove(aux);
            }
        }
        printNomesEx02(lsNomes);
    }

    public static void remocaoBinariaEx06 (ArrayList<String> lsNomes, String pesq){

        /*6. Cria um procedimento que receba a lista de String e uma string com um nome, e faça
        uma busca binária na lista e remova a primeira ocorrência do nome, se caso este seja
        encontrado. Dica Lstring.remove(7);//remova o oitavo elemento da lista */

        Collections.sort(lsNomes);
        int dir = lsNomes.size() - 1, esq = 0, meio;

        while (esq <= dir){
            meio = (esq + dir) / 2;

            if (pesq.equalsIgnoreCase(lsNomes.get(meio))){
                esq = lsNomes.size();
                lsNomes.remove(meio);
            } else if (pesq.compareToIgnoreCase(lsNomes.get(meio)) > 0) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }
        printNomesEx02(lsNomes);
    }

    public static void main(String[] args) {
        addNomesEx01(lsNomes);
        printNomesEx02(lsNomes);
        //buscaSequencialEx03(lsNomes, pesq);
        buscaBinariaEx04(lsNomes, pesq);
        //remocaoSequencialEx05(lsNomes, pesq);
        remocaoBinariaEx06(lsNomes, pesq);
    }
}
