package command.singleCommand;

import person.Person;

public class PrintWithName {
    String []commands = {"-f","-l","-fc","-lc"};
    Person []p;
    String command;

    public PrintWithName(String command, Person[] p) {
        this.command = command;
        this.p = p;
    }

    public boolean hasCommand(){
        System.out.println("length"+commands.length);
        for (int i = 0; i < commands.length; i++) {
            if(command.equals(commands[i])){
                return true;
            }
        }
        return false;
    }

    public void print(){
        switch (command){
            case "-f" : printFirstNameFirst();
                break;
            case "-l" : printLastNameFirst();
                break;
            case "-fc" : printFirstNameFirstWithCountry();
                break;
            case "-lc" : printLastNameFirstWithCountry();
                break;
        }
    }

    private void printLastNameFirst() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameWithSurnameFirst());
            }
        }
    }


    private void printFirstNameFirst() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameWithForenameFirst());
            }
        }
    }

    private void printFirstNameFirstWithCountry() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameAndCountryWithForenameFirst());
            }
        }
    }

    private void printLastNameFirstWithCountry() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameAndCountryWithSurnameFirst());
            }
        }
    }
}
