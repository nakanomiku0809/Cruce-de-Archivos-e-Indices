import java.nio.file.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

//clientes
Path out = Paths.get("clientes.csv");
Files.createDirectories(out.getParent());

public static void crearCliente(Clientes cliente) 
throws IOException {
    FileWriter fw = new FileWriter("clientes.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(cliente.toString());
    bw.newLine();
    bw.close();
}

//pedidos
Path out = Paths.get("pedidos.csv");
Files.createDirectories(out.getParent());

public static void crearPedido(Pedido pedido) throws IOException {
    FileWriter fw = new FileWriter("pedidos.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(pedido.toString());
    bw.newLine();
    bw.close();
}


//productos
Path out = Paths.get("productos.csv");
Files.createDirectories(out.getParent());

public static void crearProducto(Producto producto) 
throws IOException {
    FileWriter fw = new FileWriter("productos.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(producto.toString());
    bw.newLine();
    bw.close();
}


//ventas 
Path out = Paths.get("total_ventas.csv");
Files.createDirectories(out.getParent());

public static void crearVenta(Venta venta) 
throws IOException {
    FileWriter fw = new FileWriter("total_ventas.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(venta.toString());
    bw.newLine();
    bw.close();
}
