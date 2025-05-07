//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerentes G1 = new Gerentes();
        Telefonistas T1 = new Telefonistas();
        Secretarias S1 = new Secretarias();

        S1.setSalario(3000);
        G1.setSalario(4500);
        T1.setSalario(90);

        System.out.println("Secretária salário: " + S1.getSalario());
        System.out.println("Gerente salário: " + G1.getSalario());
        System.out.println("Telefonista salário: " + T1.getSalario());

        S1.calculaBonificacao();
        T1.calculaBonificacao();

        System.out.println("\n\nApos bonificacao:");
        System.out.println("Secretária salário: " + S1.getSalario());
        System.out.println("Telefonista salário: " + T1.getSalario());

        G1.calculaBonificacao();

        System.out.println("\n\nApos bonificacao:");
        System.out.println("Gerente salario: " + G1.getSalario());
    }
}