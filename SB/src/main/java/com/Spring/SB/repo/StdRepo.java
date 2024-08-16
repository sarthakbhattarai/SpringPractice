package com.Spring.SB.repo;

import com.Spring.SB.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StdRepo {


    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student std) {
        try{
            System.out.println("enter");
            String sql = "insert into student(rollno,name,marks) values (?,?,?)";
            System.out.println("enter");
            int reo=jdbc.update(sql, std.getRollNo(), std.getName(), std.getMarks());
            System.out.println("enter");
            System.out.println("something affectes as"+reo);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }

    public List<Student> getAll(Student std) {


        String sql = "Select * from student";


        RowMapper<Student> map = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setRollNo(rs.getInt("marks"));

                return s;
            }
        };
        return jdbc.query(sql, map);

//        std.getName();
//        std.getRollNo();
//        std.getMarks();
//
//
//        stud.add(std);
//        return stud;
    }
}
