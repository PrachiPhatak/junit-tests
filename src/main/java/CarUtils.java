public class CarUtils {

    public static String getCarDetails(Car car) {
        if (car.getMake() == null || car.getModel() == null || car.getYear() == null)
            return "Details not found";
        return car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + car.isElectric();
    }
}
