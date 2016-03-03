package person;
public enum Gender {
    Female("Ms"),
    Male("Mr");
    private String gender;
    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
