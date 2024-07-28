import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] matrix = new int[100];
    System.out.println("so nguyen duong n= ");
    int n;
    do{
        n = sc.nextInt();
    }while(n<=0);
    for(int i=0; i<n; i++){
        System.out.println("a["+i+"]= ");
        matrix[i] = sc.nextInt();
    }
        for(int i=0; i<n; i++){
            System.out.print( matrix[i]+ " ");
        }
        System.out.println();
    for(int i=1; i<n; i++){
        if(matrix[i]%2!=0){
            matrix[i]+=Math.abs(matrix[i-1]-matrix[i+1]);
        }
    }
    for(int i=0; i<n; i++){
        System.out.print( matrix[i]+ " ");
    }
    }
}