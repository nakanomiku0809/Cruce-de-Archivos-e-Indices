import java.io.File;
import java.io.IOException;
import java.util.*;

public class total_ventas {
    public static void calcularTotalVentasPorProducto() throws IOException {
        List<Productos> productos = leerProductos();
        List<Pedidos> pedidos = leerPedidos();
        //el hash osea el identificador de posicion
        Map<Integer, Float> totalVentas = new HashMap<>();
        for (Pedidos pedido : pedidos) {
            int productoId = pedido.getProductoId();
            int cantidad = pedido.getCantidad();
            for (Productos producto : productos) {
                if (producto.getId() == productoId) {
                    float precio = producto.getPrecio();
                    float venta = cantidad * precio;
                    totalVentas.put(productoId, totalVentas.getOrDefault(productoId, 0f) + venta);
                    break;
                }
            }
        }

        // Imprimir resultados
        System.out.println("Total de ventas por producto:");
        for (Map.Entry<Integer, Float> entry : totalVentas.entrySet()) {
            int productoId = entry.getKey();
            float total = entry.getValue();
            // Encontrar nombre del producto
            String nombre = "";
            for (Productos producto : productos) {
                if (producto.getId() == productoId) {
                    nombre = producto.getNombre();
                    break;
                }
            }
            System.out.println("Producto: " + nombre + " (ID: " + productoId + ") - Total: $" + total);
        }
    }

    private static List<Productos> leerProductos() throws IOException {
        List<Productos> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File("productos.csv"));
        while (sc.hasNextLine()) {
            String[] datos = sc.nextLine().split(",");
            lista.add(new Productos(Integer.parseInt(datos[0]), datos[1], datos[2], Float.parseFloat(datos[3]), Integer.parseInt(datos[4])));
        }
        sc.close();
        return lista;
    }

    private static List<Pedidos> leerPedidos() throws IOException {
        List<Pedidos> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File("pedido.csv"));
        while (sc.hasNextLine()) {
            String[] datos = sc.nextLine().split(",");
            lista.add(new Pedidos(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]), Integer.parseInt(datos[3]), datos[4]));
        }
        sc.close();
        return lista;
    }
}