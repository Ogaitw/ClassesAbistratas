package entities;

public abstract class Funcionario  extends  Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaSalario();
    }
    public abstract void calculaSalario ( );


}
