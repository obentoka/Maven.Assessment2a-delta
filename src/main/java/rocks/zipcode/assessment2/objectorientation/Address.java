package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {

    private String firstAddressLine;
    private String secondAddressLine;
    private String city;
    private String state;
    private String zipcode;

    public Address() {
        firstAddressLine = "";
        secondAddressLine = "";
        city = "";
        state = "";
        zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        firstAddressLine = addressLine1;
        secondAddressLine = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return firstAddressLine;
    }

    public void setAddressLine1(String addressLine1) {
        firstAddressLine = addressLine1;
    }

    public String getAddressLine2() {
        return secondAddressLine;
    }

    public void setAddressLine2(String addressLine2) {
        secondAddressLine = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstAddressLine='" + firstAddressLine + '\'' +
                ", secondAddressLine='" + secondAddressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this.toString().equals(o.toString()))
            return true;
        else
            return false;
    }
}
