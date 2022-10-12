package entities;

public class Instructor {
    private String instructorFullName;
    private String instrructorDescription;
    /**
     * @param instructorFullName
     * @param instrructorDescription
     */
    public Instructor(String instructorFullName, String instrructorDescription) {
        this.instructorFullName = instructorFullName;
        this.instrructorDescription = instrructorDescription;
    }
    /**
     * @return the instructorFullName
     */
    public String getInstructorFullName() {
        return instructorFullName;
    }
    /**
     * @param instructorFullName the instructorFullName to set
     */
    public void setInstructorFullName(String instructorFullName) {
        this.instructorFullName = instructorFullName;
    }
    /**
     * @return the instrructorDescription
     */
    public String getInstrructorDescription() {
        return instrructorDescription;
    }
    /**
     * @param instrructorDescription the instrructorDescription to set
     */
    public void setInstrructorDescription(String instrructorDescription) {
        this.instrructorDescription = instrructorDescription;
    }
    
}
