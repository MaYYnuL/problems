package pi;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Maynul islam
 */
public class PI {

    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many terms you want to calculate");
        int number = Integer.parseInt(reader.readLine());

        int odd = 1;
        double pi = 0.0;

        for (int i = 1; i <= number; i++) {

            double currentTerm = 0.0;
            
            if (i % 2 == 0) {
                currentTerm = (double)-4 / odd;
            } else {
                currentTerm = (double)4 / odd;
            }
            odd = odd + 2;
            pi = pi + currentTerm;

        }
        
        System.out.println(pi);

        
        
        
        
    }
    
}
