package entities;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaSalario() {
        this.salario =  salario + salario*0.2;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }
}
