
package studentroaster;

public class StudentRoaster {
    
    public static void main(String[] args) {
        
        underGrad ug = new underGrad();
        
        ug.setName("Sam");
        ug.setTestScore(100, 1);
        ug.setTestScore(100, 2);
        ug.setTestScore(100, 3);
        System.out.println(ug.getCourseGrade());
    }
    
}
