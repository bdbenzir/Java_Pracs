import java.util.Scanner; // to read from a file
import java.io.File; // to create a file
import java.io.PrintWriter; // to write to a file
import java.lang.reflect.Array;
import java.io.IOException; // to use files
import java.text.DecimalFormat; // to format numbers for printing
import java.io.BufferedReader;

/**
 * This class can be used to process precipitation data for 5 years. It will
 * read 5 years of monthly data from a data file called precip.dat containing 1
 * data point per line. It will create a report containing a table of the data
 * as well as monthly averages and yearly totals. It will also find the maximum
 * and minimum precipitation and display it with the table in the report.
 * Written by YOUR NAME HERE TODAY'S DATE HERE
 */
public class Precipitation {
    private final static int MONTHS = 12;
    private final static int YEARS = 5;
    private final static int STARTYEAR = 2015;
    private final String[] monthLabel = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
            "Dec" };

    // DECLARE ARRAYS HERE FOR TASK #2
    private double[][] data;
    private double[] monthlyAverage;
    private double[] yearTotal;

    public Precipitation() {
        // CREATE THE ARRAYS OF THE CORRECT SIZE HERE FOR TASK #2
        // (USE THE CLASS CONSTANTS)

        data = new double[YEARS][MONTHS];
        monthlyAverage = new double[MONTHS];
        yearTotal = new double[YEARS];
    }

    public void readFile(Scanner infile) throws IOException {

        // CREATE A LOOPING STRUCTURE TO READ DATA FROM THE FILE AND
        // STORE IT INTO THE 2-D ARRAY FOR TASK #3

        while (infile.hasNext()) {

            for (int i = 0; i < data.length; i++) {

                for (int j = 0; j < data[0].length; j++) {

                    data[i][j] = infile.nextDouble();
                }
            }
        }
        infile.close();
        calculateMonthlyAverage();
        calculateYearTotal();
    }

    private void calculateMonthlyAverage() {

        // CREATE A LOOPING STRUCTURE TO CALCULATE THE MONTHLY AVERAGE
        // FOR EACH COLUMN AND STORE IT INTO THE MONTHLY AVERAGE ARRAY
        // FOR TASK #3

        for (int i = 0; i < 12; i++) {
            double sum = 0;
            for (int j = 0; j < data.length; j++) {

                sum += data[j][i];
            }

            monthlyAverage[i] = sum / data.length;
        }

    }
    private void calculateYearTotal() {

        for (int i = 0; i < data.length; i++) {

            double sum = 0;
            for (int j = 0; j < data[0].length; j++) {
                sum += data[i][j];
            }
            yearTotal[i] = sum;
        }
    }
    public String findMax() {
        // TASK #4
        // SEARCH THE ARRAY FOR THE LARGEST AMOUNT OF PRECIPITAION
        // SAVE THE AMOUNT, MONTH, AND YEAR.
        int year = 0, month = 0;
        double max = 0;
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[0].length; j++) {

                if (max < data[i][j]) {

                    max = data[i][j];
                    year = i;
                    month = j;
                }
            }
        }
        return "The maximum precipitation is: " + max + " on " + monthLabel[month] + "/" + (2015 + year);
        // RETURN A STRING CONTAINING INFORMATION ABOUT THE MAXIMUM PRECIPITATION
    }

    public String findMin() {
        // TASK #4
        // SEARCH THE ARRAY FOR THE SMALLEST AMOUNT OF PRECIPITAION
        // SAVE THE AMOUNT, MONTH, AND YEAR.

        int year = 0, month = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[0].length; j++) {

                if (min > data[i][j]) {

                    min = data[i][j];
                    year = i;
                    month = j;
                }
            }
        }
        return "The minimum precipitation is: " + min + " on " + monthLabel[month] + "/" + (2015 + year);
        // RETURN A STRING CONTAINING INFORMATION ABOUT THE MINIMUM PRECIPITATION
    }

    public void printTable(PrintWriter outfile) {
        // OUTPUT THE TABLE USING NICELY FORMATTED NUMBERS #.##
        // AND NEAT COLUMNS FOR TASK #5
        outfile.printf("%10s", "Year");
        for (int i = 0; i < monthLabel.length; i++) {

            outfile.printf("%10s", monthLabel[i]);
        }
        outfile.printf("%10s\n", "Total");

        for (int i = 0; i < data.length; i++) {
            outfile.printf("%10d", (2015 + i));
            for (int j = 0; j < data[0].length; j++) {

                outfile.printf("%10.2f", data[i][j]);
            }
            outfile.printf("%10.2f\n", yearTotal[i]);

        }
        outfile.printf("%10s", "Ave");
        for (int i = 0; i < data[0].length; i++) {

            outfile.printf("%10.2f", monthlyAverage[i]);
        }
        outfile.println();
        outfile.println("\t" + findMax());
        outfile.close();
    }

    public static void main(String[] args) throws IOException {
        Precipitation wetStuff = new Precipitation();

        // TASK #1
        // CREATE A Scanner OBJECT CALLED infile TO CONNECT WITH THE INPUT FILE:
        // precip.dat

        Scanner infile = new Scanner(new File("precip.dat"));
        // CREATE A PrintWriter OBJECT CALLED outfile TO CONNECT WITH THE OUTPUT FILE:
        // precip.out
        PrintWriter outfile = new PrintWriter(new File("precip.out"));
        // UNCOMMENT THE LINES BELOW ONCE YOU HAVE CREATED YOUR OBJECTS
        wetStuff.readFile(infile);
        wetStuff.printTable(outfile);
    }
}