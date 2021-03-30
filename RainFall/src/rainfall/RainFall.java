
package rainfall;

import java.util.Scanner;

public class RainFall
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[] rainfall = new double[12];
        
        double annualAverage,
                sum = 0.0;
        
        String[] monthName = new String[12];
        
        monthName[0] = "January";
        monthName[1] = "Febuary";
        monthName[2] = "March";
        monthName[3] = "April";
        monthName[4] = "May";
        monthName[5] = "June";
        monthName[6] = "July";
        monthName[7] = "August";
        monthName[8] = "September";
        monthName[9] = "Octuber";
        monthName[10] = "November";
        monthName[11] = "December";
        
        for (int i = 0; i < rainfall.length; i++)
        {
            System.out.print("Rainfall for " + monthName[i] + " : ");
            rainfall[i] = scanner.nextDouble();
            sum += rainfall[i];
        }
        annualAverage = sum / rainfall.length;
        System.out.println(annualAverage);
    }
    
}
