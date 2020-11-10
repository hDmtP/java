class cuboid{
    private double volume;
    // private double radius;
    double radius = 4;
    double height = 5.56;

    public void setVolume(double v){
        this.volume = v;
        if (volume == 3.14*(radius*radius)*height) {
            System.out.println("\t\t\t\t\t*****CORRECT CHOICE*****");
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
    public double getVolume(){
        return volume;
    }

    // public cuboid(double myHeight, double myRadius){
    //     height = myHeight;
    //     radius = myRadius;
    // }

    // public double getVolume(){
    //     return (3.14*(radius*radius)*height);
    // }
    // public void setVolume(double h, double r){
    //     this.height = h;
    //     this.radius = r;
    // }
}
public class constructors_ex {
    public static void main(String[] args) {
        cuboid pir2h = new cuboid();
        pir2h.setVolume(279.3344);
        System.out.println(pir2h.getVolume());
    }
}
