package command;

import entities.Trainee;

public class GetDownCommand implements Command {
    private Trainee trainee;

    public GetDownCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.getDown();
    }

    @Override
    public void undo() {
        this.trainee.getUp();
    }
}
