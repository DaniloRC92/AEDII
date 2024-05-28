package Lista3_ExceptionCreation;
import javax.swing.*;
public class Ex01_Banco {

//    1. Implemente o código a seguir e resolva as questões especificadas com utilização de
//    tratamento de exceção.
//    a) Adapte o código para resolver o problema de entrada inválida. Quando for
//    solicitada a entrada de um valor (double) e o usuário digitar valor inválido (a,u,&, etc.), a aplicação
//    deve exibir uma mensagem informando que foi digitado um valor errado e permitir que
//    o usuário digite o valor novamente. Dica: Exceção a ser tratada:
//    NumberFormatException(classe padrão java existente).
//    b) Adapte o código para tratar a exceção de tentativa de saque no limite concedido
//    pelo banco. Por exemplo, se o cliente tem saldo igual R$ 400,00 e o limite do
//    banco é igual a R$ 200,00, quando for tentar sacar R$ 500,00 ele deverá ser
//    informado que entrará no limite em R$ 100,00 (o saque deverá ser realizado
//    mesmo com a utilização do limite). Caso o cliente tente sacar acima do saldo mais
//    o limite (R$700,00, por exemplo), o tratamento dado deve ser o mesmo aplicado
//    no código acima. Obs1: Crie classe, caso ache conveniente. Obs2: suponha que o
//    limite do banco é sempre R$ 200,00. Obs3: Não é preciso reescrever todo o
//    código, somente a parte modificada.

    private static double typeDouble(String txt){
        boolean b = true;
        double d = 0;
        while (b){
            String userInput = JOptionPane.showInputDialog(txt);
            try {
                d = Double.parseDouble(userInput);
                b = false;
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage() +
                        "\nValor Invalido!!! \nEntre com um valor NUMERICO para prosseguir!");
            }
        }
        return d;
    }

    private static String typeString(String txt){
        return JOptionPane.showInputDialog(null, txt);
    }

    public static void main(String[] args) throws Ex01_SaldoInsuficienteException {
        //Obtem os dados
        String nome = typeString("Digite o nome do cliente");
        String cpf = typeString("Digite o CPF do cliente");
        double saldo = typeDouble("Digite o saldo inicial do cliente");

        Ex01_Conta c = new Ex01_Conta(saldo, nome, cpf, 200);

        double deposito = typeDouble("Digite o valor do deposito");
        c.deposita(deposito);

        double saque = typeDouble("Digite o valor do saque");

        try {
            c.saca(saque);
        }catch (Ex01_SaldoInsuficienteException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage() +
                    "\nOperação não realizada!");
        }

        JOptionPane.showMessageDialog(null, c.toString());
    }
}
