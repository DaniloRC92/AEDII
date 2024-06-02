package Lista8_Fila;
public class Ex05_MenorRecursivo {
    public static void main(String[] args) {
//        5. Crie um método recursivo que retorne o menor elemento da fila.
        try {
            Fila fila = new Fila();
            for (int aux = 0; aux < 5; aux++){
                fila.ex01_inserir(aux);
                fila.ex01_mostrar();
                System.out.println();
            }
            System.out.println();
            System.out.println("Menor valor da fila = " +fila.ex05_menorRecursivo(fila));

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
