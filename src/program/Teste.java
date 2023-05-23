package program;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;

public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor= new Desenvolvedor("Touya", 12000 );
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}