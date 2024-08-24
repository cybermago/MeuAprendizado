package listaencadeada;

public class No<T> {
    private T cont;
    private No proximoNo;

    public No(){
        this.proximoNo = null;
    }

    public No(T cont) {
        this.cont = cont;
        this.proximoNo = proximoNo;
    }

    public T getCont() {
        return cont;
    }

    public void setCont(T cont) {
        this.cont = cont;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "cont=" + cont +
                ", proximoNo=" + proximoNo +
                '}';
    }
    public String toStringEncadeado(){
        String str = "No{" +
                "conteudo=" + cont + "}";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}
