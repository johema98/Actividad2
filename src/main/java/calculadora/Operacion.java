package calculadora;

import java.text.MessageFormat;
import java.util.logging.Logger;

public class Operacion {
    double n1;
    double n2;
    double res;
    char operar;
    protected double resultado;

    public Operacion(double n1, double n2, char operacion) {

        this.n1 = n1;
        this.n2 = n2;
        this.operar = operacion;
    }


    public void mostrarResultado(){

        Logger logger = Logger.getLogger(Operacion.class.getName());
        String message = MessageFormat.format("{0} {1} {2} = {3}" , this.n1 , this.operar, this.n2,this.res);
        logger.info(message);


    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }



    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
