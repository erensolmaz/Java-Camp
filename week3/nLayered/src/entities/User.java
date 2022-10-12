package entities;

public class User {
    private int userId;
    private String fullName;
    private String adres;
    private int age;
    /**
     * @param userId
     * @param fullName
     * @param adres
     * @param age
     */
    public User(int userId, String fullName, String adres, int age) {
        this.userId = userId;
        this.fullName = fullName;
        this.adres = adres;
        this.age = age;
    }
    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }
    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /**
     * @return the adres
     */
    public String getAdres() {
        return adres;
    }
    /**
     * @param adres the adres to set
     */
    public void setAdres(String adres) {
        this.adres = adres;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    
}
