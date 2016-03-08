package command.singleCommand;

import person.Person;

public class f extends GetCommand {

    public f(String command, Person[] p) {
        super(command, p);
    }

    @Override
    public void commandType() {
        printFirstNameFirst();
    }

    private void printFirstNameFirst() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameWithForenameFirst());
            }
        }
    }
}
