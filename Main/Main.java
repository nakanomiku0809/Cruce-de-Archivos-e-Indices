import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            int op;
            System.out.println("Bienvenido");
            System.out.println("1. Ver productos ordenados por precio.");
            System.out.println("2. Agregar un nuevo cliente.");
            System.out.println("3. Calcular el total de ventas por producto.");
            System.out.println("4. Ver clientes que han realizado compras.");
            System.out.println("5. Salir");
            op = read.nextInt();
            switch(op){
                case 1:
                    try {
                        orden_precio.ordenarProductosPorPrecio();
                    } catch (Exception e){//esto evita errores
                        System.out.println("Error al ordenar productos: " + e.getMessage());
                    }
                    break;
                case 2:
                    //id,nombre,email
                    System.out.println("Ingrese el id del usuario: ");
                    int id = read.nextInt();
                    System.out.println("Ingrese el nombre del usuario: ");
                    String nombre = read.next();
                    System.out.println("Ingrese el email del usuario: ");
                    String email = read.next();
                    Clientes nuevoCliente = new Clientes(id, nombre, email);
                    try {
                        create.crearCliente(nuevoCliente);
                        System.out.println("Cliente agregado exitosamente.");
                    } catch (Exception e) {
                        System.out.println("Error al agregar cliente: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        total_ventas.calcularTotalVentasPorProducto();
                    } catch (Exception e) {
                        System.out.println("Error al calcular ventas: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        clientes_compras.verClientesConCompras();
                    } catch (Exception e) {
                        System.out.println("Error al ver clientes: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida, vuelva a escribir: ");
            }
        }
    }
}
