package abstractFactory.ejercicio;

public class Radio implements IArtefacto{
    public int precio = 200;
    @Override
    public void showData() {
        System.out.println("Radio : "+ precio+ "Bs");

    }
}

