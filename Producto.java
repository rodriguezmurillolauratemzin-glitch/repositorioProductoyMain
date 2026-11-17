
class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre no puede ser nulo ni estar en blanco"
            );
        }
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException(
                "El precio no puede ser negativo"
            );
        }
        this.precio = precio;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException(
                "El stock no puede ser negativo"
            );
        }
        this.stock = stock;
    }

    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }

    public boolean esMasCaroQue(Producto otro) {
        return this.precio > otro.precio;
    }

    public double calcularPrecioTotal(int unidades) {
        return precio * unidades;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Precio: " + precio + " €" +
               ", Stock: " + stock;
    }

    public double calculaValorTotal() {
        return precio * stock;
    }

    public boolean hayStock() {
        return stock > 0;
    }
}
