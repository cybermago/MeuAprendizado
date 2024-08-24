package arvorebinaria.model;

public abstract class ObjThree<T> implements Comparable<T>{

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
