public class Secretarias extends Funcionario{
    private int num_ramal;

    //construtor:
    Secretarias(String nome,float salario, int num_ramal){
        super(nome, salario);
        this.num_ramal = num_ramal;
    }


    //métodos
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+getNome()+"\n Salário: "+getSalario()+" \nnum_ramal:"+num_ramal);
    }
}
