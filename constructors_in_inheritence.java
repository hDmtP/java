class Python{
    Python(){
        System.out.println("Python has many web frameworks");
    }
    Python(int n){
        System.out.println("Python has total: "+n+" web frameworks");
    }
}
class Django extends Python{
    Django(){
        super(0);
        System.out.println("Django is one of the most powerful webframework in python");
    }
    Django(int x, int y){
        super(x);
        System.out.println("Python has total: "+x*y+" web frameworks");
    }
}
class models extends Django{
    models(){
        System.out.println("Models are imp for django");
    }
    models(int x, int y, int z){
        super(x,y);
        System.out.println("Models are "+(x*y+z)+"% imp for django. this is overloaded const");
    }
}
public class constructors_in_inheritence {
    public static void main(String[] args) {
        Python pip = new Python();
        // Python pip = new Python(10);
        // Django django = new Django();
        // Django django = new Django(4,9);
        // models cod = new models();
        models cod = new models(4,9,5);
    }
}
