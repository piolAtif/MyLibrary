import java.util.List;

public class SegregatedArgs {
    String args;
    public SegregatedArgs(String args) {
        this.args = args;
    };

    public void segregatedCommands(List commands, List files){
        String []arg = args.split("");
        if(arg[1].equals(new String("-"))){
            commands.add(args);
        }
        else{
            files.add(args);
        }
    };
}
