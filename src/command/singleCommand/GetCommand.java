package command.singleCommand;

import person.Person;

public class GetCommand {
    String command;
    Person[] p;

    public GetCommand(String command, Person[] p) {
        this.command = command;
        this.p = p;
    }


    public void commandType(){
        PrintWithName name = new PrintWithName(command, p);
        PrintWithCountry country = new PrintWithCountry(command, p);
        PrintWithLDA lda = new PrintWithLDA(command, p);

        if(name.hasCommand()){
            name.print();
        }
        else if(country.hasCommand()){
            country.print();
        }
        else if(lda.hasCommand()){
            lda.print();
        }
        else{
            printWithCountry();
        }
    }

    private void printWithCountry() {
        for (int i = 0; i < p.length; i++) {
            for (Person person : p){
                person.getNameAgeAndCountryWithLDA(command);
            }
        }
    }



}
