package Question2;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {
    int difference;

    public static void main(String[] args) {
        DrivingLicenseApplication application = new DrivingLicenseApplication();
        application.getDateOfBirthFromUser();
    }

    private void getDateOfBirthFromUser() {

        try {
            Scanner user = new Scanner(System.in);

            System.out.println("Enter your birth year: ");
            String strYear = user.nextLine();
            int year = Integer.parseInt(strYear);

            System.out.println("Enter your birth month: ");
            String strMonth = user.nextLine();
            int month = Integer.parseInt(strMonth);

            System.out.println("Enter your birth day: ");
            String strDay = user.nextLine();
            int day = Integer.parseInt(strDay);

            Date now = new Date();

            Date userDate = new GregorianCalendar(year, month - 1, day).getTime();

            difference = (int) ChronoUnit.DAYS.between(userDate.toInstant(), now.toInstant());
            AgeLimit(difference);
            System.out.println("You are qualified!");
        } catch (Exception1 e1){
            e1.error();
        }
    }

    public void AgeLimit(int difference) throws Exception1{
        if (365 * 16 > difference) {
            throw new Exception1();
        }
    }

    public class Exception1 extends Exception {
        public void error(){
            System.out.println("The age of the applicant is "+ difference/365 +", which is too early to apply for a driving license");
            System.out.println();
        }
    }
}
