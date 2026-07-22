class Student {
    int rollNo;
    String name;
    String dept;
    String section;
    int year;

    Student(int rollNo, String name, String dept, String section, int year) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Section: " + section);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[2];

        Student s1 = new Student(41, "Sridhar", "IT", "A", 3);
        students[0] = s1;

        Student s2 = new Student(54, "Vaishu", "EEE", "B", 2);
        students[1] = s2;

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
