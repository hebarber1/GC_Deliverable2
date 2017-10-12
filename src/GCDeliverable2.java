import java.util.Scanner; // Calling in Scanner to get some user input.
import java.time.LocalDate; // Importing LocalDate
import java.time.Period;  // Importing Period

class GCDeliverable2 {

    public static void main(String[] args) {

        System.out.print("Enter the oldest date in YYYY-MM-DD format: ");

        Scanner scanner = new Scanner(System.in);

        String oldestDateString = scanner.nextLine();

        LocalDate oldestDate = LocalDate.parse(oldestDateString);

        System.out.print("Enter the most recent date in YYYY-MM-DD format: ");

        String newestDateString = scanner.nextLine();
        LocalDate newestDate = LocalDate.parse(newestDateString);
        
        Period difference = oldestDate.until(newestDate);

        int days = difference.getDays();
        int months = difference.getMonths();
        int years = difference.getYears();
        scanner.close();

        System.out.println("Your time difference is: " + months + " Months, " + days + " Days, and " + years + " Years.");
 
       
    }
}
