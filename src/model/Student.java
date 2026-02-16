package model;

public class Student {

    private String studentname;
    private String email;
    private int marks;

    public Student(String name, String email, int marks) {
        this.studentname = name;
        this.email = email;
        this.marks = marks;
    }

    public String getName() { return studentname; }
    public String getEmail() { return email; }
    public int getMarks() { return marks; }
}
