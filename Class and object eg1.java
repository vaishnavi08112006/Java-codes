class Library {
    String title;
    int price;
    String author;
    String category;
    int year;

    Library(String title, int price, String author, String category, int year) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.category = category;
        this.year = year;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Library[] lib = new Library[2];

        Library s1 = new Library("Seragu", 700, "S.Sridhar", "Novel", 2023);
        lib[0] = s1;

        Library s2 = new Library("The Little Prince", 700, "S.Yalini", "Story", 2023);
        lib[1] = s2;

        for (int i = 0; i < lib.length; i++) {
            lib[i].display();
        }
    }
}
