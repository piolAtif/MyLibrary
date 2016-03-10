package command.singleCommand;

import person.Person;

public class LabelWithLDA {
    Person[] p;
    String command;

    public LabelWithLDA(String command, Person[] p) {
        this.p = p;
        this.command = command;
    }

    public boolean hasCommand() {
        return command.equals("-lda");
    }

    public String print() {
        return printLegalDrivingAge();
    }

    private String printLegalDrivingAge() {
        String guests = "";
        for (Person person : p)
            if(person.getLDAWithAgeAndName().length() > 1)
                guests += person.getLDAWithAgeAndName()+"\n";
        return guests;
    }
}
