import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

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

        //Act
        String details = CarUtils.getCarDetails(car);

        assertEquals("BMW x5 2019", details);
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
}
