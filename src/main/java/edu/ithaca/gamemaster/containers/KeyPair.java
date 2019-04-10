package edu.ithaca.gamemaster.containers;

public class KeyPair<T> {
    private T first;
    private T second;

    public KeyPair(T first, T second){
        this.first=first;
        this.second=second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }
}
