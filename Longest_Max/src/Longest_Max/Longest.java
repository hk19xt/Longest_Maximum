package Longest_Max;

import java.util.Arrays;

public class Longest {
    public int Longest(int userInput[], int size){
        int[] longest = new int[size];
        longest[0]=1;

        for(int i=1; i<size; i++){
            longest[i]=1;
            for(int j=0; j<i; j++){
                if(userInput[i]>userInput[j] && longest[i]<longest[j]+1){
                    longest[i]=longest[j]+1;
                }
            }
        }
        int output = Arrays.stream(longest).max().getAsInt();
        return output;
    }

}
