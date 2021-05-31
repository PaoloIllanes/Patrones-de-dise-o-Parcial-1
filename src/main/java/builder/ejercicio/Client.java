package builder.ejercicio;


public class Client {

    public static void main (String[] args){
        Director director = new Director();
        PaqueteMega paqueteMega = new PaqueteMega();
        PaqueteMediano paqueteMediano = new PaqueteMediano();
        PaqueteNormal paqueteNormal = new PaqueteNormal();

        director.setBuilder(paqueteMega);
        director.buildProduct();

        Paquete paquete1 = director.getProduct();
        paquete1.showData();

        director.setBuilder(paqueteMediano);
        director.buildProduct();

        Paquete paquete2 = director.getProduct();
        paquete2.showData();

        director.setBuilder(paqueteNormal);
        director.buildProduct();

        Paquete paquete3 = director.getProduct();
        paquete3.showData();

    }

}
