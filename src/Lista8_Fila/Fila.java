package Lista8_Fila;
public class Fila {
    private Celula primeiro, ultimo;
    public Fila(){
        primeiro = new Celula();
        ultimo = primeiro;
    }
    //-------------------------------------------EXERCICIO 1-------------------------------------------//
    public void ex01_inserir(int x){
        ultimo.setProx(new Celula(x));
        ultimo = ultimo.getProx();
    }
    public int ex01_remover() throws Exception{
        Celula temp;
        int elemento;
        if (primeiro == ultimo){
            throw new Exception("ERRO!!!!!");
        }
        temp = primeiro;
        primeiro = primeiro.getProx();
        elemento = primeiro.getElemento();
        temp.setProx(null);
        temp = null;
        return elemento;
    }
    public void ex01_mostrar(){
        for (Celula aux = primeiro.getProx(); aux != null; aux = aux.getProx()){
            System.out.print(aux.getElemento()+" | ");
        }
    }
    //-------------------------------------------EXERCICIO 2-------------------------------------------//
    public int maior() throws Exception{
        int maior = Integer.MIN_VALUE;
        if (primeiro == ultimo){ throw new Exception("ERRO!"); }
        maior = primeiro.getProx().getElemento();
        Celula i = primeiro.getProx().getProx();
        while (i != null){
            if (i.getElemento() > maior){ maior = i.getElemento(); }
            i = i.getProx();
        }
        return maior;
    }
    public int menor() throws Exception{
        int menor = Integer.MAX_VALUE;
        if (primeiro == ultimo){ throw new Exception("ERRO!"); }
        menor = primeiro.getProx().getElemento();
        Celula i = primeiro.getProx().getProx();
        while (i != null){
            if (i.getElemento() < menor){ menor = i.getElemento(); }
            i = i.getProx();
        }
        return menor;
    }
    public int ex02_amplitude(Fila f) throws Exception{
        int menor, maior ,amplitude;
        menor = menor();
        maior = maior();
        amplitude = maior - menor;
        return amplitude;
    }
    //-------------------------------------------EXERCICIO 3-------------------------------------------//
    public int somaFila(Fila f){
        int s = 0;
        for (Celula c = primeiro.getProx(); c != null; c = c.getProx()){ s += c.getElemento(); }
        return s;
    }
    public double ex03_media(Fila f) throws Exception {
        double media;
        media = (double) somaFila(f) / (ex02_amplitude(f) + 1);
        return media;
    }
    //-------------------------------------------EXERCICIO 4-------------------------------------------//
    public void ex04_inserirFuraFila(int x, int pos){
        int count = 0;
        Celula temp = primeiro.getProx();
        while(temp != ultimo.getProx()){
            count++;
            if(count == pos){
                temp.setElemento(x);
            }
            temp = temp.getProx();
        }
    }
    //-------------------------------------------EXERCICIO 5-------------------------------------------//
    public int ex05_menorRecursivo(Fila f) throws Exception {
        if (primeiro == ultimo){
            throw new Exception("ERRO!!!");
        }
        return ex05_menorRecursivo(primeiro.getProx());
    }
    public int ex05_menorRecursivo (Celula i) throws Exception{
        int menor = Integer.MAX_VALUE;
        if (i == null){
            return menor;
        }
        menor = ex05_menorRecursivo(i.getProx());
        return Math.min(i.getElemento(), menor);
    }

    //-------------------------------------------EXERCICIO 6-------------------------------------------//
    public void ex06_inverter(){
        Celula fim = ultimo;
        while (primeiro.getProx() != fim){
            Celula nova = new Celula(primeiro.getProx().getElemento());
            nova.setProx(fim.getProx());
            fim.setProx(nova);
            Celula temp = primeiro.getProx();
            primeiro.setProx(temp.getProx());
            nova = temp = null;
            if (ultimo == fim){
                ultimo = ultimo.getProx();
            }
        }
        fim = null;
    }
}
