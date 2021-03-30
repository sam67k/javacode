
package studentroaster;

public class Student {
    
    public final int Num_of_Test = 3;
    protected String name;
    protected int[] tests;
    protected String courseGrade;
    
    Student(){
    
        tests = new int[Num_of_Test];
    }
    
    Student(String n){
    
        tests = new int[Num_of_Test];
        name = n;
    }
    
    
    public String getCourseGrade(){
    
        return courseGrade;
    }
    
    public String getname(){
    
        return name;
    }
    
    public void getTestScore(int a){
    
        switch(a){
        
            case 1:
                System.out.println(tests[0]);
                break;
            case 2:
                System.out.println(tests[1]);
                break;
            case 3:
                System.out.println(tests[2]);
                break;
            default:
                System.out.println("This test index is not valid");
                
        }
    }
    
    public void setName(String N){
    
        name = N;
    }
    
    public void setTestScore(int a, int b){
    
        tests[b] = a;
    }
}
