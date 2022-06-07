package command;

import entities.Trainee;

public class GetUpCommand implements Command {
    private Trainee trainee;

    public GetUpCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.getUp();
    }

    @Override
    public void undo() {
        this.trainee.getDown();
    }
}
