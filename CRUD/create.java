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
Path out = Paths.get("usuarios.csv");
Files.createDirectories(out.getParent());

public static void crearUsuario(Usuario usuario) 
throws IOException {
    FileWriter fw = new FileWriter("usuarios.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(usuario.toString());
    bw.newLine();
    bw.close();
}

Path out = Paths.get("usuarios.csv");
Files.createDirectories(out.getParent());

public static void crearUsuario(Usuario usuario) 
throws IOException {
    FileWriter fw = new FileWriter("usuarios.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(usuario.toString());
    bw.newLine();
    bw.close();
}
