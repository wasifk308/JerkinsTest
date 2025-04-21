package src;
import java.util.Date;

public class helo
{
        public static void main(String[] args) {

            System.out.println();
            System.out.println("hello world....");    
            
            System.out.println(new Date());        

            Student student1 = new Student("Alice", 20);
             student1.displayInfo();
        
             Student student2 = new Student("Bob", 22);
             student2.displayInfo();

        }
}   