package entities;

import observer.Observable;
import observer.Observer;

public class OnlineTrainees implements Observer {
    private Observable trainee;
    private String name;

    public OnlineTrainees(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Boolean isTrainerDown;
        if (this.trainee == null) {
            System.out.println("No trainee set");
            return;
        }
        isTrainerDown = this.trainee.getExercise();
        if(isTrainerDown){
            System.out.println(this.name + " is getting down");
        }
        else{
            System.out.println(this.name + " is getting up");
        }
    }

    @Override
    public void setTrainee(Observable trainee) {
        this.trainee = trainee;
    }
}
