package builder.ejercicio;

public class PaqueteMediano extends BuilderPaquete {


    @Override
    public void buildGaseosas() {
        paquete.setGaseosas("1 chocolate");

    }

    @Override
    public void buildChocolates() {
        paquete.setChocolates("2 vasos de refrescos");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("pipocas grandes");
    }
}
