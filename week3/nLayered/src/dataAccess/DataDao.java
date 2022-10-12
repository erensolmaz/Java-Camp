package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;
import entities.User;

public interface DataDao {
    void add(User user);
    void add(Category category);
    void add(Course course);
    void add(Instructor instructor);
    
}
