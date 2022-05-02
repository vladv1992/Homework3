package ro.Fasttrackit.Homework.Animal;

public class Cat implements Animal{
    @Override
    public String talk() {
        return "miauu";
    }

    @Override
    public String walk() {
        return "cat walkig";
    }

    @Override
    public String eat() {
        return "milk";
    }
}
