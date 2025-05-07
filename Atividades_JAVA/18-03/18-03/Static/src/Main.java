
public class Main {
    public static void main(String[] args) {

        RegistroAcad a1 = new RegistroAcad("Ana", 1, 1);
        RegistroAcad a2 = new RegistroAcad("Ana", 2, 2);
        RegistroAcad a3 = new RegistroAcad("Ana", 3, 3);
        RegistroAcad a4 = new RegistroAcad("André", 4, 4);
        RegistroAcad c1 = new RegistroAcad("Carlos", 5, 5);
        RegistroAcad d1 = new RegistroAcad("Daniel", 6, 6);
        RegistroAcad d2 = new RegistroAcad("Danthe", 7, 7);

        System.out.println("Total de Matrículados: " + RegistroAcad.getNumMatricula());

    }
}