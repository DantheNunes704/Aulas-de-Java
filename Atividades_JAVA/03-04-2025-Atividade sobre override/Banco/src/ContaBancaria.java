public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    //construtor
    ContaBancaria(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //gets e sets

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public void sacar(double menos){
        if(saldo -menos > 0) {
            this.saldo -= menos;
        }
    }
    public void depositar(double mais){
            this.saldo += mais;
    }
}
