package entities;

import command.Command;

public class Trainer {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void coach(){
        if(this.command==null){
            System.out.println("no command set");
            return;
        }
        this.command.execute();
    }

}
