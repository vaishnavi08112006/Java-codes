class parent{
    void display(){
        System.out.println("My Grandpa is a Farmer");
    }
}
  class mydaddy extends parent
  {
    void show(){
        System.out.println("My Father is a Weaver");
    }
}
  class Me extends mydaddy {
    void display(){
        System.out.println("I am a Freelance");
    }
}
   public class Main{
       public static void main (String[]args){
           Me Obj = new Me();
           Obj.display();
           Obj.show();
           Obj.display();
       }
     }
  
    
