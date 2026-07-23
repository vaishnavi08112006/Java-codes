class mydaddy{
    void display2(){
        System.out.println("My Father is a Farmer");
    }
}
  class mysister extends mydaddy
  {
    void show(){
        System.out.println("My Siter is a Doctor");
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
           Obj.display2();
           mysister sis = new mysister();
           sis.show ();
           Obj.display();
       }
     }
  
    
