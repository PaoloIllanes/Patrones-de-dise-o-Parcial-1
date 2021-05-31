package abstractFactory.ejercicio;

public class Microondas implements IArtefacto{
    public int precio = 1500;
    @Override
    public void showData() {
        System.out.println("Microondas : "+ precio+ "Bs");

    }
}