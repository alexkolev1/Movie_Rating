import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Movie
{
    public static void main(String [] args)
    {
        // creates a scanner so that the computer is able to read the value being inputed
        Scanner read = new Scanner(System.in);
        try
        {
            // Asks a question and allows you to input a value
            System.out.println(" How many movies are you rating? ");
            int movieAmount = read.nextInt();
        
            // loops through certain code
            for(int i = 1; i < movieAmount + 1; i++)
            {
            // Asks a question and allows you to input a value
            System.out.println(" Please enter 3 ratings from the movie review website for movie #" + i);
            int movieReview1 = read.nextInt();
            int movieReview2 = read.nextInt();
            int movieReview3 = read.nextInt();
            
        
            // Allows code to execute if a certain condition is met 
            if(movieReview1 <= 100)
            {
                if(movieReview2 <= 100)
                {
                    if(movieReview3 <= 100)
                    {
            // asks a question and allows you to input a value
            System.out.println(" Please enter 2 ratings from the focus group for movie #" + i);
            double movieFocus1 = read.nextDouble();
            double movieFocus2 = read.nextDouble();
            // generates a random number
            Random generate = new Random();
            double generate2 = generate.nextDouble()*100;
            // calculates the average movie review
            double movieReviewTotal = (double) (movieReview1 + movieReview2 + movieReview3)/3;
            // calculates the average focus movie review
            double movieFocusTotal = (movieFocus1 + movieFocus2)/2;

            // prints out information that has been calculated and sets the double to go 2 decimal places
            System.out.println("Ratings for movie #" + i);
            System.out.println(" Average website rating: " + String.format("%.2f", movieReviewTotal));
            System.out.println(" Average focus group rating: " + String.format("%.2f",movieFocusTotal));
            System.out.println(" Average movie critic rating: " + String.format("%.2f", generate2));
            System.out.println(" Overall movie rating: " + String.format("%.2f", (movieReviewTotal*.2) + (movieFocusTotal *.3) + ((generate2)*.5)/1 ));
            }
                    }
                }
                else
                // if the above code cannot be executed then this code will execute
                {
                    System.out.println(" Incorrect data has been entered ");
                    System.exit(0);
                }
        
    }
        }
        // if an error occurs this prints out
        catch(Exception e)
        {
            System.out.println(" Incorrect data has been entered ");
        }
}
}
