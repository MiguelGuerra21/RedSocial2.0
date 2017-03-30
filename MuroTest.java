

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaUnionAGrupo entradaU1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF2;
    private Muro muro1;

    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    

    
    
    

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        entradaT1 = new EntradaTexto("miguel", "sajkdjasdnjk");
        entradaF1 = new EntradaFoto("miguel", "tecnologia.jpg", "binario");
        entradaU1 = new EntradaUnionAGrupo("miguel", "amantes de perros");
        entradaT2 = new EntradaTexto("miguel", "sajkdjasdnjk");
        entradaF2 = new EntradaFoto("miguel", "redsocial.jpg", "redes");
        muro1 = new Muro();
        muro1.addEntrada(entradaF2);
        muro1.addEntrada(entradaT2);
        muro1.addEntrada(entradaU1);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaT1);
        muro1.mostrarMuroEnNavegador();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
