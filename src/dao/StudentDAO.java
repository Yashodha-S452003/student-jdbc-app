package dao;

import model.Student;
import util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql = "INSERT INTO students(name, email, marks) VALUES (?, ?, ?)";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getMarks());

            ps.executeUpdate();

            System.out.println("✅ Student Inserted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
