Day 2  

import java.util.scanner;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
—-------------------------------------------------------------------------------------------
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the array length: ");
        int n =input.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the value");
             arr[i]= input.nextInt();
        }
        System.out.println("You entered the following values:");
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
—----------------------------------------------------------------------------------------------
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the row: ");
        int row= input.nextInt();
        System.out.println("enter the colunm: ");
        int col= input.nextInt();
        int [][] arr= new int[row][col];
        for(int i=0;i<row ;i++){
            for (int j=0;j<col;j++){
            System.out.println("enter the data: ");
            arr[i][j]=input.nextInt();
            }
        }
         System.out.println("You entered the following matrix:");
        for(int i=0;i<row ;i++){
            for (int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}

—--------------------------------------------------------------------------------
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
—-----------------------------------------------------------------------------------------
public class SeparateVowelsConsonants {
    public static void main(String[] args) {
        String input = "mahasakthi";
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch=='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u') {
                vowels += ch;
            } else {
                consonants += ch;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


