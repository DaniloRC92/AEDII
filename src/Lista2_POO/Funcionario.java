package Lista2_POO;

public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        if (salario > 0){
            this.salario = salario;
        }
        else {
            System.err.println("ERRO: O salario nao pode ser negativo");
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
    }
    public Funcionario(){}
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        }
        else {
            System.err.println("ERRO: O salario nao pode ser negativo");
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
    }
    public double getSalarioPrimeiraParcela(){
        return this.salario * 0.6;
    }
    public double getSalarioSegundaParcela(){
        return this.salario * 0.4;
    }
}
