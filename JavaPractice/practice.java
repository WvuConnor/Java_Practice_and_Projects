
import java.util.Arrays;

//java packages to import

// @TODO Study for interview 1hr
public class practice {
//Practice 1. turn a dec into a binary number the hard way.

/**
 * turns decamans into binary by
 * deviding ny two and using the remander afterwards 
 * to calculate the binary 
 * 
 * @param n The number to turn into binary
 *
 * @return The binary version of the decamal
 */
    static void decToBinary(int n){
        //initalise an arry to store binary number
        int[] binaryNum = new int[1000];
        
        //bianary array counter
        int i = 0;
        while(n > 0){
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        } 
        //printing in reverce order
        for(int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    
    //create a facttoral function
    //n! = n x (n-1) * ... * 1
    
    /*
    int factoral n 

    create a loop that loops n times 

    then use factoral equation

    return result
     */

    /**
     * this program calulates the factoral of a given number
     * @param num the number to turn into a factoral
     * @return the 
     */
    static int factoral(int num){//recursive method
        if(num == 0){
            return 1;
        }
        return num * factoral(num - 1);
    }
    //Simple intrest: (p*t*r)/100
   
    /*
    intrest is money create a float for each
    find a way to deal with decamals 
    */

   /**
    * this program calculates simple intest
    * @param p this is the princapal
    * @param t is time
    * @param r is the rate 
    * @return the simple intrest given these three paramaters
    */
   static float simpleIntrest(float p, float t, float r){
    float SI = (p * t * r) / 100;
    return SI;
   }
 

    public static void main(String[] args) {
        //driver for dec to bi 
        // @TODO make it so that i can enter any number with out changing the code 
        int n = 17;
        int num = 5;
        float p = 1000, t = 5, r = 5;
            System.out.println("decamal - " + n);
        System.out.print("Binary - ");
            decToBinary(n);
        System.out.println(" ");
        System.out.println("Factoral of " + num + " is " + factoral(5));
        System.out.println("Simple intrest " + simpleIntrest(p, t, r));
    //finding the sum if an array 
        /*
        Input : arr[] = {1, 2, 3}
        Output: 6
        1 + 2 + 3 = 6
        */
       //one line answer using streams
       int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).sum();
        System.err.println("the sum of the array is " + sum);
        
    }
    // @TODO geeks 4 geeks numbers 5-10
     
    
    
}