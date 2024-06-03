package Lista9_Pilha;

public class Pilha {
    // 1. Crie uma pilha flexível com tipo inteiro com os métodos: inserir, remover, tamanho
    //da pilha, booleano que verifica se a pilha está vazia, mostre todos os elementos da pilha.
    private CelulaPilha topo;
    private int tamanho;
    public Pilha(){
        topo = null;
    }
    public void inserir(int x){
        CelulaPilha tmp = new CelulaPilha(x);
        tmp.setProx(topo);
        topo = tmp;
        tmp = null;
        tamanho++;
    }
    public int remover() throws Exception{
        if (vazio()){
            throw new Exception("Erro! A pilha está vazia!");
        } else {
            int elemento = topo.getElemento();
            CelulaPilha tmp = topo;
            topo = topo.getProx();
            tmp.setProx(null);
            tamanho--;
            return elemento;
        }
    }
    public void mostrar(){
        System.out.println("[ ");
        for (CelulaPilha i = topo; i != null; i = i.getProx()){
            System.out.println(i.getElemento() + " ");
        }
        System.out.println("]");
    }
    public boolean vazio(){ return (topo == null); }
    public int getTamanho() { return tamanho; }

    /*-----------------------------------Exercicio 2-----------------------------------*/
    //Faça um método RECURSIVO que retorna soma dos elementos contidos na pilha
    public int somaRecursivo(Pilha p) throws Exception{
        int soma = 0;
        if (vazio()){
             throw new Exception("Erro!");
        }
        soma = somaRecursivo(topo);
        return soma;
    }
    private int somaRecursivo(CelulaPilha i){
        int s = 0;
        s += i.getElemento();
        if (i.getProx() == null){
            return s;
        }
        return s + somaRecursivo(i.getProx());
    }
    /*-----------------------------------Exercicio 3-----------------------------------*/
    // Faça um método que retorna o maior elemento contido na mesma.
    public int maior(Pilha p) throws Exception{
        int maior = Integer.MIN_VALUE;
        if (vazio()){
            throw new Exception("ERRO! PILHA VAZIA");
        }
        maior = topo.getElemento();
        CelulaPilha i = topo.getProx();

        while(i != null){
            if (i.getElemento() > maior){
                maior = i.getElemento();
            }
            i = i.getProx();
        }
        return maior;
    }
    /*-----------------------------------Exercicio 4-----------------------------------*/
    // Faça um método RECURSIVO para mostrar os elementos da pilha na ordem em que
    //eles serão removidos.
    public void mostrarRecursivo(Pilha p) throws Exception{
        if (vazio()){
            throw new Exception("ERRO! PILHA VAZIA");
        }
        mostrarRecursivo(topo);
    }
    public int mostrarRecursivo(CelulaPilha i) throws Exception{
        if (i == null){
            return 0;
        } else{
            System.out.println(i.getElemento());
            return mostrarRecursivo(i.getProx());
        }
    }
}
