package command.multiCommands;

import person.Person;

import java.util.ArrayList;

public class Commands {
    ArrayList<String> commands;
    Person[] persons;

    public Commands(ArrayList<String> commands, Person[] persons) {
        this.commands = commands;
        this.persons = persons;
    }


    public String commandType() {
        String guests = "";
        for (int i = 0; i < commands.size(); i++) {
            switch (commands.get(i)) {
                case "-f":guests += printFirstNameFirst();
                case "-lda":guests += printLdaAge();
            }
        }
        return guests;
    }

    private String printLdaAge() {
        String eligiblePerson = "";
        for (Person person : persons) {
            eligiblePerson += person.getLDAWithAgeAndName();
        }
        return eligiblePerson;
    }

    private String printFirstNameFirst() {
        String personsName = "";
        for (Person person : persons) {
            personsName += person.getNameWithForenameFirst();
        }
        return personsName;
    }

}
