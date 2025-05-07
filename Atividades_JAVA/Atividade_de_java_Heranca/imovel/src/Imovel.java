public class Imovel {
    private String endereco;
    private double preco;

    //gets e sets


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //construtor
    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    //método
    public void imprimeDados()
    {
        System.out.println("Endereço: " + endereco + "\nPreco: " + preco);
    }
}
