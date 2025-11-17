package Observer_design;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer tv = new TVDisplay();
        Observer web = new WebDashboard();

        station.addObserver(phone);
        station.addObserver(tv);
        station.addObserver(web);

        float temp = 25;
        float humidity = 55;

        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Weather Update " + (i + 1) + " ---");
            station.setWeatherData(temp + i, humidity + i);
            Thread.sleep(2000);
        }

        System.out.println("\n*** Removing TV Display at runtime ***");
        station.removeObserver(tv);

        System.out.println("\n--- New Weather Update After Removing TV ---");
        station.setWeatherData(30, 70);
    }
}
