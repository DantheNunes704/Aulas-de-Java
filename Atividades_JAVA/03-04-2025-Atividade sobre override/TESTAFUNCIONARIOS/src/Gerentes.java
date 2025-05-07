public class Gerentes extends Funcionario{
    private String nome_usuario;
    private String senha;

    @Override
    public void calculaBonificacao()
    {
        float sub = getSalario();
        sub *= 1.3;
        setSalario(sub);
    }

    @Override
    public void mostrados()
    {
        System.out.println("Nome: " + getNome() + "\nSalario: " + getSalario());
        System.out.println("Nome: " + nome_usuario + "\nSenha: " + senha);
    }
}
