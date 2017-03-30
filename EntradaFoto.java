import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class EntradaFoto extends EntradaComentarios
{
    private String urlImagen;
    private String titulo;
    
    public EntradaFoto(String autor, String url , String tituloFoto)
    {
        super(autor);
        urlImagen = url;
        titulo = tituloFoto;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getUrl(){
        return urlImagen;
    }
    
    public String toString(){
        String cadenaCompleta = super.toString();
        cadenaCompleta += "Url : " + urlImagen + "<br/>";
        cadenaCompleta += "Titulo : " + titulo + "<br/>";
        return cadenaCompleta;
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 6;
    }
    
    public void mostrarDatosExclusivos(){   
        System.out.println(urlImagen);
        System.out.println(titulo);
    }
}
