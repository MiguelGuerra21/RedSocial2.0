import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    /**
     * Constructor
     */
    public Entrada(String user)
    {
        usuario = user;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }
    
    public void meGusta(){
        cantidadMeGusta++;
    }

    public LocalDateTime getMomentoPublicacion(){
        return momentoPublicacion;
    }
    
    public int getMeGusta(){
        return cantidadMeGusta;
    }

    public String getUsuario(){
        return usuario; 
    }
    
    public String toString(){
        String cadenaCompleta = "";
        cadenaCompleta += "Usuario "  + getUsuario() + "<br/>";
        cadenaCompleta += getMeGusta() + " me gusta " + "<br/>";
        long segundosPasados = getMomentoPublicacion().until(LocalDateTime.now(),ChronoUnit.SECONDS);
        long minutosPasados = segundosPasados/60;
        long segundosResto = segundosPasados%60;
        cadenaCompleta += " Hace ";
        if(minutosPasados > 0){
            cadenaCompleta += minutosPasados +"minutos ";
        }
        cadenaCompleta += segundosResto + "segundos" + "<br/>";
        return cadenaCompleta;
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 0;
    }
}