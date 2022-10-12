package dataAccess;

import javax.xml.crypto.Data;

import entities.Category;
import entities.Course;
import entities.Instructor;
import entities.User;

public class JdbcDataDao implements DataDao {

    @Override
    public void add(User user) {
        System.out.println("User added with JDBC");
        
    }

    @Override
    public void add(Category category) {
        System.out.println("Category added with JDBC");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course added with JDBC");
        
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with JDBC");
        
    }
    
}
