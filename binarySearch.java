
public class binarySearch {
    public static int binarySearch1(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            //right half
            if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1; //left
            }
        }
        return -1;   //key does not exist
        
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("The key is at index "+ binarySearch1(numbers,key));
       
    }
}
