import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        double faturamento = 0;

        Comum C1 = new Comum();
        Comum C2 = new Comum();
        Comum C3 = new Comum();
        VIP V1 = new VIP();
        VIP V2 = new VIP();
        VIP V3 = new VIP();

        ArrayList<Ingresso> lista = new ArrayList<>();

        lista.add(C1);
        lista.add(C2);
        lista.add(C3);
        lista.add(V1);
        lista.add(V2);
        lista.add(V3);

        for(Ingresso p: lista)
        {
            System.out.println("========");
            p.imprimeValor();

            faturamento += p.getValor();
        }

        System.out.println("Valor Total: " + faturamento);
    }

}