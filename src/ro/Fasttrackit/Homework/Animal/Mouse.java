package ro.Fasttrackit.Homework.Animal;

public class Mouse implements Animal{
    @Override
    public String talk() {
        return "chit - chit";
    }

    @Override
    public String walk() {
        return "walking mouse";
    }

    @Override
    public String eat() {
        return "cheese";
    }
}
