
public class LargestNumInArray{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;     // -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
            

        }
        System.out.println("The smallest value is "+ smallest);
        return largest;
        
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 6, 5};
        System.out.println("The Largest number is "+ getLargest(numbers));
    }
}