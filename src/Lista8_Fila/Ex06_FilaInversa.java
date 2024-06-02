package Lista8_Fila;
public class Ex06_FilaInversa {
//    6. Crie um método que inverta os elementos da fila.
    public static void main(String[] args) {
        try {
            Fila fila = new Fila();
            for (int aux = 0; aux < 5; aux++){
                fila.ex01_inserir(aux);
                fila.ex01_mostrar();
                System.out.println();
            }
            System.out.println();
            fila.ex06_inverter();
            fila.ex01_mostrar();

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
