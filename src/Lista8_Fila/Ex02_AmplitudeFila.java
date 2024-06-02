package Lista8_Fila;
public class Ex02_AmplitudeFila {
//    2. Crie um método que retorne a amplitude da fila, ou seja, diferença entre o maior e o
//    menor elemento da fila.
    public static void main(String[] args) {
        try {
            Fila fila = new Fila();
            for (int aux = 0; aux < 5; aux++){
                fila.ex01_inserir(aux);
                fila.ex01_mostrar();
                System.out.println();
            }
            System.out.println();
            System.out.println("A amplitude da fila é = "+fila.ex02_amplitude(fila));
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
