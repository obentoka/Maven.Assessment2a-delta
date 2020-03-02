package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    Long id;
    String name;
    Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        address = new Address();
    }

    public Long getId() {
        try{
            return id;
        }catch (NullPointerException e){
            return Long.MIN_VALUE;
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        try {
            return name;
        }catch (NullPointerException e){
            return "";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        try {
            return address;
        }catch (NullPointerException e){
            address = new Address();
            return address;
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{id=" + getId() + ", name='" + getName() + "', " +
                "address=Address{addressLine1='" + address.getAddressLine1() + "', addressLine2='" + address.getAddressLine2() + "', " +
                "city='" + address.getCity() + "', state='" + address.getState() + "', zipcode='" + address.getZipcode() +"'}}";
    }

    public boolean equals(Person o) {
        if(!this.getName().equals(o.getName()))
            return false;
        if(!this.getId().equals(o.getId()))
            return false;
        if(!this.getAddress().equals(o.getAddress()))
            return false;
        if(!this.toString().equals(o.toString()))
            return false;
        return true;
    }
}