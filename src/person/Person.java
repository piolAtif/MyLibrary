package person;

public class Person {
    private Name name;
    private Age age;
    private Gender gender;
    private Address address;

    public Person(Name name, Age age, Gender gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    };

    public String getNameWithForenameFirst(){
        return String.format("%s %s",gender.toString(),name.forenameFirst());
    }

    public String getNameWithSurnameFirst(){
        return String.format("%s %s",gender.toString(),name.surnameFirst());
    }

    public String getNameAndCountryWithForenameFirst(){
        return gender.toString()+" "+name.forenameFirst()+", "+address.getCountry();
    };

    public String getNameAndCountryWithSurnameFirst(){
        return gender.toString()+" "+name.surnameFirst()+", "+address.getCountry();
    };

    public String getNameAndAddressWithForenameFirst(){
        return gender.toString()+" "+name.forenameFirst()+", "+address.getAddress();
    }

    public String getNameAndAddressWithSurnameFirst(){
        return gender.toString()+" "+name.surnameFirst()+", "+address.getAddress();
    }

    public String getNameAgeAndCountryWithForenameFirst(){
        return gender.toString()+" "+name.forenameFirst()+", "+address.getCountry()+", "+age.getAge();
    }

    public String getLDAWithAgeAndName(){
        if (age.isLegalDrivingAge())
            return String.format("%s, %s",getNameWithForenameFirst(),age.getAge());
        return "";
    }

    public String getAgeWithLDAForASpecificCountry(String command) {
        String countryAbbr = "-"+(address.getCountry().substring(0, 3).toLowerCase());
            if(countryAbbr.equals(command)){
                if (age.isLegalDrivingAge()) {
                    return String.format("%s, %s, %s",name.forenameFirst(),address.getCountry(),age.getAge());
            }
        }
        return "";
    }


    public String getCountry(){
        return address.getCountry();
    }
}
