package abstractFactory.ejercicio;

public class Television implements IArtefacto{
    public int precio=2000 ;
    @Override
    public void showData() {
        System.out.println("Television : "+ precio + "Bs");

    }
}