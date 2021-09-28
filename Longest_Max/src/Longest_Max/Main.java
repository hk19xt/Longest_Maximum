package Longest_Max;

/*This is the main class.
The users can change the input array and the size of the input array in the hardcoded line. */

public class Main {
    public static void main(String[] args){
        int userArray[] = {0,1,0,3,2,3}; //Users can change the input value here.
        int size = userArray.length; //Users can change the input size of the elements here.
        Longest l = new Longest(); //Initialize the new longest array.
        int output;
        output = l.Longest(userArray,size);
        System.out.println(output);
    }
}//Main
