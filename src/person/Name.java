package person;
public class Name {
    private  String firstName;
    private  String lastName;
    private String name;

    public Name(String name){
        this.name = name;
    }
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String forenameFirst(){
        if(name != null)
            return String.format("%s",this.name);
        return String.format("%s %s",this.firstName,this.lastName);
    }

    public String surnameFirst(){
        if(name != null)
            return String.format("%s",this.name);
        return String.format("%s, %s",this.lastName,this.firstName);
    }
}
