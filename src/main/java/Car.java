public class Car {
    private String make;
    private String model;
    private String year;
    private double mileage;
    private boolean isElectric;

    public Car(){}

    public Car(String make, String model, String year, double mileage, boolean isElectric) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public static double addToMileage(Car car, double mileage){
        return car.getMileage() + mileage;
    }
}
