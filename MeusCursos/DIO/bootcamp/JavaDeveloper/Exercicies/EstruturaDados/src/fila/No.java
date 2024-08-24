package fila;

public class No<T> {

    private T obj;
    private No<T> refNo;

    public No(){

    }

    public No(T obj){
        this.obj = obj;
        this.refNo = null;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }


    @Override
    public String toString() {
        return "No{" +
                "obj=" + obj +
                ", refNo=" + refNo +
                '}';
    }
}
