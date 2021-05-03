
package airlinereservationssystem;

import java.util.Scanner;
import java.time.LocalTime;

public class Program
{
    Scanner s = new Scanner(System.in);
    
    int n = 0;
    
    int[] BCSR = new int[10];
    int[] ECSR = new int[10];
    int[] LECSR = new int[10];
    
    public void Start()
    {
        System.out.println("Welcome to Airline Resevation Portal\n\nEnter any of the following to continue with reservation\n");    
        ReservationsAll();
    }
    
    public void ReservationsAll()
    {
        System.out.print("1 : Business Class\n2 : Economy Class\n3 : Lower Economy Class\n0 : Terminate\n\n>>> ");
        
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "3".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Business Class\n2 : Economy Class\n3 : Lower Economy Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                BCSR();
                break;
            case "2":
                ECSR();
                break;
            case "3":
                LECSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void BCSR()
    {
        for (int i = 0; i < 10; i++)
        {
            if (BCSR[i] == 0)
            {
                BCSR[i] = 1;
                BookedBC(i);
                break;    
            }
            else if (BCSR[9] == 1)
            {
                BCFBooked();
                break;
            }
        }
    }
    
    public void ECSR()
    {
        for (int i = 0; i < 10; i++)
        {
            if (ECSR[i] == 0)
            {
                ECSR[i] = 1;
                BookedEC(i);
                break;    
            }
            else if (ECSR[9] == 1)
            {
                ECFBooked();
                break;
            }
        }
    }
    
    public void LECSR()
    {
        for (int i = 0; i < 10; i++)
        {
            if (LECSR[i] == 0)
            {
                LECSR[i] = 1;
                BookedLEC(i);
                break;    
            }
            else if (LECSR[9] == 1)
            {
                LECFBooked();
                break;
            }
        }
    }
    
    public void BookedBC(int n)
    {
        System.out.println("\nSeat Number : "+(n+1)+"\nClass : Business\nStatus : Booked\n");
        System.out.print("1 : Make another Reservation in Same Class\n2 : Main Menu\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Make another Reservation in Same Class\n2 : Main Menu\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                BCSR();
                break;
            case "2":
                ReservationsAll();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void BookedEC(int n)
    {
        System.out.println("\nSeat Number : "+(n+1)+"\nClass : Economy\nStatus : Booked\n");
        System.out.print("1 : Make another Reservation in Same Class\n2 : Main Menu\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Make another Reservation in Same Class\n2 : Main Menu\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                ECSR();
                break;
            case "2":
                ReservationsAll();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void BookedLEC(int n)
    {
        System.out.println("\nSeat Number : "+(n+1)+"\nClass : Lower Economy\nStatus : Booked\n");
        System.out.print("1 : Make another Reservation in Same Class\n2 : Main Menu\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Make another Reservation in Same Class\n2 : Main Menu\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                LECSR();
                break;
            case "2":
                ReservationsAll();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void BCFBooked()
    {
        System.out.println("\nNo more Reservation Available in Business Class\n");
        NotBC();
    }
    
    public void ECFBooked()
    {
        System.out.println("\nNo more Reservation Available in Economy Class\n");
        NotEC();
    }
    
    public void LECFBooked()
    {
        System.out.println("\nNo more Reservation Available in Lower Economy Class\n");
        NotLEC();
    }
    
    public void NotBC()
    {
        if (ECSR[9] != 1 && LECSR[9] != 1)
        {
            NotBCMenu();
        }
        else if (ECSR[9] == 1 && LECSR[9] == 1)
        {
            System.out.println("All Seats in this Flight are Reserved, next Flight in "+(LocalTime.now().plusHours(3)));
        }
        else if (ECSR[9] == 1 || LECSR[9] == 1)
        {
            if (ECSR[9] == 1)
            {
                DLECSR();
            }
            else if (LECSR[9] == 1)
            {
                DECSR();
            }
        }
    }
    
    public void NotEC()
    {
        if (BCSR[9] != 1 && LECSR[9] != 1)
        {
            NotECMenu();
        }
        else if (BCSR[9] == 1 && LECSR[9] == 1)
        {
            System.out.println("All Seats in this Flight are Reserved, next Flight in "+(LocalTime.now().plusHours(3)));
        }
        else if (BCSR[9] == 1 || LECSR[9] == 1)
        {
            if (BCSR[9] == 1)
            {
                DLECSR();
            }
            else if (LECSR[9] == 1)
            {
                DBCSR();
            }
        }
    }
    
    public void NotLEC()
    {
        if (BCSR[9] != 1 && ECSR[9] != 1)
        {
            NotLECMenu();
        }
        else if (BCSR[9] == 1 && ECSR[9] == 1)
        {
            System.out.println("All Seats in this Flight are Reserved, next Flight in "+(LocalTime.now().plusHours(3)));
        }
        else if (BCSR[9] == 1 || ECSR[9] == 1)
        {
            if (BCSR[9] == 1)
            {
                DECSR();
            }
            else if (ECSR[9] == 1)
            {
                DBCSR();
            }
        }
    }
    
    public void NotBCMenu()
    {
        System.out.print("1 : Economy Class\n2 : Lower Economy Class\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Economy Class\n2 : Lower Economy Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                ECSR();
                break;
            case "2":
                LECSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void NotECMenu()
    {
        System.out.print("1 : Business Class\n2 : Lower Economy Class\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Business Class\n2 : Lower Economy Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                BCSR();
                break;
            case "2":
                LECSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void NotLECMenu()
    {
        System.out.print("1 : Business Class\n2 : Economy Class\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Business Class\n2 : Economy Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                BCSR();
                break;
            case "2":
                ECSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void DLECSR()
    {
        System.out.print("All Seats of Business Class and Economy Class are Booked\n\n"
                + "1 : Make a Reservation in Lower Economy Class\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Make a Reservation in Lower Economy Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                LECSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void DECSR()
    {
        System.out.print("All Seats of Business Class and Lower Economy Class are Booked\n\n"
                + "1 : Make a Reservation in Economy Class\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Make a Reservation in Economy Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                ECSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void DBCSR()
    {
        System.out.print("All Seats of Economy Class and Lower Economy Class are Booked\n\n"
                + "1 : Make a Reservation in Business Class\n0 : Terminate\n\n>>> ");
        String i = s.next();
        
        while ( !("1".equals(i) || "2".equals(i) || "0".equals(i)) )
        {            
            System.out.println("\nInvalid Entry! Try Again\n");
            System.out.print("1 : Make a Reservation in Business Class\n0 : Terminate\n\n>>> ");
            
            i = s.next();
        }
        
        if (i == null)
        {
            ReservationsAll();
        }
        else switch (i)
        {
            case "1":
                BCSR();
                break;
            case "0":
                Terminate();
                break;
            default:
                ReservationsAll();
                break;
        }
    }
    
    public void Terminate()
    {
        System.out.println("\nProgram Terminated! at "+(LocalTime.now()));
    }
}
