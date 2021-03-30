
package problem4;

import java.util.Scanner;

public class Problem4 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        AddressBook a = new AddressBook();
        
        while(true)
        {
            System.out.println("  ---- Address Book ---\n");
        
            System.out.println("1 : Add Person"
                    + "\n2 : Add Special Person"
                    + "\n3 : Check Availibility of a Person"
                    + "\n4 : Print All Records"
                    + "\n5 : Search for Birthdays in a Month"
                    + "\n6 : Search for Persons having Birthday between Two Dates"
                    + "\n0 : Terminate");
            
            System.out.print("\nYour Choice"
                    + "\n\n>>> ");
            
            String option = s.next();
            
            if(option.equals("0"))
            {
                System.out.println("\nThank you for using our Software !\n");
                break;
            
            }
            System.out.println();
            
            switch(option)
            {
                case "1":
                {
                    a.addPerson();
                    break;
                }
                case "2":
                {
                    a.addSpecialPerson();
                    break;
                }
                case "3":
                {
                    a.CheckAvailibility();
                    break;
                }
                case "4":
                {
                    a.printAllDetails();
                    break;
                }
                case "5":
                {
                    a.birthMonth();
                    break;
                }
                case "6":
                {
                    System.out.println("\nEnter Number of Starting Month : ");
                    int m1 = s.nextInt();
                    
                    System.out.println("Enter Starting Year : ");
                    int y1 = s.nextInt();
                    
                    System.out.println("Enter Number of Ending Month");
                    int m2 = s.nextInt();
                    
                    System.out.println("Enter Ending Year : ");
                    int y2 = s.nextInt();
                    
                    a.searchBetweenDates(m1 ,y1 ,m2 ,y2);
                    break;
                }
                default:
                {
                    System.out.println("Wrong Entry");
                }
            }
            System.out.println("\n");
        }
    }
}