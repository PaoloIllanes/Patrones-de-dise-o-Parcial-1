package abstractFactory.ejercicio;

public class Batidora implements IArtefacto{
public int precio = 500;
    @Override
    public void showData() {
        System.out.println("Batidora : "+ precio+ "Bs");

    }
}
