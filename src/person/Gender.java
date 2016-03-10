package person;
public enum Gender {
    Female("Ms"),
    Male("Mr");
    public String gender;
    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }

    public boolean isSameGender(String gender){
        return this.gender.equals(gender);
    }


}
