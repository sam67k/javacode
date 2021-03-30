
package problem4;

public class Date 
{
    int Day ,Month ,Year;
    
    public Date()
    {
        Day = 0;
        Month = 0;
        Year = 0;
    }
    
    public void setDate(int Day ,int Month ,int Year)
    {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }
    
    public String getDate()
    {
        String string = this.Day + "-" + this.Month + "-" + this.Year;
        return string;
    }
    
    public int getMonth()
    {
        return this.Month;
    }
    
    public int getYear()
    {
        return this.Year;
    }
    
}
