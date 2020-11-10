class MyMainEmployee{
    private int id;
    private String Name;

    public MyMainEmployee(String myName, int myId){
        Name = myName;
        id = myId;
    }
    public MyMainEmployee(int myId){
        id = myId;
    }
    public MyMainEmployee(String myName){
        Name = myName;
        id = 1;
    }
    public MyMainEmployee(){
        Name = "Homo Sapiens";
        id = 69;
    }

    public String getName(){
        return Name;}
    public void setName(String n){
        this.Name = n;}
    public int getId(){
        return id;}
    public void setId(int i){
        this.id = i;}
}
public class conStructors {
    public static void main(String[] args) {
    // MyMainEmployee Pritam = new MyMainEmployee();
    // MyMainEmployee Pritam = new MyMainEmployee("Dhara",991);
    MyMainEmployee Pritam = new MyMainEmployee(740);
    Pritam.setName("hDmtP");
    // Pritam.setId(7);
    System.out.println(Pritam.getName());
    System.out.println(Pritam.getId());
    
    }
}
