public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    //construtor
    ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento){
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    //gets e sets

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    //Métodos
    public void calcularNovoSaldo(){
        setSaldo(getSaldo()+diaRendimento);
    }
}
