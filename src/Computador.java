public class Computador {

    String color;
    String marca;
    String almacenamiento;


    public static void main(String[] arg) {

        Computador computador1 = new Computador();

        computador1.color = "negro";
        computador1.marca = "lenovo";
        computador1.almacenamiento = "8 GB ";

        System.out.println("color del computador es:" + computador1.color);
        System.out.println("marca del computador" + computador1.marca);
        System.out.println("almacenamiento del computador" + computador1.almacenamiento);

        Computador computador2 = new Computador();

        computador2.color = "azul";
        computador2.marca = "HP";
        computador2.almacenamiento = " 6 GB";

        System.out.println("color del coputador" + computador2.color);
        System.out.print("marca del computador" + computador2.marca);
        System.out.println("almacenamiento del computador" + computador2.almacenamiento);


        Computador computador3 = new Computador();

        computador3.color = "rojo";
        computador3.marca = "apple";
        computador3.almacenamiento = "13 GB";

        System.out.println("color del computador" + computador3.color);
        System.out.println("marca del computador" + computador3.marca);
        System.out.println("almacenamiento del computador" + computador3.almacenamiento);


    }


}
