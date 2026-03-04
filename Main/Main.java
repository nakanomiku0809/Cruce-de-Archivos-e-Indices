package main;
public class Main {
    public static void main(String[] args) {
        int op;
        System.out.println("Bienvenido");
        System.out.println("Ver productos ordenados por precio.");
        System.out.println("Agregar un nuevo cliente.");
        System.out.println("Calcular el total de ventas por producto.");
        System.out.println("Ver clientes que han realizado compras.");
        System.out.println("Salir");
        Scanner read = new Scanner(System.in);
        op=read.nextInt();
        switch(op){
            case 1:
                break;
            case 2:
                //id,nombre,email
                System.out.println("Ingrese el id del usuario: ");
                int id = read.nextInt();
                System.out.println("Ingrese el nombre del usuario: ");
                String nombre = read.next();
                System.out.println("Ingrese el email del usuario: ");
                String email = read.next();
                crearCliente(id, nombre,email)
                break;
            case 3:
                break
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion invalida vuelva a escribir: ");
                op.read.nextInt();
        }
    }
}


int op;
System.out.println("Bienvenido");
System.out.println("Ver productos ordenados por precio.");
System.out.println("Agregar un nuevo cliente.");
System.out.println("Calcular el total de ventas por producto.");
System.out.println("Ver clientes que han realizado compras.");
System.out.println("Salir");
    Scanner read = new Scanner();
    op.read.nextInt();
    switch(op){
        case 1:
            break;
        case 2:
            //id,nombre,email
            System.out.println("Ingrese el id del usuario: ");
            int id = read.nextInt();
            System.out.println("Ingrese el nombre del usuario: ");
            String nombre = read.next();
            System.out.println("Ingrese el email del usuario: ");
            String email = read.next();
            crearCliente(id, nombre,email)
            break;
        case 3:
            break
        case 4:
            break;
        case 5:
            break;
        default:
            System.out.println("Opcion invalida vuelva a escribir: ");
            op.read.nextInt();
    }
