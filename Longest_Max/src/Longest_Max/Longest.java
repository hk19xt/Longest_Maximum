package Longest_Max;

import java.util.Arrays;

/*This class is the implementation class. The new longest array is initialized and return the output of the longest length. 
The input array and the input size will be inserted by users in the main class. */

public class Longest {
    public int Longest(int userInput[], int size){
        
        int[] longest = new int[size]; //New array for the longest output array is initialized.
        
        longest[0]=1; //The new longest array should initialize 1 when there is only one element for the first length.

        for(int i=1; i<size; i++){ //This for loop is for calculating the longest length.
            longest[i]=1; //The second element in the new longest array also should be 1 because the length is 1 between the second and the first elements if there are two elements.
            for(int j=0; j<i; j++){ // While checking the next element position is larger than the previous element position, we should check two possibilities.
                // 1) If the user input array is ascending order so that the next element value is larger than the previous element value.
                // 2) Whether the previous element of the new longest array is smaller than the next element plus one (it means whether it is ascending or not) of the same array. 
                if(userInput[i]>userInput[j] && longest[i]<longest[j]+1){ 
                    longest[i]=longest[j]+1; //After satisfying these two conditions, the next element of the new longest array adds 1.
                }
            }
        }
        int output = Arrays.stream(longest).max().getAsInt(); //Return the output of the largest value (the last value of the new longest array).
        return output;
    }

}//Longest
