public class Clientes {
    private int id;
    private String nombre;
    private String email;

    public Clientes(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + email;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}