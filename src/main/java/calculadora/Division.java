package calculadora;

public class Division extends Operacion {


    public Division(double n1, double n2) {

        super(n1, n2, '/');
        if(n2==0) {
           throw new IllegalArgumentException("no se puede division entre cero");
        }
        else this.resultado = n1 / n2;
        this.setRes(this.resultado);
    }


}