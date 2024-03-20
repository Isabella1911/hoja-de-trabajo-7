import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        ArbolBinario<String, String> arbolTraduccion = new ArbolBinario<>();
        arbolTraduccion.insert("I", "Yo");
        arbolTraduccion.insert("told", "dije");
        arbolTraduccion.insert("the", "a la");
        arbolTraduccion.insert("that", "que");
        arbolTraduccion.insert("my", "mi");
        arbolTraduccion.insert("dog", "perro");
        arbolTraduccion.insert("ate", "se comió");
        arbolTraduccion.insert("woman", "mujer");
        arbolTraduccion.insert("homework", "tarea");

        // Crear el traductorIdiomas utilizando el ArbolBinario
        traductorIdiomas traductorIdiomas = new traductorIdiomas(arbolTraduccion);

        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaTraducida = traductorIdiomas.traducirfrase(linea);
                System.out.println(lineaTraducida);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}