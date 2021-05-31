package prototype.ejercicio;


public class Client {


    public static void main (String []args){
        Television television1 = new Television();
        television1.setSerial(1234567890);
        System.out.println("OBJ1 > "+"television : serial -> "+ television1.getSerial());

        Television television2 = (Television) television1.clone();
        television2.setSerial(726348695);
        System.out.println("OBJ2 > "+"television : serial -> "+ television1.getSerial());

        Television television3 = (Television) television1.clone();
        television3.setSerial(937450432);
        System.out.println("OBJ2 > "+"television : serial -> "+ television1.getSerial());

        Television television4 = (Television) television1.clone();
        television4.setSerial(287639287);
        System.out.println("OBJ2 > "+"television : serial -> "+ television1.getSerial());

        Television television5 = (Television) television1.clone();
        television5.setSerial(234677754);
        System.out.println("OBJ2 > "+"television : serial -> "+ television1.getSerial());



    }
}
