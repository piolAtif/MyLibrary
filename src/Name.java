public class Name {
    private  String firstName;
    private  String lastName;

    Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String forenameFirst(){
        return this.firstName+" "+this.lastName;
    }

    public String surnameFirst(){
        return this.lastName+" "+this.firstName;
    }
}
