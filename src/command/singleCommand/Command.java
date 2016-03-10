package command.singleCommand;

import person.Person;

public class Command {
    String command;
    Person[] p;

    public Command(String command, Person[] p) {
        this.command = command;
        this.p = p;
    };

    public String commandType() {
        LabelWithName name = new LabelWithName(command, p);
        LabelWithCountry country = new LabelWithCountry(command, p);
        LabelWithLDA lda = new LabelWithLDA(command, p);

        if (name.hasCommand()) {
            return name.print();
        } else if (country.hasCommand()) {
            return country.print();
        } else if (lda.hasCommand()) {
            return lda.print();
        }
        return printWithCountry();

    };

    private String printWithCountry() {
        String legalPersonForDrinking = "";
        for (Person person : p)
            if(person.getAgeWithLDAForASpecificCountry(command).length() > 1)
                legalPersonForDrinking += person.getAgeWithLDAForASpecificCountry(command)+"\n";
        return legalPersonForDrinking;
    };
};
