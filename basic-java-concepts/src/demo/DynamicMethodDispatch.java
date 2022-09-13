package demo;
class AA {
    public void show(){
        System.out.println("in AA");
    }
}
class BB extends AA{
    public void show(){
        System.out.println("in BB");
    }
//    public void config(){
//        System.out.println("config");
//    }
}

class CC extends AA{
    public void show(){
        System.out.println("in CC");
    }
}
public class DynamicMethodDispatch {
    public static void main(String [] args){
        // AA is the reference here and BB is the implementation
        AA object_AA = new BB();
        object_AA.show();

        // object_AA.config()
        // this will not work because class AA don't know config method

        object_AA = new CC();
        object_AA.show();
    }
}