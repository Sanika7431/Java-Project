package SYCLass;

import java.util.Scanner;

class Stud {
    int rollNo;
    String name;
    double percentage;

    // Constructor
    Stud(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    void display() {
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Student Percentage: " + percentage);
        System.out.println("--------------------------");
    }

    static void sortStudents(Stud[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].percentage < students[j].percentage) {
                    // Swap students
                    Stud temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Stud[] students = new Stud[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Student Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Percentage: ");
            double per = sc.nextDouble();

            students[i] = new Stud(roll, name, per);
        }
        sortStudents(students);

        System.out.println("\n--- Students sorted by Percentage (High to Low) ---");
        for (Stud s : students) {
            s.display();
        }

        sc.close();
    }
}