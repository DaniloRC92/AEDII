package Lista8_Fila;
public class Ex07_FilaSemSentinela {
    private Celula primeiro;
    private Celula ultimo;
    public Ex07_FilaSemSentinela(){
        this.primeiro = null;
        this.ultimo = null;
    }
    public void ex07_inserir(int x){
        Celula nova = new Celula(x);
        if (primeiro == null){
            primeiro = nova;
        } else {
            ultimo.setProx(nova);
        }
        ultimo = nova;
    }
    public int ex07_remover() throws Exception{
        int elemento;
        if (primeiro == null){
            throw new Exception("ERRO: Fila vazia!");
        }
        elemento = primeiro.getElemento();
        primeiro = primeiro.getProx();
        if (primeiro == null){
            ultimo = null;
        }
        return elemento;
    }
    public void ex07_mostrar(){
        Celula i = primeiro;
        while (i != null){
            System.out.print(i.getElemento()+" | ");
            i = i.getProx();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try {
            Ex07_FilaSemSentinela f = new Ex07_FilaSemSentinela();
            for (int aux = 0; aux < 5; aux++) {
                f.ex07_inserir(aux);
                f.ex07_mostrar();
            }
            System.out.println();
            f.ex07_mostrar();
            f.ex07_remover();
            System.out.println();
            f.ex07_mostrar();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
