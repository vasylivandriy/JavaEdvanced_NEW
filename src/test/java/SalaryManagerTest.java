import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

public class SalaryManagerTest {

    private SalaryManager salaryManager;


    @Before
    public void setup() {

        salaryManager = new SalaryManager();
    }


    @Test
    public void salaryTest() {

        int salaryPerHour1 = 200;
        int hoursWork1 = 172;
        int hoursHospital1 = 61;
        int hourHospitalSalary1 = 100;

        int actual = salaryManager.salary(salaryPerHour1, hoursWork1, hoursHospital1, hourHospitalSalary1);
        int expected = 20200;

        Assert.assertEquals("It is not true", expected, actual);
    }


    @Test
    public void hospitalSalaryTest() throws IOException {

        int hoursHospital2 = 61;
        int hourHospitalSalary2 = 100;

        int actual = salaryManager.hospitalSalary(hoursHospital2, hourHospitalSalary2);
        int expected = 1500;
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(actual > 1000);
    }

    @Test
    public void isWorkSalaryTest20Thous() {

        int salaryPerHour1 = 200;
        int hoursWork1 = 172;
        int hoursHospital1 = 61;
        int hourHospitalSalary1 = 100;

        boolean actual = salaryManager.isWorkSalary(salaryManager.salary(salaryPerHour1, hoursWork1, hoursHospital1, hourHospitalSalary1));
        boolean expected = true;

        Assert.assertTrue(actual);

    }


}