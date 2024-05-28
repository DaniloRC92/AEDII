package Lista3_ExceptionCreation;
import java.util.*;
public class Ex03_Fatorial {
//    3- Escreve o código para lançar um objeto de exceção EntradaInvalida se o número
//    recebido pela função fatorial for maior do que 20. Você deve definir a classe e
//    implementar o código necessário.
    public static int fatorial(int num) throws Ex03_EntradaInvalida{
        //Verifica se o parametro é maior do que 20
        if (num > 20){
            throw new Ex03_EntradaInvalida("ERRO: Número maior do que 20!!!");
        }else{
            int fat = 1;
            int n = 1;

            while (++n <= num){
                fat *= n;
            }
            return fat;
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n;

        try {
            //Solicita ao usuario um valor para calcular o fatorial
            System.out.print("Insira um valor para calcular o fatorial: ");
            n = tec.nextInt();

            //Printa o valor do fatorial do numero digitado
            System.out.println("Fatorial de "+ n +" = " + fatorial(n));

        }catch (Ex03_EntradaInvalida entradaInvalida){
            System.err.println(entradaInvalida.getMessage());
        }
    }
}
