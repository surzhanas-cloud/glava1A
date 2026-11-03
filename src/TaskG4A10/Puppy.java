package TaskG4A10;

public class Puppy extends Dog {

    public Puppy(String name, int age, String breed) {
        super(name, age, breed);
    }

    public void jump() {
        System.out.println(getName() + " прыгает");
    }

    public void bite() {
        System.out.println(getName() + " кусает");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " говорит: Тяф-тяф!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бегает, смешно перебирая лапками");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Puppy{name='" + getName() + "', age=" + getAge() + ", breed='" + getBreed() + "'}";
    }
}