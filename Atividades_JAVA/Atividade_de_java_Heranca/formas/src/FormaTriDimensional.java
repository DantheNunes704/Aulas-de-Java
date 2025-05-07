public class FormaTriDimensional extends Forma{
    protected float profundidade;

    //métodos
    public float obterVolume()
    {
        return altura * base * profundidade;
    }

}
