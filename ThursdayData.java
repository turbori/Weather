import java.util.Scanner;

public class ThursdayData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Thursday weather = new Thursday();
      String inputWeather;
      double inputTemperature;
   
      inputWeather = scnr.next();
      inputTemperature = scnr.nextDouble();
      weather.setWeather(inputWeather);
      weather.setTemperature(inputTemperature);

      System.out.println("Thursday: " + weather.getWeather());
      System.out.println("Temperature: " + weather.getTemperature() + " degrees Fahrenheit");
   }
}