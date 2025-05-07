public class Telefonistas extends Funcionario{
    private String codigo_estacao;

    //construtor
    Telefonistas(String nome, float salario, String codigo_estacao){
        super(nome, salario);
        this.codigo_estacao = codigo_estacao;
    }

    //métodos
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+getNome()+"\n Salário: "+getSalario()+" \ncódigo estação:"+codigo_estacao);
    }
}
