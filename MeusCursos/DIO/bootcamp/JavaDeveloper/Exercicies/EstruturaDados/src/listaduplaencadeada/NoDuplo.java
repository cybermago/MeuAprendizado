package listaduplaencadeada;

public class NoDuplo <T>{
    private NoDuplo<T> noProx;
    private NoDuplo<T> noAnt;
    private T conteudo;
    private NoDuplo<T> referenciaEntrada;
    private NoDuplo<T> referenciaSaida;

    public NoDuplo(T conteudo){
    this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoAnt() {
        return noAnt;
    }

    public void setNoAnt(NoDuplo<T> noAnt) {
        this.noAnt = noAnt;
    }

    public NoDuplo<T> getNoProx() {
        return noProx;
    }

    public void setNoProx(NoDuplo<T> noProx) {
        this.noProx = noProx;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
