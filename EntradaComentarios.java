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
public class EntradaComentarios extends Entrada
{
    private ArrayList<String> comentarios;

    /**
     * Constructor
     */
    public EntradaComentarios(String user)
    {
        super(user);
        comentarios = new ArrayList<>();
    }
    
    public void addComentario(String text){         
        comentarios.add(text);
    }
    
    public ArrayList<String> getComentarios(){
        return comentarios;
    }
    
    public String toString(){
        String cadenaCompleta = super.toString();
        if(getComentarios().isEmpty()){
            cadenaCompleta += " La entrada no tiene comentarios" +"<br/>";
        }
        else{
            cadenaCompleta += "Comentarios :" + "<br/>";
            for(String comentarioActual : getComentarios()){
                cadenaCompleta += comentarioActual + "<br/>";
            }
        }
        return cadenaCompleta;
    }
}
