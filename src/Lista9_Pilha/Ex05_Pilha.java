package Lista9_Pilha;
import java.util.*;
public class Ex05_Pilha {
    //Refaça uma nova classe pilha com uma célula sentinela (cabeça do topo) conforme a
    //ilustração seguinte;
    private final CelulaPilha topo;
    private int tamanho;
    public Ex05_Pilha(){
        topo = new CelulaPilha();
    }
    public void inserir(int y){
        CelulaPilha tmp = new CelulaPilha(y);
        tmp.setProx(topo.getProx());
        topo.setProx(tmp);
        tmp = null;
        tamanho++;
    }
    public void mostrar(){
        System.out.println("[ ");
        for (CelulaPilha i = topo; i != null; i = i.getProx()){
            System.out.println(i.getElemento() + " ");
        }
        System.out.println("]");
    }
    public int remover(int y) throws Exception{
        if (vazio()){
            throw new Exception("Erro! A pilha está vazia!");
        } else {
            int elemento = topo.getProx().getElemento();
            CelulaPilha tmp = topo.getProx();
            topo.setProx(topo.getProx().getProx());
            tmp.setProx(null);
            tamanho--;
            return elemento;
        }
    }
    public boolean vazio(){ return (topo.getProx() == null); }
    public int getTamanho() { return tamanho; }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try {
            Ex05_Pilha pilha = new Ex05_Pilha();
            for(int aux = 0; aux < 5; aux++){
                pilha.inserir(aux);
                pilha.mostrar();
                System.out.println();
            }
            pilha.remover(4);
            pilha.mostrar();
            tec.close();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
