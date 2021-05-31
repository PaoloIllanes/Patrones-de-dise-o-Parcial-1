package abstractFactory.ejercicio;

public class Client {

    public static void main (String [] argsss){

        FactoryArtefactos.make("microondas").showData();
        FactoryArtefactos.make("televisor").showData();
        FactoryArtefactos.make("radio").showData();
        FactoryArtefactos.make("batidora").showData();
        FactoryArtefactos.make("refrigerador").showData();



    }

}
