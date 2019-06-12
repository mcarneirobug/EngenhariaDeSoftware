package applicationFive;

public class Address {
    private String name, address, city, uf;
    private long phone, zipCode;

    public Address() {
        this.setName("Undefined");
        this.setAddress("xxx xxx xxx");
        this.setPhone(0000000);
        this.setZipCode(111111);
        this.setCity("Undefined");
        this.setUf("Undefined");
    }//end constructor()

    public Address(String name, String address, long phone, long zipCode,
                   String city, String uf) {
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setZipCode(zipCode);
        this.setCity(city);
        this.setUf(uf);
    }//end constructor()

    public String getName() {
        return this.name;
    }//end getName()

    public void setName(String name) {
        this.name = name;
    }//end setName()

    public String getAddress() {
        return this.address;
    }//end getAddress()

    public void setAddress(String address) {
        this.address = address;
    }//end setAddress()

    public String getCity() {
        return this.city;
    }//end getCity()

    public void setCity(String city) {
        this.city = city;
    }//end setCity()

    public String getUf() {
        return this.uf;
    }//end getUf()

    public void setUf(String uf) {
        this.uf = uf;
    }//end setUf()

    public long getPhone() {
        return this.phone;
    }//end getPhone()

    public void setPhone(long phone) {
        this.phone = phone;
    }//end setPhone()

    public long getZipCode() {
        return this.zipCode;
    }//end getZipCode()

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }//end setZipCode()
}//end class Address()