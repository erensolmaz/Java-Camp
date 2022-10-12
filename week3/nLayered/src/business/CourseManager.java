package business;

import java.util.List;

import core.logger;
import dataAccess.DataDao;
import entities.Course;

public class CourseManager {
    private List<Course> courses;
    private DataDao dataDao;
    private logger[] loggers;
    /**
     * @param courses
     * @param dataDao
     * @param loggers
     */
    public CourseManager(List<Course> courses, DataDao dataDao, logger[] loggers) {
        this.courses = courses;
        this.dataDao = dataDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        if(course.getCoursePrice()<0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz");

        }



        for(Course courses : courses){
            if(courses.getCourseName().equals(course.getCourseName())){
            throw new Exception("Kurs isimleri aynı olamaz");
    }
}
    dataDao.add(course);
    courses.add(course);

    for (logger logger : loggers) {
        logger.log(course.getCourseName());
        
    }
    

    }
}