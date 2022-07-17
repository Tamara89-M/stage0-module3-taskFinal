package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
       double temperatureFahrenheit = (double)temperatureCelsius * 9/5 + 32;
        System.out.println(temperatureFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toFahrenheit(1);
    }
}
