package Lista3_ExceptionCreation;
import java.util.*;
public class Ex04_Main {
    // 4- Escreva um programa para verificar se um triângulo é Equilátero, Isósceles ou
//    Escaleno. Este método pertence à classe Triangulo e possui a seguinte assinatura: int
//    determinarTipo(). O retorno do método é um inteiro que representa os seguintes casos:
//    Equilátero (0), Isósceles (1), Escaleno (2).A classe triangulo deve possuir um construtor que recebe
//    três parâmetros do tipo double, representando as dimensões dos lados do triângulo. Este construtor deve tratar
//    casos excepcionais, como lados negativos, lados com valor zero e a desigualdade triangular não
//    atendida. Em todos esses possíveis casos excepcionais, deve ser lançada uma exceção
//    chamada TrianguloInvalidoError(). Escreva um programa principal com pelo menos 4 casos de testes (Equilátero (0),
//    Isósceles (1), Escaleno (2) e TrianguloInvalidoError()
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
         int op = 1;
         double lado1, lado2, lado3;

         while (op == 1){

             System.out.println("Escolha a opção desejada: ");
             System.out.println("1- Determinar tipo do triagulo;");
             System.out.println("2- Sair");
             System.out.print(">>> ");
             op = tec.nextInt();

             if (op == 1){
                 System.out.print("Digite um valor para o lado 1: ");
                 lado1 = tec.nextDouble();

                 System.out.print("Digite um valor para o lado 2: ");
                 lado2 = tec.nextDouble();

                 System.out.print("Digite um valor para o lado 3: ");
                 lado3 = tec.nextDouble();

                 try {
                     Ex04_Triangulo triangulo = new Ex04_Triangulo(lado1, lado2, lado3);

                     int type = triangulo.determinarTipo();

                     switch (type){
                         case 0:
                             System.out.println("O triangulo é Equilátero");
                             System.out.println();
                             break;
                         case 1:
                             System.out.println("O triangulo é Isósceles");
                             System.out.println();
                             break;
                         case 2:
                             System.out.println("O triangulo é Escaleno");
                             System.out.println();
                             break;
                     }

                 }catch (Ex04_TrianguloInvalidoError trianguloInvalidoError){
                     System.err.println(trianguloInvalidoError.getMessage());
                     break;
                 }
             }
             else if (op == 2){
                 System.out.println("Fim do Programa!");
                 break;
             }
             else {
                 System.out.println("Opção invalida! Tente novamente");
             }
         }

         tec.close();
    }
}
