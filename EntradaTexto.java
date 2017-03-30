import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends EntradaComentarios
{
    private String mensaje;
    /**
     * Constructor
     */
    public EntradaTexto(String user ,String texto)
    {
        super(user);
        mensaje = texto;
    }
    
    public String getMensaje(){
        return mensaje;
    }
    
    public String toString(){
        String cadenaCompleta = super.toString();
        cadenaCompleta += "Mensaje : " + mensaje + "<br/>";
        return cadenaCompleta;
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 5;
    }
    
    public void mostrarDatosExclusivos(){
        System.out.println(mensaje);
    }
}
