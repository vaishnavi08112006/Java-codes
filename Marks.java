import java.util.Scanner;
    class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     String[] subject = {"Tamil", "English", "Maths", "Science", "Social"};
        int[] marks = new int[5];
       System.out.println("Enter the marks:");
       for (int i = 0; i < subject.length; i++)
       { 
        System.out.print(subject[i] + ": ");
         marks[i] = sc.nextInt();
        }
        System.out.println("\nMarks Entered:");
        for (int i = 0; i < subject.length; i++) {
        System.out.println(subject[i] + " = " + marks[i]);
        }
        sc.close();
    }
}
