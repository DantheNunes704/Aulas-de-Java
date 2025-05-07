public class RegistroAcad {

    private String nome;
    private static int numMatricula = 0;
    private int codCurso;
    private double percCobra;

    public RegistroAcad(String nome, int codCurso, double percCobra) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.percCobra = percCobra;
        numMatricula +=1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumMatricula() {
        return numMatricula;
    }

    public static void setNumMatricula(int numMatricula) {
        RegistroAcad.numMatricula = numMatricula;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public double getPercCobra() {
        return percCobra;
    }

    public void setPercCobra(double percCobra) {
        this.percCobra = percCobra;
    }
}
