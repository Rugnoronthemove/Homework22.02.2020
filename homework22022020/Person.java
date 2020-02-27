package homework22022020;

//Write a class with the name Person.
// The class needs three fields (instance variables) with the names firstName,
// lastName of type String and age of type int.

public class Person {

    //3 instance variables
    String firstName;
    String lastName;
    int age;

    //*Method named getFirstName without any parameters,
    // it needs to return the value of the firstName field.
    public String getFirstName() {
        return firstName;
    }

    //*Method named getLastName without any parameters,
    // it needs to return the value of the lastName field.
    public String getLastName() {
        return lastName;
    }

    //Method named getAge without any parameters,
    //it needs to return the value of the age field.
    public int getAge() {
        return age;
    }

    //Method named setFirstName with one parameter of type String,
    //it needs to set the value of the firstName field.
    public void setFirstName(String firstName) {
        System.out.println(getFirstName());
        //fn = firstName;
    }

    //Method named setLastName with one parameter of type String,
    //it needs to set the value of the lastName field.
    public void setLastName(String lastName) {
        System.out.println(getLastName());
        //ln = lastName;
    }


    //Method named setAge with one parameter of type int,
    //it needs to set the value of the age field.
    //If the parameter is less than 0 or greater than 100,
    //it needs to set the age field value to 0.
    public void setAge(int age) {
        if (age < 0 || age > 100)
            System.out.println(getAge());
    }

    //Method named isTeen without any parameters,
    //it needs to return true if the value of the age field is greater than 12 and less than 20,
    //otherwise, return false
    public boolean isTeen() {
        return age > 12 || age < 20;
    }
    //if (age > 12 ^ age < 20) {
    //  System.out.println(true);
    //} else {
    //System.out.println(false);
    //};
    //}
    //return true;
    //}

    /*Method named getFullName without any parameters,
     it needs to return the full name of the person.*/
    //In case both firstName and lastName fields are empty, Strings return an empty String.
    //In case firstName is an empty String, return firstName.
    //In case lastName is an empty String, return lastName.
    public String getFullName() {
        //String firstName = "John";
        //String lastName= "Smith";
        //String fullName = firstName + lastName;
        //String fulln = (getFirstName() + getLastName());
        //if (fulln.isEmpty()){
        //System.out.println();}
        //if (getFirstName().isEmpty()) {
        //System.out.println("firstName");}
        //if (getLastName().isEmpty()) {
        //System.out.println("lastName");}
        //else {
        //System.out.println(fulln);
        //}
        //return fullName;
        String fullName = firstName + lastName;
        return firstName + lastName;
        //return ("John" + "Smith");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}

            /*OUTPUT
            fullName=
            teen= false
            fullName= John
            teen= true
            fullName= John Smith*/


