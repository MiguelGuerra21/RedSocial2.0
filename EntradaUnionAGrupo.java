import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String user , String grupo)
    {
        super(user);
        this.grupo = grupo;
    }
    
    @Override
    public String toString(){
        String cadenaCompleta = super.toString();
        cadenaCompleta += "El usuario se ha unido al grupo : " +grupo + "<br/>";
        return cadenaCompleta;
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 4;
    }
    
    public void mostrarDatosExclusivos(){
        System.out.println(grupo);
    }
}
