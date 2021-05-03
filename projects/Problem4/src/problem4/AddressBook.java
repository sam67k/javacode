
package problem4;

import java.util.Scanner;


public class AddressBook 
{
    int count = 0;
    
    Person book[] = new Person[5];
    
    Scanner s = new Scanner(System.in);
    
    public void addPerson()
    {        
        if(count<5)
        {
            Person p = new Person();
            
            System.out.println("Enter Details for Person");
            
            System.out.print("Enter First Name : ");
            String fn = s.next();
            
            System.out.print("Enter Last Name : ");
            String ln = s.next();
            
            System.out.print("Enter Gender : ");
            String g = s.next();
            
            p.setPerson(fn, ln, g);
            
            book[count] = p;
            
            count++;
            
        }
        else
        {
            System.out.println("The Address Book is Full");
        }
    }

    
    public void addSpecialPerson()
    {        
        if(count<5)
        {
            ExtPerson ep = new ExtPerson();
            Date date = new Date();

            System.out.print("Enter First Name : ");
            String fn = s.next();
            
            System.out.print("Enter Last Name : ");
            String ln = s.next();
            
            System.out.print("Enter Gender : ");
            String g = s.next();
            
            ep.setPerson(fn, ln, g);
            
            System.out.println("Enter Date of Birth Details");
            
            System.out.print("Enter Day : ");
            int d = s.nextInt();
            
            System.out.print("Enter Month : ");
            int m = s.nextInt();
            
            System.out.print("Enter Year : ");
            int y = s.nextInt();
            
            date.setDate(d, m, y);
            
            ep.setDateOfBirth(date);

            Address add = new Address();
            
            System.out.println("Enter Address Details ");
            
            System.out.print("Enter Street : ");
            String st = s.next();
            
            System.out.print("Enter City : ");
            String c = s.next();
            
            System.out.print("Enter State : ");
            String state = s.next();
            
            System.out.print("Enter Zip Code : ");
            int code = s.nextInt();
            
            add.setAddress(st, c, state, code);
            
            ep.setAddress(add);
            
            System.out.print("Enter Realtionship with Person : ");
            String r = s.next();
            
            System.out.print("Enter Phone Number : ");
            String n = s.next();
            
            ep.setExtPerson(date, r, add, n);
            
            book[count] = ep;
            
            count++;    
        }
        
        else
        {
            System.out.println("The Address Book is Full");
        }
    }
    
    public void CheckAvailibility()
    {        
        System.out.print("Enter Last Name to Search : ");
        String ln = s.next();
        
        boolean found = false;
        
        for (int i = 0; i < book.length; i++)
        {
            if ( book[i] != null )
            {
                if ( book[i].getLName().equals(ln) )
                {
                    System.out.println("Person Available in Records");
                    
                    found = true;
                    
                    break;
                }
            }
        }
        if ( found == false )
        { 
            System.out.println("Person not Available in Records"); 
        }
    }
    
    public void printAllDetails()
    {
        boolean checker = false;
        
        for (int i = 0; i < book.length; i++)
        {
            if ( book[i] != null )
            {
                checker = true;
                
                System.out.println("Name : "+book[i].getName());
                System.out.println("Gender : "+book[i].getGender());

                if ( book[i] instanceof ExtPerson )
                {
                    System.out.println("Relationship : "+((ExtPerson)book[i]).Relationship);
                    System.out.println("Phone Number : "+((ExtPerson)book[i]).Number);
                    System.out.println("Date of Birth : "+((ExtPerson)book[i]).DateOfBirth.getDate());
                    System.out.println("Address : "+((ExtPerson)book[i]).Address.getAddress());
                }
            }
        }
        if ( checker == false )
        {
            System.out.println("No Records Found");
        }
    }
    
    public void birthMonth()
    {
        System.out.print("\nEnter the Month Number : ");
        int num = s.nextInt();
        
        boolean availibility = false;
        System.out.println();
        
        for (int i = 0; i < book.length; i++)
        {
            if ( book[i] != null )
            {
                if( book[i] instanceof ExtPerson )
                {
                    if ( ((ExtPerson)book[i]).DateOfBirth.getMonth() == num )
                    {
                        System.out.println(book[i].getName());
                        availibility = true;
                    }
                }
            }
        }
        if(availibility == false)
        {
            System.out.println("None have Birthday in this Month");
        }
        
    }
    
    public void searchBetweenDates(int m1,int y1,int m2,int y2)
    {
        
        int year ;
        int month ;
        for ( int i = 0; i < book.length; i++)
        {
            month =  ((ExtPerson)book[i]).DateOfBirth.getMonth();
            year = ((ExtPerson)book[i]).DateOfBirth.getYear();
        
            if(year>y1 && year<y2)
            {
                System.out.println("Birthday Found of the Following Person;");
                System.out.println("Name : "+book[i].getName());
                break;
            }
            else if ( year == y1 || year == y2 )
            {
                if ( month == m1 || month == m2 )
                {
                    System.out.println("Birthday Found of the Following Person;");
                    System.out.println("Name : "+book[i].getName());
                    break;
                }
                    
                else if ( m1 < m2 )
                {
                    if ( month > m1 && month < m2 )
                    {
                        System.out.println("Birthday Found of the Following Person;");
                        System.out.println("Name : "+book[i].getName());
                        break;
                    }
                }
                else if ( m1 > m2 )
                {
                    if ( month < 12 &&  month > m1 || month >= 1 && month <= m2 )
                    {
                        System.out.println("Birthday Found of the Following Person;");
                        System.out.println("Name : "+book[i].getName());
                        break;
                    }
                }
                
            }
            
        }
    }
    
}
