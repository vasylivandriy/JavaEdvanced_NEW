
import java.io.IOException;

class SalaryManager {


    int salary(int salaryPerHour, int hoursWork, int hoursHospital, int hourHospitalSalary) {

        return salaryPerHour * (hoursWork - hoursHospital) + hoursHospital * hourHospitalSalary;

    }


    int hospitalSalary(int hoursHospital, int hourHospitalSalary) throws IOException {

        if (hoursHospital > 15) {
            throw new IOException("You inputted wrong (too much) hospital hours. Must be less then 15");
        } else {
            return hoursHospital * hourHospitalSalary;
        }
    }


    boolean isWorkSalary (int workSalary){

        if (workSalary<20000){
            try {
                throw new Exception("Hospital Salary can't be more then work salary. Worker was sicken too much time!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Boolean.parseBoolean(null);
        }
        else return workSalary>20000;


    }



}
