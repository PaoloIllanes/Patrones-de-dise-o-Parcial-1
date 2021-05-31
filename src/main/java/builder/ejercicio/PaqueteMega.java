package builder.ejercicio;

public class PaqueteMega extends BuilderPaquete {
    @Override
    public void buildGaseosas() {
    paquete.setGaseosas("3 vasos de gaseosas extragrades con recarga ilimitada");

}

    @Override
    public void buildChocolates() {
        paquete.setChocolates("2 chocolates grandes");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("pipocas extragrandes");
    }
}