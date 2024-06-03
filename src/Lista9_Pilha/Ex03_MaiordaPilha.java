package Lista9_Pilha;
import java.util.*;
public class Ex03_MaiordaPilha {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try {
            Pilha pilha = new Pilha();
            for(int aux = 0; aux < 5; aux++){
                pilha.inserir(aux);
                pilha.mostrar();
                System.out.println();
            }
            System.out.println("Maior elemento da Pilha: "+pilha.maior(pilha));
            tec.close();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
