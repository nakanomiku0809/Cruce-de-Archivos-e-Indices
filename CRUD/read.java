import java.nio.file.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public static List<cliente> leerClientes() throws IOException {
    List<cliente> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("clientes.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Clientes(Integer.parseInt(datos[0]),datos[1],datos[2],));
    }
    sc.close();
    return lista;
}


//pedido
public static List<pedido> leerPedido() throws IOException {
    List<pedido> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("pedido.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Pedido(Integer.parseInt(datos[0]),datos[1],datos[2],datos[3],datos[4]);
    }
    sc.close();
    return lista;
}

//productos
public static List<producto> leerProducto() throws IOException {
    List<producto> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("productos.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Producto(Integer.parseInt(datos[0]),datos[1],datos[2],float.parseFloat(datos[3]),Integer.parseInt(datos[4])));
    }
    sc.close();
    return lista;
}

//venta
public static List<venta> leerVenta() throws IOException {
    List<venta> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("total_ventas.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Venta(Integer.parseInt(datos[0]),datos[1],datos[2]));
    }
    sc.close();
    return lista;
}