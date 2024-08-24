package listaencadeada;

public class Lista<T> {

    No<T> referenciaEntrada;

    public Lista(){
        this.referenciaEntrada = null;
    }
/*** Metodo Add ***/
    public void add(T cont){
        No<T> novoNo = new No<>(cont);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }
/*** Metodo Get ***/
    public T get(int index){
        return getNo(index).getCont();
    }

    private No<T> getNo(int index){
    validaIndice(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;
    for(int i=0; i <= index; i++){
        noRetorno = noAux;
        noAux = noAux.getProximoNo();
    }
    return  noRetorno;
    }

/*** Metodo Remove ***/
    public T remove(int index){

        No<T> pivo = this.getNo(index);
        if(index == 0){
            referenciaEntrada = pivo.getProximoNo();
            return pivo.getCont();
        }
        No<T> noAnt = getNo(index-1);
        noAnt.setProximoNo(pivo.getProximoNo());
        return pivo.getCont();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaaux = referenciaEntrada;
        while(true){
            if(referenciaaux != null){
                tamanhoLista++;
                if(referenciaaux.getProximoNo() == null){
                    referenciaaux = referenciaaux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

/*** Metodo Valida Indice ***/
    public void validaIndice(int index){
        if(index >= size()){
            int ultimoindice = size() - 1;
            throw  new IndexOutOfBoundsException("Não existe conteudo no indice"+ index+ "desta lista");

        }
    }

/*** Metodo isEmpty ***/
    public boolean isEmpty(){
    return referenciaEntrada == null ? true: false;
    }

    /*** Metodo toString ***/
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = referenciaEntrada;
        for(int i=0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAux.getCont() +
                    "}]--->";
            noAux = noAux.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
