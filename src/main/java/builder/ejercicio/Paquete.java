package builder.ejercicio;

public class Paquete {

    private String chocolates;
    private String gaseosas;
    private String pipocas;


    public Paquete(){}

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }

    public String getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(String gaseosas) {
        this.gaseosas = gaseosas;
    }

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public void showData(){
        System.out.println("chocolates :"+chocolates);
        System.out.println("gaseosas :"+gaseosas);
        System.out.println("pipocas :"+pipocas);
        System.out.println("");
        System.out.println("**************************");
        System.out.println("");



    }
}
