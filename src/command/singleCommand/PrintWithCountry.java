package command.singleCommand;

import person.Person;

public class PrintWithCountry {
    Person []p;
    String command;
    String []commands = {"-lad","-fad"};

    public PrintWithCountry(String command, Person []p) {
        this.p = p;
        this.command = command;
    }

    public boolean hasCommand(){
        for (int i = 0; i < commands.length; i++) {
            if(commands[i].equals(command)){
                return true;
            }
        }
        return  false;
    }

    public void print(){
        switch (command){
            case "-fad": printCountryWithFirstNameFirst();
                break;
            case "-lad": printCountryWithLastNameFirst();
                break;
        }
    }

    private void printCountryWithFirstNameFirst() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameAndAddressWithForenameFirst());
            }
        }
    }

    private void printCountryWithLastNameFirst() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                System.out.println(person.getNameAndAddressWithSurnameFirst());
            }
        }
    }

}
