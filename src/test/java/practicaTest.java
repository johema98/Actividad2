import calculadora.Division;
import calculadora.Multiplicacion;
import calculadora.Resta;
import calculadora.Suma;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class practicaTest {
    Double n1;
    Double n2;
    Double resultadoEsperado;

    @Before
    public void before(){
        n1=8.0;
        n2=15.0;

    }



    @Test
    public void sumaTest() {

        resultadoEsperado = 23.0;

        Suma oper = new Suma(n1,n2);
        Double res= oper.getRes();
        verificarResultado(res,resultadoEsperado);
    }

    @Test
    public void restaTest() {
        resultadoEsperado = -7.0;

        Resta prueba2 = new Resta(n1,n2);
        Double resultado = prueba2.getRes();

        verificarResultado(resultado,resultadoEsperado);
    }

    @Test
    public void multiTest(){
        n1=5.0;
        n2=3.0;
        Multiplicacion prueba3 = new Multiplicacion(n1,n2);
        Double resultado3 = prueba3.getRes();

        Assert.assertTrue("No es correcto", resultado3.equals(15.0));
    }

    @Test
    public void divisionTest() throws Exception {

        n2=2.0;
        resultadoEsperado = 4.0;

        Division oper = new Division(n1,n2);
        Double resultado = oper.getRes();
        verificarResultado(resultado,resultadoEsperado);
    }

    @Test
    public void divisionPorCeroTest(){
        n2=0.0;
        try{
            Division oper = new Division(n1,n2);
            Double res = oper.getRes();
            verificarResultado(res,resultadoEsperado);
        } catch (Exception e){
            Assert.assertNotNull("No es nulo",e.getMessage());
            Assert.assertTrue("No se ha obtenido el mensaje esperado",e.getMessage().contains("no se puede division entre cero"));
        }
    }


    @Test
    public void getN1Test(){
        Suma operar = new Suma(n1,n2);
        Double numero1 = operar.getN1();
        Assert.assertTrue("No es correcto", numero1.equals(n1));
    }

    @Test
    public void getN2Test(){
        Suma operar = new Suma(n1,n2);
        Double numero2 = operar.getN2();
        Assert.assertTrue("No es correcto", numero2.equals(n2));
    }

    @Test
    public void setN1Test(){
        Double valor = 10.0;
        Suma operar = new Suma(n1,n2);
        operar.setN1(valor);
        Assert.assertTrue("No es correcto", valor.equals(operar.getN1()));
    }

    @Test
    public void setN2Test(){
        Double valor = 10.0;
        Suma operar = new Suma(n1,n2);
        operar.setN2(valor);
        Assert.assertTrue("No es correcto", valor.equals(operar.getN2()));
    }


    



    private void verificarResultado(Double resultado, Double resultEsperado){
        Assert.assertNotNull("El resultado es null", resultado);
        Assert.assertTrue("El resultado es incorrecto", resultado.equals(resultEsperado));
    }
}
