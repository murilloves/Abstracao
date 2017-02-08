package abstracao;

public class Funcionario {
    private String cpf;
    private int matricula;
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;
    private Endereco endereco;

    private static int qtdFuncionarios;

    public Funcionario(String nome, String cpf, int matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    
    public double aumentaSalario(double percentual){
        return this.salario = this.salario + this.salario * percentual/100;
    }
    
    public void alteraCargo(String novoCargo){
        this.cargo = novoCargo;
    }
    
    public void alteraDepartamento(String novoDepartamento){
        this.departamento = novoDepartamento;
    }
    
    public String mostraDados(){
        String str = ("Matricula - "+matricula+" - "+nome+" - Departamento: "+departamento+" - Cargo: "+cargo);
        return str;
    }



    public void alteraEndereco(Endereco novoEndereco){
        this.endereco = novoEndereco;
    }

    public void setSalario(Double novoSalario){
        this.salario = novoSalario;
    }
}
