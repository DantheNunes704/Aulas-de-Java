public class Funcionario {

    private String nome;
    private float salario;

    //Construtor:
    Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //métodos
    public void calculaBonificacao()
    {
        this.salario *= 1.1;
    }

    public void mostraDados(){
        System.out.println("Nome: "+this.nome+" Salário: "+this.salario);
    }
}
