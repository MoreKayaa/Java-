interface BasicAnimalInterface {
    void eat();
    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Jumping");
    }

    void bite() {
        System.out.println("Biting");
    }
}

class Human extends Monkey implements BasicAnimalInterface {
    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    void talk() {
        System.out.println("Talking");
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
        human.talk();
    }
}