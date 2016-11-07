package observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {

	private float lastPressure;
	private float currentPressure=29.92f;
	
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}


	@Override
	public void update(Observable o, Object arg) {

		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData)o;
			
			display(weatherData.getWeather());
		}
	}


	@Override
	public void display(Weather data) {
		
		lastPressure=currentPressure;
		currentPressure=data.getPressure();
		System.out.println("ForecastDisplay currentPressure:"+currentPressure);
	}

}
