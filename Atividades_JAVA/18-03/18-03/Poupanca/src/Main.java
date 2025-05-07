
public class Main {
    public static void main(String[] args) {
        Poupanca poupanca1 = new Poupanca(2000);
        Poupanca poupanca2 = new Poupanca(3000);

        Poupanca.setTaxaJurosAnual(0.03);

        System.out.println("a1) " + poupanca1.calcularJurosMensais());
        System.out.println("a2) " + poupanca2.calcularJurosMensais());

        poupanca1.setSaldo(5000);
        poupanca2.setSaldo(1000);

        Poupanca.setTaxaJurosAnual(0.04);

        System.out.println("b1) " + poupanca1.calcularJurosMensais());
        System.out.println("b2) " + poupanca2.calcularJurosMensais());

        System.out.println("c1) " + poupanca1.getSaldo());
        System.out.println("c2) " + poupanca2.getSaldo());
    }
}

// 18-03-25 (Mayra e Danthe)