package listaduplaencadeada;

public class NoDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista=0;

    public NoDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;

    }

    public void add(T item){
        NoDuplo<T> novoNo = new NoDuplo<>(item);
        novoNo.setNoProx(null);
        novoNo.setNoAnt(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProx(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T item){
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(item);
        novoNo.setNoProx(noAux);

        if(novoNo.getNoProx() != null){
         novoNo.setNoAnt(noAux.getNoAnt());
         novoNo.getNoProx().setNoAnt(novoNo);
        }else{
            novoNo.setNoProx(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoProx().setNoProx(novoNo);
        }
    }

    public void remove(int index){

        if(index == 0){
            primeiroNo = primeiroNo.getNoProx();
            if(primeiroNo != null){
                primeiroNo.setNoProx(null);
            }
        }else{
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoProx().setNoProx(noAux.getNoProx());
            if(noAux != ultimoNo){
                noAux.getNoProx().setNoAnt(noAux.getNoAnt());
            }else{
                ultimoNo = noAux;
            }
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAux = primeiroNo;
        for(int i=0; (i < index) && (noAux != null); i++){
            noAux = noAux.getNoProx();
        }
        return noAux;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        NoDuplo<T> noAux = primeiroNo;
        String strRetorno = "";
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAux.getConteudo() + "]} -->";
            noAux = noAux.getNoProx();
        }
        strRetorno += "null";
        return strRetorno;
    }
}