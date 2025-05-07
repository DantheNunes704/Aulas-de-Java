public class Antigo extends Imovel{
    private double desconto;

    public Antigo(String endereco, Double preco)
    {
        super(endereco, preco);
        desconto = 300;
        setPreco(getPreco() - desconto);
    }
}
