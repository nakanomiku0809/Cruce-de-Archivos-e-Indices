import java.io.File;
import java.io.IOException;
import java.util.*;

public class clientes_compras {
    public static void verClientesConCompras() throws IOException {
        List<Pedidos> pedidos = leerPedidos();
        List<Clientes> clientes = leerClientes();
        Set<Integer> clientesConCompras = new HashSet<>();
        for (Pedidos pedido : pedidos) {
            clientesConCompras.add(pedido.getClienteId());
        }

        // Imprimir clientes que han realizado compras
        System.out.println("Clientes que han realizado compras:");
        for (Clientes cliente : clientes) {
            if (clientesConCompras.contains(cliente.getId())) {
                System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre() + ", Email: " + cliente.getEmail());
            }
        }
    }
}