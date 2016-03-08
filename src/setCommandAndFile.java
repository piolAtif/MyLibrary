import java.util.ArrayList;
import java.util.HashMap;

public class SetCommandAndFile {
    String []args;
    ArrayList<String> commands = new ArrayList<String>();
    ArrayList<String> files = new ArrayList<String>();

    public SetCommandAndFile(String[] args) {
        this.args = args;
    }

    public HashMap<String, ArrayList<String>> set(){
        HashMap<String, ArrayList<String>> list = new HashMap<String, ArrayList<String>>();
        for (String s: args){
            SegregatedArgs seg = new SegregatedArgs(s);
            seg.segregatedCommands(commands, files);
        }
        list.put("commands", commands);
        list.put("files", files);
        return list;
    }

}
