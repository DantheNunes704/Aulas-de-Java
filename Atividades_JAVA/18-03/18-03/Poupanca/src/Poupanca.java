public class Poupanca {
    private static double taxaJurosAnual;
    private double saldo;

    //Construtor
    public Poupanca(double saldo) {
        this.saldo = saldo;
    }


    //gets e sets
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        Poupanca.taxaJurosAnual = taxaJurosAnual;
    }


    //métodos
    public double calcularJurosMensais()
    {
        return this.saldo*taxaJurosAnual/12;
    }

    public static void modificaTaxaJuro(double num)
    {
        taxaJurosAnual = num;
    }
}
