package calculadora;

public class Resta extends Operacion {


    public Resta(double n1, double n2) {

        super(n1, n2, '-');
        this.resultado = n1 - n2;
        this.setRes(this.resultado);
    }
}