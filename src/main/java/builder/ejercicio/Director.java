package builder.ejercicio;

public class Director {
    private BuilderPaquete builder;

    public Paquete getProduct() {
        return builder.getPaquete();
    }

    public void setBuilder(BuilderPaquete builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createPaquete();
        this.builder.buildChocolates();
        this.builder.buildPipocas();
        this.builder.buildGaseosas();

    }
}
