package Lista2_POO;

public class Professor extends Funcionario{
    public Professor(String nome, String sobrenome, int matricula, int salario) {
        super(nome, sobrenome, matricula, salario);
    }
    public Professor(){}
    public double getSalarioPrimeiraParcela(){
        return getSalario();
    }
    public double getSalarioSegundaParcela(){
        return 0;
    }
}
