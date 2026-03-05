public class Productos {
    private int id;
    private String nombre;
    private String categoria;
    private float precio;
    private int stock;

    public Productos(int id, String nombre, String categoria, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + categoria + "," + precio + "," + stock;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public float getPrecio() { return precio; }
    public int getStock() { return stock; }
}