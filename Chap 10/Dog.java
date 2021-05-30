package c.inheritance;

public class Dog extends Animal {
	ublic void sleep() {
        System.out.println(this.name + "쿨쿨~");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
