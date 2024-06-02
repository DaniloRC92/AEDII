package Lista8_Fila;
public class Ex01_Teste {
//    1. Implemente o tipo abstrato de fila com o tipo inteiro com uso do cabeça de fila ou
//    sentinela e os métodos: enfileirar, remover da fila e mostrar todos os elementos da fila.
    public static void main(String[] args) throws Exception {
        try {
            Fila f1 = new Fila();
            for(int aux = 0; aux < 5; aux++){
                f1.ex01_inserir(aux);
                f1.ex01_mostrar();
                System.out.println();
            }
            System.out.println();
            f1.ex01_mostrar();
            f1.ex01_remover();
            System.out.println();
            f1.ex01_mostrar();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
