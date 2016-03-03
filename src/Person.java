class Person {
    private Name name;
    private int age;
    private Gender gender;
    private Address address;

    public Person(Name name, int age, Gender gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    };

    public String getNameAndCountryWithForenameFirst(){
        return gender.toString()+" "+name.forenameFirst()+", "+address.getCountry();
    };

    public String getNameAndCountryWithSurnameFirst(){
        return gender.toString()+" "+name.surnameFirst()+", "+address.getCountry();
    };

    public String nameAndGenderWithForenameFirst(){
        return gender.toString()+" "+name.forenameFirst();
    }

    public String nameAndGenderWithSurnameFirst(){
        return gender.toString()+" "+name.surnameFirst();
    }


}
