package entities;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {

    private List<Observer> observers;
    private Boolean isDown;

    public Trainee(){
        this.observers = new ArrayList<>();
    }

    public void getDown() {
        System.out.println("Trainee is getting down");
        this.isDown = true;
        this.notifyObservers();
    }

    public void getUp() {
        System.out.println("Trainee is getting up");
        this.isDown = false;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTrainee(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setTrainee(null);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:this.observers) {
            observer.update();
        }
    }

    @Override
    public Boolean getExercise() {
        return this.isDown;
    }
}
