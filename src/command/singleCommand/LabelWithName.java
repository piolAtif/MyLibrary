package command.singleCommand;

import person.Person;

public class LabelWithName {
    String[] commands = {"-f", "-l", "-fc", "-lc"};
    Person[] p;
    String command;

    public LabelWithName(String command, Person[] p) {
        this.command = command;
        this.p = p;
    }

    public boolean hasCommand() {
        for (int i = 0; i < commands.length; i++) {
            if (command.equals(commands[i])) {
                return true;
            }
        }
        return false;
    }

    public String print() {
        switch (command) {
            case "-f":return printFirstNameFirst();
            case "-l":return printLastNameFirst();
            case "-fc":return printFirstNameFirstWithCountry();
            case "-lc":return printLastNameFirstWithCountry();
        }
        return "";
    }

    private String printLastNameFirst() {
        String personName = "";
        for (Person person : p)
            personName += person.getNameWithSurnameFirst()+"\n";
        return personName;
    }


    private String printFirstNameFirst() {
        String personName = "";
        for (Person person : p)
            personName += person.getNameWithForenameFirst()+"\n";
        return personName;
    }

    private String printFirstNameFirstWithCountry() {
        String personName = "";
        for (Person person : p)
            personName+= person.getNameAndCountryWithForenameFirst()+"\n";
        return personName;
    }

    private String printLastNameFirstWithCountry() {
        String personName = "";
        for (Person person : p)
            personName += person.getNameAndCountryWithSurnameFirst()+"\n";
        return personName;
    }
}
