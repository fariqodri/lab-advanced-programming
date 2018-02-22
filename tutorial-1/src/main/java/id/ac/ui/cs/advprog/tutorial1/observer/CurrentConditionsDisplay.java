package id.ac.ui.cs.advprog.tutorial1.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        // TODO Complete me!
    	this.observable = observable;
    	this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            // TODO Complete me!
        	WeatherData wd = (WeatherData) o;
        	this.temperature = wd.getTemperature();
        	this.humidity = wd.getHumidity();
        	display();
        }
    }
}
