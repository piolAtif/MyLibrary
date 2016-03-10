package command.singleCommand;

import person.Person;

public class LabelWithCountry {
    Person[] p;
    String command;
    String[] commands = {"-lad", "-fad"};

    public LabelWithCountry(String command, Person[] p) {
        this.p = p;
        this.command = command;
    }

    public boolean hasCommand() {
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals(command)) {
                return true;
            }
        }
        return false;
    }

    public String print() {
        switch (command) {
            case "-fad":return printCountryWithFirstNameFirst();
            case "-lad":return printCountryWithLastNameFirst();
        }
        return "";
    }

    private String printCountryWithFirstNameFirst() {
        String personName = "";
        for (Person person : p)
            personName += person.getNameAndAddressWithForenameFirst()+"\n";
        return personName;
    }

    private String printCountryWithLastNameFirst() {
        String personName = "";
        for (Person person : p)
            personName += person.getNameAndAddressWithSurnameFirst()+"\n";
        return personName;
    }

}
