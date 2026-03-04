public class Pedidos {
    private int id;
    private int cliente_id;
    private int producto_id;
    private int cantidad;
    private String fecha;

    public Pedidos(int id, int cliente_id, int producto_id, int cantidad, String fecha) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return id + "," + cliente_id + "," + producto_id + "," + cantidad + "," + fecha;
    }
}
