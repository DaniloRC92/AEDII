package Lista3_ExceptionCreation;
import java.util.*;
public class Ex02_DivisionBy0 {
    //2- Modifique o código abaixo para que ele lance uma exceção quando acontecer uma divisão por zero.
    public static double division(int a, int b){
        if (b == 0){
            throw new Ex02_Exception0("Erro: Divisão por zero não é permitida!");
        }else {
            return (double) a/b;
        }
    }

    public static int[] dataInput(){
        //Entrada de dados pelo usuario
        Scanner tec = new Scanner(System.in);

        //Cria um vetor para armazenar os valore que serão dividos
        int [] values = new int[2];

        System.out.print("Insira um valor para o dividendo: ");
        values[0] = tec.nextInt();
        System.out.print("Insira um valor para o divisor: ");
        values[1] = tec.nextInt();
        System.out.println();

        return values;
    }

    public static void main(String[] args) {
        try {
            //Chamada da função dataInput
            int[] input = dataInput();

            //Chamada da função division, passando como paramentros o valores presentes no vetor input
            double d = division(input[0], input[1]);

            System.out.println(input[0] + " / "+ input[1] + " = "+d);

        }catch (Ex02_Exception0 exception0){
            System.err.println(exception0.getMessage());
        }
    }
}
