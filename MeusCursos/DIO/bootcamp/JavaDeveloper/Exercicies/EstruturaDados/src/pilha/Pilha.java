package pilha;

public class Pilha {

    private No refNoEntrada;

    public Pilha(){
        this.refNoEntrada = null;
    }

    public void push(No novono){
        No refaux = refNoEntrada;
        refNoEntrada = novono;
        refNoEntrada.setReno(refaux);
    }

    public No pop(){
        if (this.isEmpty()){
            No nopoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getReno();
            return nopoped;
        }
        return null;
    }

    public No top(){
        return refNoEntrada;
    }

    public boolean isEmpty(){
//        if(refNoEntrada = null){
//            return true;
//        }
//        return false;
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString(){
        String stringretorno = "------------\n";
        stringretorno += "   Pilha\n";
        stringretorno += "------------\n";

        No noaux = refNoEntrada;

        while (true){
            if(noaux != null){
                stringretorno += "[No{dado=" + noaux.getDado();
                noaux = noaux.getReno();
            }else{
                break;
            }
        }
        stringretorno += "============\n";
        return stringretorno;
    }
}