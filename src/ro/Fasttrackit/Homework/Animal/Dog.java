package ro.Fasttrackit.Homework.Animal;

public class Dog implements Animal{
    @Override
    public String talk() {
        return "hammm";
    }

    @Override
    public String walk() {
        return "walking dog";
    }

    @Override
    public String eat() {
        return "meat";
    }
}
