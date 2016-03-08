package person;

public class Age {
    int age;
    public Age(int age) {
        this.age = age;
    };

    public boolean isLegalDrivingAge(){
        return age > 20;
    }

    public String getAge(){
        return ""+this.age;
    }
}
