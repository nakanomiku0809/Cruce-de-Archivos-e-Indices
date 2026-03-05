import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class create {
    public static void crearCliente(Clientes cliente) throws IOException {
        FileWriter fw = new FileWriter("clientes.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(cliente.toString());
        bw.newLine();
        bw.close();
    }

    public static void crearPedido(Pedidos pedido) throws IOException {
        FileWriter fw = new FileWriter("pedido.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(pedido.toString());
        bw.newLine();
        bw.close();
    }
    //uso de IA (repetitivo)
    public static void crearProducto(Productos producto) throws IOException {
        FileWriter fw = new FileWriter("productos.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(producto.toString());
        bw.newLine();
        bw.close();
    }
}
} 

