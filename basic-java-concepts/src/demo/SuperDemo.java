package demo;

// superclass
class A{
    public A(){
        System.out.println("in A");
    }

    public A(int i){
        System.out.println("in A int");
    }

}
// subclass
class B extends A{
    public B(){
        // Every constructor in subclass will have a by default method called as super
        // even if you don't mention super it will be there
        super();
        System.out.println("in B");
    }
    public B(int i){
        // Every constructor in subclass will have a by default method called as super
        // even if you don't mention super it will be there
        // super means it will call the constructor in superclass
        // if you don't pass an argument in super it will call the default constructor in the superclass
        // if you pass above i parameter this will call the parameterized constructor
        super(i);
        System.out.println("in B int");
    }
}
public class SuperDemo {
    public static void main(String [] args){
        A object_of_A = new A();
        System.out.println();

        // when you create an object of a subclass it is calling the superclass constructor and the subclass constructor
        B object_of_B = new B();
        System.out.println();


        System.out.println("If we pass a value");
        // if we pass a value
        A object_of_A_int = new A(10);
        System.out.println();

        // whenever you create an object of a subclass by specifying the parameter
        // it will call the specified constructor of subclass,
        // but it will call the default constructor of superclass
        B object_of_B_int = new B(10);

        // so how to call to parameterize constructor in superset
        // Every constructor in subclass will have a by default method called as super
        // even if you don't mention super it will be there

        // if you want to call the default constructor(B - subclass) and the parameterized constructor(A - superclass)
        // you can pass a value from the super in default constructor
    }
}