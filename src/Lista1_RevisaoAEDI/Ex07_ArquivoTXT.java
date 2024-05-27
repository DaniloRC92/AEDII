package Lista1_RevisaoAEDI;
import java.io.*;
import java.util.Scanner;

public class Ex07_ArquivoTXT {
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    int op = 0;

    /*Menu para execução da questão a ou b*/
    while (op != 3) {
        System.out.println("1- Escrever em um arquivo TXT");
        System.out.println("2- Ler um arquivo e mostrar a soma dos numeros");
        System.out.println("3- Finalizar Programa");
        System.out.print(">>>");
        op = tec.nextInt();
        tec.nextLine();
        //Finaliza o programa
        if (op == 3){
            System.out.println("Fim do programa!");
            tec.close();
        }
        else {
            switch (op) {
                case 1 -> escreverNum();
                case 2 -> lerArq_Soma();
                default -> System.out.println("OPÇÃO INVALIDA");
            }
        }
    }
    tec.close();
}

    //Metodo para escrever os numeros em um Arquivo
    public static void escreverNum(){
        try {
            Scanner tec = new Scanner(System.in);
            String num;

            System.out.println("Digite os numeros escolhidos para serem colocados no arquivo");
            num = tec.nextLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Ex07_testTXT"));
            bufferedWriter.write(num);
            bufferedWriter.close();

            System.out.println("Concluido!");
            System.out.println();

        }catch (IOException e){
            System.out.println("Erro ao escrever: "+ e.getMessage());
        }
    }

    //Metodo para ler e imprimir a soma dos numeros presentes no arquivo
    public static void lerArq_Soma(){

        try {
            Scanner tec = new Scanner(System.in);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Ex07_testTXT"));

            String lin = bufferedReader.readLine();
            String[] numeros = lin.split(" ");
            double soma = 0;

            for (String numSTR : numeros){
                double numero = Double.parseDouble(numSTR);
                soma += numero;
            }

            System.out.println("Soma = " + soma);
            System.out.println();

            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
