interface camera{
    void photo();
}
interface Music{
    void  playMusic();
}
class mobile implements camera,Music{
    public void photo(){
        System.out.println("Photo Taken");
    }
    public void playMusic(){
        System.out.println("Music Playing");
    }
}
public class Main{
    public static void main(String[]args){
        mobile m=new mobile();
        m.photo();
        m.playMusic();
    }
}
