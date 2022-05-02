package ro.Fasttrackit.Homework.Animal;

public class Duck implements Animal{

    @Override
    public String talk(){
        return "mac - mac";
    }

    @Override
    public String walk() {
        return "walking duck";
    }

    @Override
    public String eat() {
        return "fish";
    }
}
