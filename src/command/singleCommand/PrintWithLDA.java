package command.singleCommand;

import person.Person;

public class PrintWithLDA {
    Person []p;
    String command;

    public PrintWithLDA(String command, Person []p) {
        this.p = p;
        this.command = command;
    }

    public boolean hasCommand(){
        return command.equals("-lda");
    }

    public void print(){
        printLegalDrivingAge();
    }

    private void printLegalDrivingAge() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                person.getNameAgeWithLDA();
            }
        }
    }
}
