public class ContaEspecial extends ContaBancaria{
    private float limite;

    //construtor
    ContaEspecial(String cliente, int numConta, double saldo, int limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    //gets e sets

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    //métodos
    @Override
    public void sacar(double menos){
        if(getSaldo()-menos > limite) {
            setSaldo(getSaldo()-menos);
        }
    }
}
