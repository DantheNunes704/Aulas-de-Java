public class Novo extends Imovel{
    private double adicional;


    //construtor
    public Novo(String endereco, double preco)
    {
        super(endereco, preco);
        adicional = 300;
        setPreco(getPreco() + adicional);
    }

}
