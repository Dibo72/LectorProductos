import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class LectorProductos {
    public static void main(String[] args) {
        List <Producto> listaProductos = new ArrayList();
        try(BufferedReader lector = new BufferedReader(new FileReader("Productos.txt"))){
            String linea;
            while((linea = lector.readLine()) != null){
                String[] partes = linea.split(";");
                String nombre = partes[0].trim();
                int precio = Integer.parseInt(partes[1].trim());
                listaProductos.add(new Producto(nombre, precio));
            }
        }catch(Exception e){
            System.out.println(e);
        }

        for( Producto p : listaProductos ){
            System.out.println(p);
        }
    }
}