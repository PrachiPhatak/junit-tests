import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarDetailsTests {
    Car car;

    @Before
    public void setUp(){
        System.out.println("Before");
        car = new Car();
    }

    @Test
    public void getCarDetails(){
        //Arrange
        car = new Car();
        car.setMake("BMW");
        car.setModel("x5");
        car.setYear("2019");
        car.setElectric(false);

        //Act
        String details = CarUtils.getCarDetails(car);

        assertEquals("BMW x5 2019 false", details);
    }

    @Test
    public void getCarDetailsWithElectricTrue(){
        //Arrange
        car = new Car();
        car.setMake("Tesla");
        car.setModel("Model S");
        car.setYear("2020");
        car.setElectric(true);

        //Act
        String details = CarUtils.getCarDetails(car);

        assertEquals("Tesla Model S 2020 true", details);
    }

    @Test
    public void getErrorOnCarDetails(){
        //Arrange
        car = new Car();
        //Act
        String details = CarUtils.getCarDetails(car);
        //Assert
        assertEquals("Details not found", details);
    }

    @Test
    public void getErrorOnNullYearCarDetails(){
        //Arrange
        car = new Car();
        car.setMake("BMW");
        car.setModel("x5");
        //Act
        String details = CarUtils.getCarDetails(car);

        assertEquals("Details not found", details);
    }

    @Test
    public void testAddToMileage_noMileage_returnNull(){
        //Arrange
        Car car = new Car();

        //Assert
        assertEquals(1000.0, Car.addToMileage(car, 1000));
    }

    @Test
    public void testAddToMileage_withMileage_returnNewMileage(){
        //Arrange
        Car car = new Car();
        car.setMileage(1000);

        //Assert
        assertEquals(2000.0, Car.addToMileage(car, 1000));
    }


}
