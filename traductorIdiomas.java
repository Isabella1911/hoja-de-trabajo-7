
public class traductorIdiomas {

    private ArbolBinario<String, String> arbolTraduccion;

    /**
     * @param arbolTraduccion arbol binario con las traducciones de las palabras
     */
    public traductorIdiomas(ArbolBinario<String, String> arbolTraduccion) {
        this.arbolTraduccion = arbolTraduccion;
    }

    /**
     * @param frase oración a traducir
     * @return traduccion de la frase .
     */
    public String traducirfrase(String frase) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = frase.split("\\s+"); 

        for (String palabra : palabras) {
            String traduccion = arbolTraduccion.search(palabra); 
            if (traduccion != null) {
                resultado.append("*").append(traduccion).append("*").append(" "); 
            } else {
                resultado.append(palabra).append(" "); 
            }
        }

        return resultado.toString().trim(); 
    }
}