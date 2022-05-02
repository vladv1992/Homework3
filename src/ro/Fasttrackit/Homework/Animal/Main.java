package ro.Fasttrackit.Homework.Animal;

public class Main {
    public static void main (String [] args){
        Cat miti = new Cat();
        System.out.println(miti.talk());
        System.out.println(miti.walk());
        System.out.println(miti.eat());

        Dog grivei  = new Dog();
        System.out.println(grivei.talk());
        System.out.println(grivei.walk());
        System.out.println(grivei.eat());

        Mouse jery  = new Mouse();
        System.out.println(jery.talk());
        System.out.println(jery.walk());
        System.out.println(jery.eat());

        Chicken lusi = new Chicken();
        System.out.println(lusi.talk());
        System.out.println(lusi.walk());
        System.out.println(lusi.eat());

        Duck ju = new Duck();
        System.out.println(ju.talk());
        System.out.println(ju.walk());
        System.out.println(ju.eat());

    }
}
