package fila;

import java.util.ResourceBundle;

public class Fila<T> {

    private No<T> refNoentrada;

    public Fila() {
        this.refNoentrada = null;
    }

    public void enqueue(T obj) {
        No novono = new No();
        novono.setRefNo(refNoentrada);
        refNoentrada = novono;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoentrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObj();
        }
        return null;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            No primeiroNo = refNoentrada;
            No noAux = refNoentrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAux.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObj();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoentrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAux = refNoentrada;
        if (refNoentrada != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAux.getObj() + "}]--->";
                noAux = noAux.getRefNo();
                if (noAux.getRefNo() != null) {
                    noAux = noAux.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";

        }
        return stringRetorno;
    }
}