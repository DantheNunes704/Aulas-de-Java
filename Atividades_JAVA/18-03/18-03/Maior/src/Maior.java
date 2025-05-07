public class Maior {

    //métodos
    public static int compara_5(int a, int b, int c, int d, int e){
        int num1 = Math.max(a, b);
        int num2 = Math.max(num1, c);
        int num3 = Math.max(num2, d);
        return Math.max(num3, e);
    }

    public static int compara_4(int a, int b, int c, int d){
        int num1 = Math.max(a, b);
        int num2 = Math.max(num1, c);
        return = Math.max(num2, d);

    }

}
