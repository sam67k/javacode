
package studentroaster;

public class underGrad extends Student {
    
    int test1;
    int test2;
    int test3;
    int total;
    double percent;
    
    public void calculateGrade(){
    
        tests[0] = test1;
        tests[1] = test2;
        tests[2] = test3;
        
        total = test1 + test2 + test3;
        
        percent = (total/(Num_of_Test*3)*100);
        
        if(percent < 50){
        
            System.out.println("Fail");
        }
        else if(percent > 50){
        
            System.out.println("Gade: E");
        }
        else if(percent >= 60){
        
            System.out.println("Grade: D");
        }
        else if(percent >= 70){
        
            System.out.println("Grade: C");
        }
        else if(percent >= 80){
        
            System.out.println("Grade: B");
        }
        else if(percent >= 90){
        
            System.out.println("Grade: A");
        }
    }
}
