package TaskG4A10;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void voice() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " быстро бежит");
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', age=" + getAge() + ", breed='" + breed + "'}";
    }
}