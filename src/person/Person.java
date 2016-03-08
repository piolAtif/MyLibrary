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
        return gender.toString()+ " "+ name.forenameFirst();
    }

    public String getNameWithSurnameFirst(){
        return gender.toString()+" "+name.surnameFirst();
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

    public void getNameAgeAndCountryWithLDA(String command) {
        String countryAbbr = "-"+(address.getCountry().substring(0, 3).toLowerCase());

            if(countryAbbr.equals(command)){
                if (age.isLegalDrivingAge()) {
                    System.out.println(gender.toString() + " " + name.forenameFirst()+", "+address.getCountry()+", "+age.getAge());
            }
        }
    }

    public void getNameAgeWithLDA(){
        if (age.isLegalDrivingAge())
            System.out.println(gender.toString() + " " + name.forenameFirst()+", "+age.getAge());
    }

    public String getCountry(){
        return address.getCountry();
    }
}
