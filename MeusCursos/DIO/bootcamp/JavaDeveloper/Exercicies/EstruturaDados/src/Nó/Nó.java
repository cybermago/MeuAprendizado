package Nó;

public class Nó<T> {
    private T conteudo;
    private Nó<T> proximoNo;

    public Nó(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Nó getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(Nó<T> proximoNo) {
        this.proximoNo = proximoNo;
    }
}
