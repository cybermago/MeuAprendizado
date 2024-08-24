package arvorebinaria;

import arvorebinaria.model.Obj;

public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> ab = new ArvoreBinaria<>();
        ab.inserir(new Obj(13));
        ab.inserir(new Obj(10));
        ab.inserir(new Obj(25));
        ab.inserir(new Obj(2));
        ab.inserir(new Obj(12));
        ab.inserir(new Obj(20));
        ab.inserir(new Obj(31));
        ab.inserir(new Obj(29));

        ab.inOrdem();
        ab.preOrdem();
        ab.posOrdem();
    }
}
