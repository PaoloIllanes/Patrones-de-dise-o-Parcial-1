package builder.ejercicio;

public class PaqueteNormal extends BuilderPaquete {


    @Override
    public void buildGaseosas() {
        paquete.setGaseosas("1 refresco");

    }

    @Override
    public void buildChocolates() {
        paquete.setChocolates("no cuenta con chocolates");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("pipocas en envase normal");
    }



}
