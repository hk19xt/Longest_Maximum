package Longest_Max;

public class Main {
    public static void main(String[] args){
        int userArray[] = {0,1,0,3,2,3};
        int size = userArray.length;
        Longest l = new Longest();
        int output;
        output = l.Longest(userArray,size);
        System.out.println(output);
    }
}
