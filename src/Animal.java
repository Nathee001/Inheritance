class Animal{
    void eat(){
        System.out.println("Chaw.......Chaw........");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Bowwwww.......Bowwwwwwwww");
    }
}
class Babydog extends Dog{
    void weep(){
        System.out.println("BEeeeeee.......Beeeeeeeeee");
    }
}
class TestInheritance{
    public static void main(String[] args) {
        Babydog bd= new Babydog();
        bd.weep();
        bd.Bark();
        bd.eat();
    }
}


