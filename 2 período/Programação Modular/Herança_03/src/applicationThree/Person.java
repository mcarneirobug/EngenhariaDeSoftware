package applicationThree;

public class Person {
    protected String name;

    public Person(String name) {
        this.setName(name);
    } //end construtor()

    public Person() {
        this.setName("Matheus");
    }//end constructor()

    public String getName() {
        return this.name;
    }//end getName()

    public void setName(String name) {
        this.name = name;
    }//end setName()
} //end class Person()
