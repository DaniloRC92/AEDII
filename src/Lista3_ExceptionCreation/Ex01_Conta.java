package Lista3_ExceptionCreation;

public class Ex01_Conta {

    private double saldo;
    private String nome;
    private String cpf;
    private double limite;

    public Ex01_Conta(double saldo, String nome, String cpf, double limite) {
        this.saldo = saldo;
        this.nome = nome;
        this.cpf = cpf;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = (saldo < 0) ? 0:saldo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String getCpf() {
//        return cpf;
//    }
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposita (double valor){
        setSaldo((valor < 0) ? saldo : saldo + valor);
    }

    public void saca(double valor) throws Ex01_SaldoInsuficienteException {
        //saldo é suficiente para saque
        if (getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
        }
        else if (valor > getSaldo() && getSaldo() + getLimite() >= valor) {
            setLimite(getLimite() + (getSaldo()- valor));
            setSaldo(0);
        }
        else {
            throw new Ex01_SaldoInsuficienteException("Seu saldo e: " + this.saldo +
                    "\nVoce tentou sacar: "+ valor + "\nSeu limite é de: " + this.limite);
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nSaldo: " + this.saldo +
                "\nLimite: "+ this.limite;
    }
}
