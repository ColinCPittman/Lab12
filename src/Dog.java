import java.util.Scanner;

public class Dog {
    public Dog(String name, int age, double weight, String furColor, String breed) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.furColor = furColor;
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getBreed() {
        return breed;
    }

    public void rename(String x) {
        this.breed = x;
    }
    public void bark(){
        System.out.println("Bark Bark!");
    }
    public void eat(double x) {
        weight += x;
    }
    private int age;
    private double weight;
    private String name, furColor, breed;

}
