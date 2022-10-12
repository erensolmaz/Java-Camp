package entities;

import javax.xml.catalog.CatalogException;

public class Course {
    private int courseId;
    private String courseName;
    private String courseCategory;
    private String instructor;
    private double coursePrice;
    /**
     * @param courseId
     * @param courseName
     * @param courseCategory
     * @param instructor
     * @param coursePrice
     */
    public Course(int courseId, String courseName, String courseCategory, String instructor, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.instructor = instructor;
        this.coursePrice = coursePrice;
    }
    /**
     * @return the courseId
     */
    public int getCourseId() {
        return courseId;
    }
    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }
    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    /**
     * @return the courseCategory
     */
    public String getCourseCategory() {
        return courseCategory;
    }
    /**
     * @param courseCategory the courseCategory to set
     */
    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }
    /**
     * @return the instructor
     */
    public String getInstructor() {
        return instructor;
    }
    /**
     * @param instructor the instructor to set
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    /**
     * @return the coursePrice
     */
    public double getCoursePrice() {
        return coursePrice;
    }
    /**
     * @param coursePrice the coursePrice to set
     */
    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }


    
}
