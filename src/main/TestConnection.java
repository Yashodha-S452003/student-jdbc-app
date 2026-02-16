package main;

import dao.StudentDAO;
import model.Student;

public class TestConnection {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s = new Student("Yashodha", "yash@example.com", 90);

        dao.addStudent(s);
    }
}
