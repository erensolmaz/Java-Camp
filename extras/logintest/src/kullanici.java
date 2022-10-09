public class kullanici {
    public String id;
    public String pw;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param id
     * @param pw
     */
    public kullanici(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }
    /**
     * @return the pw
     */
    public String getPw() {
        return pw;
    }
    /**
     * @param pw the pw to set
     */
    public void setPw(String pw) {
        this.pw = pw;
    }
    
    
}
