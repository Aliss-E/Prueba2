import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderWriter{

    /** Metodo que se encarga de leer los archivos
     * @param filename Nobre del archivo a leer.
     */
    public static String[] read(String filename){
        String linea;
        LinkedList<String> lista = null;
        BufferedReader lector = null;

        try{
            lector = new BufferedReader(new FileReader(filename));
            lista = new LinkedList<>();
            while((linea = lector.readLine()) != null){
                lista.add(linea);
            }
        } catch (FileNotFoundException e){
            return new String[0];
        } catch (IOException e){
            System.out.println(e);
        } finally{
            try {
                if (lector != null){
                    lector.close();
                }
            } catch(IOException e){
                System.out.println(e);
            }
        }
        return lista.toArray(new String(lista.size()));

    }
    
    /** Metodo que se encarga de escribir en los archivos */
    public static void write(String contenido, String nombreArchivo){
        FileWriter archivo = null;

        try{
            archivo = new FileWriter(nombreArchivo, true);
            archivo.write(contenido);
            archivo.write("\n");
        } catch (IOException e){
            System.out.println("e");
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        }
    }
