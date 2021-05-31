package prototype.ejercicio;

public class Television implements ITelevision {


    private int pulgadas = 80;
    private String OS = "android";
    private Double OSVersion = 11.0;
    private boolean puertoHDMI = true;
    private int resolucion = 50;
    private int puertosUSB = 4;
    private boolean controlRemoto=true;
    private int serial;


    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }



    public Television(){

    }

    @Override
    public Object clone() {
        return null;
    }
}
