package Observer_design;

public class TVDisplay implements Observer{
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("TV Display: Temp = " + temperature + "°C, Humidity = " + humidity + "%");
    }
}
