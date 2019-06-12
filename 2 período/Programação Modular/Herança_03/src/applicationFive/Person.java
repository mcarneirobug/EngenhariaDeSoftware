package applicationFive;

public class Person extends Address{

    public Person() {
        super();
    }//end constructor()

    public Person(String name, String address, long phone, long zipCode,
                  String city, String uf) {
        super(name, address, phone, zipCode, city, uf);
    }//end constructor()
} //end class Person()
