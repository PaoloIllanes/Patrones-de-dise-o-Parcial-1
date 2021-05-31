package builder.ejercicio;


public abstract class BuilderPaquete {
    protected Paquete paquete;

    public Paquete getPaquete() {
        return paquete;
    }

    public void createPaquete(){
        paquete= new Paquete();
    }

    public abstract void buildGaseosas();
    public abstract void buildChocolates();
    public abstract void buildPipocas();

}
