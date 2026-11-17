
public class Main {

    public static void main(String[] args) {

        // Crear productos
        Producto producto1 = new Producto("Ordenador", 750.0, 5);
        Producto producto2 = new Producto("Ratón", 20.0, 0);

        System.out.println("PRODUCTO 1");
        System.out.println(producto1);

        System.out.println("Valor total del stock: "
                + producto1.calculaValorTotal() + " €");

        System.out.println("Hay stock? " + producto1.hayStock());

        System.out.println();

        System.out.println("PRODUCTO 2");
        System.out.println(producto2);

        System.out.println("Valor total del stock: "
                + producto2.calculaValorTotal() + " €");

        System.out.println("¿Hay stock? " + producto2.hayStock());

        producto2.setStock(10);

        System.out.println();
        System.out.println("Después de modificar el stock:");

        System.out.println(producto2);
        System.out.println("¿Hay stock? " + producto2.hayStock());


        // 1. Mostrar los productos disponibles
        System.out.println();
        System.out.println("PRODUCTOS DISPONIBLES");

        if (producto1.hayStock()) {
            System.out.println(producto1);
        }

        if (producto2.hayStock()) {
            System.out.println(producto2);
        }


        // 2. Calcular el precio de tres unidades de un producto
        System.out.println();
        System.out.println("PRECIO DE TRES UNIDADES");

        System.out.println("Tres ordenadores cuestan: "
                + producto1.calcularPrecioTotal(3) + " €");


        // 3. Calcular el total de una compra con dos productos diferentes
        System.out.println();
        System.out.println("TOTAL DE LA COMPRA");

        double totalCompra = producto1.calcularPrecioTotal(1) + producto2.calcularPrecioTotal(2);

        System.out.println("1 ordenador y 2 ratones cuestan: " + totalCompra + " €");


        // 4. Mostrar qué producto tiene el precio más alto
        System.out.println();
        System.out.println("PRODUCTO MAS CARO");

        if (producto1.esMasCaroQue(producto2)) {
            System.out.println("El producto más caro es: " + producto1.getNombre());
        } else if (producto2.esMasCaroQue(producto1)) {
            System.out.println("El producto más caro es: " + producto2.getNombre());
        } else {
            System.out.println("Los dos productos tienen el mismo precio.");
        }

    }
}
