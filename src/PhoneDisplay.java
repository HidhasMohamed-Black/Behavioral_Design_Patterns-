public class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Phone Display: Temp = " + temperature + "°C, Humidity = " + humidity + "%");
    }

}
