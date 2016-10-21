package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/21 17:34.
 */

/**
 * Your object will be instantiated and called as such:
 * ToyFactory tf = new ToyFactory();
 * Toy toy = tf.getToy(type);
 * toy.talk();
 */
interface Toy {
    void talk();
}

class Dog implements Toy {
    @Override
    public void talk() {
        System.out.println("Dog");
    }
    // Write your code here

}

class Cat implements Toy {
    @Override
    public void talk() {
        System.out.println("Cat");
    }
    // Write your code here
}

public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        // Write your code here
        if(type.equals("Cat")){
            return new Cat();
        }
        if (type.equals("Dog")){
            return new Dog();
        }
        return null;
    }
}
