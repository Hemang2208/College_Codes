interface animal{
    void makesound();
    void eat();
}

class Dog implements animal{
    String name;
    public void makesound(){
        System.out.println("Woof! Woof!");
    }
    public void eat(){
        System.out.println(name + " eats kibble");
    }
    Dog(String name){
        this.name=name;
    }
}

class Cat implements animal{
    String name;
    public void makesound(){
        System.out.println("Meow! Meow!");
    }
    public void eat(){
        System.out.println(name + " eats fish");
    }
    Cat (String name){
        this.name=name;
    }
}

class main{
    public static void main(String args[]){
        Dog d1 = new Dog("Monty");
        Cat c1 = new Cat("Isabelle");

        d1.makesound();
        d1.eat();

        c1.makesound();
        c1.eat();
    }
}