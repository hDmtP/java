class phone{
    public void storage(){
        System.out.println("8 MB");
    }
    public void model(){
        System.out.println("Nokia 3310");
    }
}
class smartphone extends phone{
    public void ram(){
        System.out.println("4 GB");
    }
    public void name(){
        System.out.println("Vivo Y19");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone obj = new phone();
        // obj.name();
        // obj.greet();

        // smartphone obj2 = new smartphone();
        // obj2.swagat();
        // obj2.name();

        phone dispatch = new smartphone();
        dispatch.model();
        dispatch.ram();

    }
}
