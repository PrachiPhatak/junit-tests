public class CarUtils {

    public static String getCarDetails(Car car) {
        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();

        if (make == null || model == null || year == null)
            return "Details not found";
        return make + " " + model + " " + year;
    }
}
