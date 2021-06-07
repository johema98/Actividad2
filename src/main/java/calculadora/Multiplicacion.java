package calculadora;

public class Multiplicacion extends Operacion {


    public Multiplicacion(double n1, double n2) {

        super(n1, n2, '*');
        this.resultado = n1 * n2;
        this.setRes(this.resultado);
    }
}