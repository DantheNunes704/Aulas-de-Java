public class Main {
    public static void main(String[] args) {
        ContaBancaria C1 = new ContaBancaria("Rogério", 2436, 27000d);
        ContaEspecial CE1 = new ContaEspecial("Rogério", 5636, 2256d, 60);
        ContaPoupanca CP1 = new ContaPoupanca("Rogério", 2986, 2790d, 78000);

        System.out.println("conta bancária: "+C1.getCliente()+" "+C1.getNumConta()+" "+C1.getSaldo());
        System.out.println("conta especial: "+CE1.getCliente()+" "+CE1.getNumConta()+" "+CE1.getSaldo()+" "+ CE1.getLimite());
        System.out.println("conta poupança: "+CP1.getCliente()+" "+CP1.getNumConta()+" "+CP1.getSaldo()+" "+CP1.getDiaRendimento());

        C1.depositar(200);
        CE1.depositar(400);
        CP1.depositar(800);

        System.out.println("\nconta bancária: "+C1.getCliente()+" "+C1.getNumConta()+" "+C1.getSaldo());
        System.out.println("conta especial: "+CE1.getCliente()+" "+CE1.getNumConta()+" "+CE1.getSaldo()+" "+ CE1.getLimite());
        System.out.println("conta poupança: "+CP1.getCliente()+" "+CP1.getNumConta()+" "+CP1.getSaldo()+" "+CP1.getDiaRendimento());

        C1.sacar(200);
        CE1.sacar(400);
        CP1.sacar(800);

        System.out.println("\nconta bancária: "+C1.getCliente()+" "+C1.getNumConta()+" "+C1.getSaldo());
        System.out.println("conta especial: "+CE1.getCliente()+" "+CE1.getNumConta()+" "+CE1.getSaldo()+" "+ CE1.getLimite());
        System.out.println("conta poupança: "+CP1.getCliente()+" "+CP1.getNumConta()+" "+CP1.getSaldo()+" "+CP1.getDiaRendimento());
    }

}