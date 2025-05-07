public class Gerentes extends Funcionario{
    private String nome_usuario;
    private String senha;

    //construtor
    Gerentes(String nome_usuario, float salario, String senha){
        super(nome_usuario, salario);
        this.senha = senha;
    }

    //gets e sets


    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void calculaBonificacao()
    {
        float sub = getSalario();
        sub *= 1.3;
        setSalario(sub);
    }


    @Override
    public void mostraDados(){
        System.out.println("Nome: "+getNome()+"\n Salário: "+getSalario()+"\n Senha: "+senha);
    }
}
