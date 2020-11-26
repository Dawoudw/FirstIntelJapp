package wsd.dev;

import wsd.dev.entities.TestA;

public class Main {

    public static void main(String[] args) {
 //Do some changes
        TestA t = new TestA();
        System.out.println(t.getClass().getClassLoader().getName());
        System.out.println("Hi Wael " + "Dawoud" + " ");
    }
}
