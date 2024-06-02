package Lista8_Fila;
public class Ex03_Media {
//    3. Crie um método que calcule a média dos elementos da fila.
    public static void main(String[] args) {
        try {
            Fila fila = new Fila();
            for (int aux = 0; aux < 5; aux++){
                fila.ex01_inserir(aux);
                fila.ex01_mostrar();
                System.out.println();
            }
            System.out.println();
            System.out.println("Amplitude = "+fila.ex02_amplitude(fila));
            System.out.println();
            System.out.println("Soma dos elementos da fila = "+fila.somaFila(fila));
            System.out.println();
            System.out.println("Media = "+fila.ex03_media(fila));

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
