class Producto{

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
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
        public double calculaValorTotal() {
        return precio * stock;
    }

    public boolean hayStock() {
        return stock > 0;
    }
    public void reducirStock(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException(
                "Las unidades deben ser mayores que cero."
            );
    }

    if (unidades > stock) {
        throw new IllegalArgumentException(
            "No hay suficiente stock disponible."
        );
    }

    setStock(stock - unidades);
}

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Precio: " + precio + " €" +
               ", Stock: " + stock;
    }


}