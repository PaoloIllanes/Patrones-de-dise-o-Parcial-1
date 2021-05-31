package abstractFactory.ejercicio;

public class FactoryArtefactos  {

    public static IArtefacto make(String typeProduct){
        IArtefacto product;

        switch (typeProduct){
            case "microondas":
                product= new Microondas();
                break;
            case "television":
                product = new Television();
                break;
            case "radio":
                product = new Radio();
                break;
            case "batidora":
                product = new Batidora();
                break;
            default:
                product= new Refrigerador();
                break;
        }
        return product;
    }

}
