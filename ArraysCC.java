import java.util.*;
public class ArraysCC {
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();  //Phy
        marks[1]= sc.nextInt();  //Chem
        marks[2]= sc.nextInt();  //Math
        System.out.println("Phy: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("Math: "+ marks[2]);
        sc.close();
        marks[2]=marks[2]+1;   //updation
        System.out.println("Math: " + marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+percentage+" % ");
        System.out.println("length of array = "+marks.length);
    }
}
