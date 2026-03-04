import java.nio.file.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public static List<cliente> leerClientes() 
throws IOException {
    List<cliente> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("clientes.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Cliente(
            Integer.parseInt(datos[0]),
            datos[1],
            datos[2]));
    }
    sc.close();
    return lista;
}