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

    public static void main(String[] args) {
        //driver for dec to bi 
        // @TODO make it so that i can enter any number with out changing the code 
        int n = 17;
            System.out.println("decamal - " + n);
        System.out.print("Binary - ");
            decToBinary(n);
    }
    // @TODO geeks 4 geeks numbers 5-10
     
    
    
}