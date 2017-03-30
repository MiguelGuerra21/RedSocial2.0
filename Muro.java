import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.awt.Desktop;
import java.lang.Runtime;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    private ArrayList<Entrada> entradas;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<>();
    }

    public void addEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    public String toString(){
        String cadenaAMostrar = "";
        for(Entrada entradaActual : entradas){
            cadenaAMostrar += entradaActual.toString();
        }
        return cadenaAMostrar;
    }

    public void mostrar(){
        System.out.println(this);
    }

    public void verCantidadDatosPorEntrada(){
        for(Entrada entradaActual : entradas){
            System.out.println(entradaActual.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada ,String autor){
        for(Entrada entradaActual : entradas){
            if((entradaActual.getUsuario().equals(autor) || autor == null )&& (tipoEntrada.equals(entradaActual.getClass().getSimpleName()) || tipoEntrada == null)){  //Comprueba que el autor sea el de la entrada o null
                switch(entradaActual.getClass().getSimpleName()){                           //Cambia la Entrada al tipo que sea y invoca el metodo mostrarDatosExclusivos
                    case "EntradaTexto":
                    ((EntradaTexto) entradaActual).mostrarDatosExclusivos();
                    break;
                    case "EntradaFoto":
                    ((EntradaFoto) entradaActual).mostrarDatosExclusivos(); 
                    break;
                    case "EntradaUnionAGrupo":
                    ((EntradaUnionAGrupo) entradaActual).mostrarDatosExclusivos();
                    break;
                }
            }
        }
    }
    
    public void mostrarMuroEnNavegador()
    {
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("muro.html");
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una excepcion...
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html>");
            archivo.write("<head>");
            archivo.write("<link rel= \"stylesheet\" type=\"text/css\" href=\"disenio.css\" media=\"screen\"/>");
            archivo.write("</head>");
            archivo.write("<body>");
            archivo.write("<h1>" +"Bienvenido a tu muro" + "</h1>");
            archivo.write("<img src = \"redSocial.jpg\"/>");
            for(Entrada entradaActual : entradas){
                archivo.write("<p>" + entradaActual.toString() + "</p>");
                if(entradaActual.getClass().getSimpleName().equals("EntradaFoto")){
                    archivo.write("<img src =\"" + ((EntradaFoto) entradaActual).getUrl() + "\"/>");
                }
            }
            archivo.write("</body>");
            archivo.write("</html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("C:/Program Files/Google/Chrome/Application/chrome.exe" + " C:/Users/MiguelRG/Desktop/Red-Social-master/Red-Social-master/muro.html");
        }
        catch(IOException excepcion){
            System.out.println(excepcion.toString());
        }
    }
}
