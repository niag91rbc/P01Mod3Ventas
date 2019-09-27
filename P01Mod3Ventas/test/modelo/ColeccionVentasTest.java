package modelo;

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testListar() {
        System.out.println("Listado de Ventas."); 
        ColeccionVentas instance = new ColeccionVentas(); 
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido=instance.Listar(); 
        Assert.assertEquals(esperado, obtenido); 
    }

    @org.junit.Test
    public void testAgregar() {
        System.out.println("Venta Agregadada.");
        Venta venta = new Venta("ABC", 120, 22); 
        ColeccionVentas instance = new ColeccionVentas(); 
        boolean esperado=true; 
        boolean obtenido=instance.Agregar(venta); 
        Assert.assertEquals(esperado, obtenido);       
    }

    @org.junit.Test
    public void testModificar() {
        System.out.println("Venta Modificada.");
        Venta venta = new Venta("ABC", 120, 22);  
        ColeccionVentas instance = new ColeccionVentas(); 
        instance.Agregar(venta);
        boolean esperado=true; 
        boolean obtenido=instance.modificar(venta); 
        Assert.assertEquals(esperado, obtenido); 
    }

    @org.junit.Test
    public void testEliminar() {
        System.out.println("Libro Eliminado.");
        String codigo="ABC";
        Venta venta = new Venta("ABC", 120, 22);  
        ColeccionVentas instance = new ColeccionVentas(); 
        instance.Agregar(venta);
        boolean esperado=true; 
        boolean obtenido=instance.Eliminar(codigo); 
        Assert.assertEquals(esperado, obtenido);
    } 
    
    @Test
    public void testSubTotal() {
        System.out.println("subTotal");
        String codigo = "venta123";
        Venta venta=new Venta("venta123", 100, 10);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        int expResult = 1000;
        int result = instance.subTotal(codigo);
        assertEquals(expResult, result);
    }
}
