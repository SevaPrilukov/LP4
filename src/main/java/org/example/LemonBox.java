package org.example;
public class LemonBox<T extends Lemon>extends Box<T>{
    public LemonBox(T obj) {
        super(obj);
    }
  boolean compare (LemonBox<T> box){
        return Math.abs(this.getWeight()- box.getWeight()) < 0.0001;
    }

}