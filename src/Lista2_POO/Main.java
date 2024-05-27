package Lista2_POO;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Funcionario pessoa2 = new Funcionario();
        Professor pessoa3 = new Professor();
        Professor pessoa4 = new Professor();

        pessoa1.setNome("Joao");
        pessoa1.setSobrenome("Silva");

        pessoa2.setNome("Maria");
        pessoa2.setSobrenome("Medeiros");
        pessoa2.setSalario(1750.00);

        pessoa3.setNome("Jose");
        pessoa3.setSobrenome("Souza");
        pessoa3.setSalario(500.00);

        pessoa4.setNome("Ana");
        pessoa4.setSobrenome("Oliveira");
        pessoa4.setSalario(1500.00);

        System.out.println("Nome da Pessoa 1: "+ pessoa1.getNomeCompleto());
        System.out.println();
        System.out.println("Nome da Pessoa 2: "+pessoa2.getNomeCompleto());
        System.out.println();
        System.out.println("Nome da Pessoa 3: "+ pessoa3.getNomeCompleto());
        System.out.println();
        System.out.println("Nome da Pessoa 4: "+ pessoa4.getNomeCompleto());

        System.out.println();

        System.out.println("Primeira parcela do salario de "+ pessoa2.getNomeCompleto()+": R$ "
                +pessoa2.getSalarioPrimeiraParcela()+ "; Segunda parcela do salario: R$ "
                +pessoa2.getSalarioSegundaParcela());

        System.out.println("Primeira parcela do salario de "+ pessoa3.getNomeCompleto()+": R$ "
                +pessoa3.getSalarioPrimeiraParcela()+ "; Segunda parcela do salario: R$ "
                +pessoa3.getSalarioSegundaParcela());

        System.out.println("Primeira parcela do salario de "+ pessoa4.getNomeCompleto()+": R$ "
                +pessoa4.getSalarioPrimeiraParcela()+ "; Segunda parcela do salario: R$ "
                +pessoa4.getSalarioSegundaParcela());

    }
}
