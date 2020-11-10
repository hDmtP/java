class Animal{
    public void description(){
        System.out.println("Animals are animals in the java class of animals");
    }
}
class Dog extends Animal{
    public void ability(){
        System.out.println("Dog's BARK!!");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Animal zoo = new Animal();
        Dog puppy = new Dog();
        zoo.description();
        puppy.ability();
        puppy.description();
        
    }
}
