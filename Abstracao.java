package abstracao;

// Classe Principal
public class Abstracao {
    public static void main(String[] args) {
        
        // Exemplos a serem usados
        Endereco ad1 = new Endereco("Rua 20",160);
        Endereco ad2 = new Endereco("Rua 30",600);
        Endereco ad3 = new Endereco("Rua 40",430);

        Funcionario f1 = new Funcionario("Joao","210.934.124-33",99201271);
        Funcionario f2 = new Funcionario("Maria","748.773.214-78",99208264);
        Funcionario f3 = new Funcionario("Admoester","029.483.122-94",99202256);
        
        //Atribuir cada endereco a um funcionario;
        f1.alteraEndereco(ad1);
        f2.alteraEndereco(ad2);
        f3.alteraEndereco(ad3);
        
        //Exercicio 1.12 - Atribuir cargo, salario e departamento;
        f1.alteraCargo("Supervisor");
        f1.setSalario(1734.90);
        f1.alteraDepartamento("Vendas");

        f2.alteraCargo("Supervisor");
        f2.setSalario(1734.90);
        f2.alteraDepartamento("Compras");

        f3.alteraCargo("Gerente");
        f3.setSalario(2934.77);
        f3.alteraDepartamento("Vendas");
        
        // Mostrar os dados
        System.out.println(f1.mostraDados());
        System.out.println(f2.mostraDados());
        System.out.println(f3.mostraDados());
        
    }
}
