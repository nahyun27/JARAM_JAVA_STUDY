package c.inheritance;

public class Cat extends Animal {
    public void cry() {
        System.out.println(this.name+"냐옹~");
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat.setName("happy");
        Cat.cry();
    }

}
