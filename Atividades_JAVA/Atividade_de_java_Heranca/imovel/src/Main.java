import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Novo N1 = new Novo("Rua José", 5000);
        Novo N2 = new Novo("Rua Maria", 6000);
        Novo N3 = new Novo("Rua Jason", 7000);
        Antigo A1 = new Antigo("Rua Ana", 3000d);
        Novo A2 = new Novo("Rua Beatriz", 2000);
        Novo A3 = new Novo("Rua Ygor", 1000);

        ArrayList<Imovel> lista = new ArrayList<>();

        lista.add(N1);
        lista.add(N2);
        lista.add(N3);
        lista.add(A1);
        lista.add(A2);
        lista.add(A3);

        for(Imovel p: lista)
        {
            if(p instanceof Novo)
            {
                System.out.println("Imóvel novo: " + p.getPreco());
            }
        }
    }
}