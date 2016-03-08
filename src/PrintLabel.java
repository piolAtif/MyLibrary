import command.singleCommand.GetCommand;
import person.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintLabel {
    public static void main(String[] args) throws IOException {
        setArguments(args);
    }

    private static HashMap<String, ArrayList<String>> seperateCommandsAndFiles(String[] args) {
        SetCommandAndFile sc = new SetCommandAndFile(args);
        return sc.set();
    }

    private static void setArguments(String []args) throws IOException {
        HashMap<String, ArrayList<String>> list= seperateCommandsAndFiles(args);
        Person[] people = readFile(list.get("files"));
        printTheLable(list.get("commands"),people);
    }

    private static void printTheLable(ArrayList<String> commands, Person[] people) {
        GetCommand gc = new GetCommand(commands.get(0), people);
        gc.commandType();
    }

    private static Person[] readFile(ArrayList<String> files) throws IOException {
        Record r = new Record(files.get(0));
        return r.read();
    }
}
