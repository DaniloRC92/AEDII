package Lista8_Fila;
public class Ex04_FuraFila {
//    4. Crie um método fura fila, ou seja, recebe como parâmetro um elemento e a posição
//    que ele deve ficar.
    public static void main(String[] args) {
        try {
            Fila fila = new Fila();
            for (int aux = 0; aux < 5; aux++){
                fila.ex01_inserir(aux);
                fila.ex01_mostrar();
                System.out.println();
            }
            System.out.println();
            fila.ex04_inserirFuraFila(92, 1);
            fila.ex01_mostrar();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
