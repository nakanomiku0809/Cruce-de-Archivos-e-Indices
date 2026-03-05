import java.io.File;
import java.io.IOException;
import java.util.*;

public class orden_precio {
    public static void ordenarProductosPorPrecio() throws IOException {
        List<Productos> productos = leerProductos();

        // Ordenar por precio usando bubble sort
        for (int i = 0; i < productos.size() - 1; i++) {
            for (int j = 0; j < productos.size() - 1 - i; j++) {
                if (productos.get(j).getPrecio() > productos.get(j + 1).getPrecio()) {
                    // Swap
                    Productos temp = productos.get(j);
                    productos.set(j, productos.get(j + 1));
                    productos.set(j + 1, temp);
                }
            }
        }

        System.out.println("Productos ordenados por precio:");
        for (Productos p : productos) {
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() + ", Precio: $" + p.getPrecio());
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
}