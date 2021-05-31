package abstractFactory.ejercicio;

public class Refrigerador implements IArtefacto{
    public int precio = 4000;
    @Override
    public void showData() {
        System.out.println("Refrigerador : "+ precio+ "Bs");

    }
}