package wsd.dev;

import wsd.dev.entities.TestA;

public class Main {

    public static void main(String[] args) {
 //Do some changes
        int x =0;
        TestA t = new TestA();
                System.out.println(t.getClass().getClassLoader().getName());
        String s = "Hi Wael ";
        String dawoud = "Dawoud";
        System.out.println(s + dawoud + " ");
    }
}
