import javax.sql.rowset.spi.SyncResolver;

public class Person extends Customer {

    public String nationalIdentity;

    /**
     * @return the nationalIdentity
     */
    public String getNationalIdentity() {
        return nationalIdentity;
    }

    /**
     * @param nationalIdentity the nationalIdentity to set
     */
    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;

    }


    
    
}
