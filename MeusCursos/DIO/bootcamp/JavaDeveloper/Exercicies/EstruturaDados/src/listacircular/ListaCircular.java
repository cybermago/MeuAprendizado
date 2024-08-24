package listacircular;

public class ListaCircular<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanhoLista;

    public ListaCircular() {
        this.fim = null;
        this.inicio = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista == 0){
            this.inicio = novoNo;
            this.fim = this.inicio;
            this.inicio.setNoProx(fim);
        }else{
            novoNo.setNoProx(this.fim);
            this.inicio.setNoProx(novoNo);
            this.inicio = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        No<T> noAux = fim;
        if(index == 0){
            this.fim = this.fim.getNoProx();
            this.inicio.setNoProx(this.fim);
        }else if(index == 1){
            this.fim.setNoProx(this.fim.getNoProx().getNoProx());
        }else{
            for(int i = 0; i < index-1; i++){
                noAux = noAux.getNoProx();
            }
            noAux.setNoProx(noAux.getNoProx().getNoProx());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public boolean isEmpty(){
    return this.tamanhoLista == 0 ? true : false;
    }

    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

            if (index == 0) {
                return this.fim;
            }
            No<T> noAux = this.fim;
            for(int i=0; (i < index) && (noAux != null); i++){
                noAux = noAux.getNoProx();
            }
            return  noAux;
        }


    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
       String strRetorno = "";

       No<T> noAux = this.fim;
       for(int i=0; i<this.size(); i++){
           strRetorno += "[No{conteudo=" + noAux.getConteudo() + "}]-->";
           noAux = noAux.getNoProx();
       }

       strRetorno += this.size() != 0 ? "(Retorna ao inicio)": "[]";

       return strRetorno;
    }
}
