package Lista8_Fila;
public class Celula{
    private int elemento;
    private Celula prox;
    public Celula(){
        this(0);
    }
    public Celula(int x) {
        this.elemento = x;
        this.prox = null;
    }

    public int getElemento() {
        return elemento;
    }
    public Celula getProx() {
        return prox;
    }

    public void setElemento(int elemento) { this.elemento = elemento; }

    public void setProx(Celula prox) {
        this.prox = prox;
    }
}
