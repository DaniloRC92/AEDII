package Lista9_Pilha;
public class CelulaPilha {
    private int elemento;
    private CelulaPilha prox;
    public CelulaPilha(){ this(0);}
    public CelulaPilha(int x){
        this.elemento = x;
        this.prox = null;
    }
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public CelulaPilha getProx() {
        return prox;
    }
    public void setProx(CelulaPilha prox) {
        this.prox = prox;
    }
}
