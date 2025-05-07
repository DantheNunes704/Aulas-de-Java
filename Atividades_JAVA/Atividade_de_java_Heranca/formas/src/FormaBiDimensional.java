public class FormaBiDimensional extends Forma{

    //construtor
    public FormaBiDimensional(float altura, float base)
    {
        this.altura = altura;
        this.base = base;
    }

    //métodos
    public float obeteAreaTriangulo()
    {
        return base*altura/2;
    }

    public float obeteAreaTriangulo()
    {
        return base*altura/2;
    }

    public float obeteAreaQuadrado()
    {
        return base*altura;
    }

    public float obeteAreaCirculo()
    {
        return pi*raio;
    }

}
