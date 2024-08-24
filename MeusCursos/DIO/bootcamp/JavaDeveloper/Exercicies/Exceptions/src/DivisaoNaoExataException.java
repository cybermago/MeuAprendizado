public class DivisaoNaoExataException extends ExceptionPersonalizada2{
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador){
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
