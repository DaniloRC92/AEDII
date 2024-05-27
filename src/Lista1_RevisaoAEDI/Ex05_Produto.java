package Lista1_RevisaoAEDI;

public class Ex05_Produto {
    private int id;
    private String descricao;
    private float preco;
    private int quant;
    private int cont;

    public int getCont() {
        return cont;
    }
    public int getId() {
        return id;
    }
    public boolean emEstoque(){
        return (quant > 0);
    }
    public void setDescricao(String d) {
        this.descricao = d;
    }
    public void setPreco(float p) {
        this.preco = p;
    }
    public void setQuant(int q) {
        this.quant = q;
    }

    public Ex05_Produto(String d, float p, int q) {
        this.descricao = d;
        this.preco = p;
        this.quant = q;
    }

    @Override
    public String toString() {
        return "Ex05_Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quant=" + quant +
                '}';
    }
}

