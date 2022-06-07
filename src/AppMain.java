import command.Command;
import command.GetDownCommand;
import command.GetUpCommand;
import entities.OnlineTrainees;
import entities.Trainee;
import entities.Trainer;

public class AppMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Trainee trainee = new Trainee();
        OnlineTrainees onlineTrainee1 = new OnlineTrainees("Radko");
        trainee.subscribe(onlineTrainee1);
        OnlineTrainees onlineTrainee2 = new OnlineTrainees("Stefan");
        trainee.subscribe(onlineTrainee2);
        OnlineTrainees onlineTrainee3 = new OnlineTrainees("Milcho");
        trainee.subscribe(onlineTrainee3);
        Command getUpCommand = new GetUpCommand(trainee);
        Command getDownCommand = new GetDownCommand(trainee);
        trainer.setCommand(getUpCommand);
        trainer.coach();

        trainer.setCommand(getDownCommand);
        trainer.coach();
    }
}
