

public class methodsin {
    static int logic(int x, int y){
        int z;
        if (x>y) {
            z=x+y;
        } else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a=5;
        int b=7;
        // methodsin obj = new methodsin();
        // int c=obj.logic(a, b);
        int c = logic(a, b);
        System.out.println(c);
    }
}
