package demo;

class A1{
    public void show(){
        System.out.println("in A1");
    }
}

class B1 extends A1 {
    // Let's say when you tried to override the method you made a typo in the method name ( show1() )
    // so you can use an annotation like @Override
    // when you use the annotation that typo will become an error
    // when you use this instead of getting a semantic error you will get a compiled time error
    @Override
    public void show(){
        // let's say you want to call the show method in superclass
        // to do that you can use super.show();
        // now you will get the both show methods ( in A1 and B1 )
        // from using super.  you can access the superclass methods and variables
        super.show();
        System.out.println("in B1");
    }
}

public class OverridingDemo {
    public static void main(String[] args){
        B1 object_B1 = new B1();
        // if you don't have show method in B1 it will call the show method in A1
        // but if you have that in B1 it will call the show method in B1
        // method overriding is subclass method will override the superclass method
        object_B1.show();
    }
}