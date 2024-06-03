package Lista9_Pilha;
import java.util.*;
public class Ex04_MostrarRecursivo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try {
            Pilha pilha = new Pilha();
            for(int aux = 0; aux < 5; aux++){
                pilha.inserir(aux);
            }
            pilha.mostrarRecursivo(pilha);
            tec.close();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
