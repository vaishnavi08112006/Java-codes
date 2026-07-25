class student{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class Main{
    public static void main(String[]args){
        student n =new student();
        n.setId(54);
        n.setName("vaishnavi");
        System.out.println("ID:" +n.getId());
        System.out.println("Name:" +n.getName());
    }
}
    

    
