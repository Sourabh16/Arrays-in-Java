public class Subarrays {
    public static void printSubarrays(int numbers[]){
        int totalSubarrays=0;
        int sum=0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];  
                }
                if(smallest>sum){
                        smallest=sum;
                    }
                    if(largest<sum){
                        largest = sum;
                    }
                System.out.println(">--sum of elements in subarray:" +sum);
                totalSubarrays++;
                System.out.println();
                sum=0;
                
            }
            System.out.println();
           
        } System.out.println("Total Subarrays are: "+totalSubarrays);
        System.out.println("Smallest sum of subarray is: "+smallest);
        System.out.println("Largest sum of subarray is: "+largest);
        
        
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}
