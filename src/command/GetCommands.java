package command;

import command.multiCommands.Commands;
import command.singleCommand.Command;
import person.Person;

import java.util.ArrayList;

public class GetCommands {
    ArrayList<String> commands;
    String command;
    Person[] guests;

    public GetCommands(String command, Person[] person) {
        this.command = command;
        this.guests = person;
    }

    public GetCommands(ArrayList<String> commands, Person[] person) {
        this.commands = commands;
        this.guests = person;
    }

    public String giveCommand() {
        if (command != null) {
            return giveSingleCommand();
        }
        return giveMultiCommands();
    }

    public String giveSingleCommand() {
        Command com = new Command(command, guests);
        return com.commandType();
    }

    public String giveMultiCommands() {
        Commands com = new Commands(commands, guests);
        return com.commandType();
    }


}
