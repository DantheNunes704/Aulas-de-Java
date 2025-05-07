public class Ingresso {
    protected double valor;

    //gets e sets
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //método
    public void imprimeValor()
    {
        System.out.println("Valor do ingresso: " + getValor());
    }
}
