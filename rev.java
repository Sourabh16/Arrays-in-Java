public class rev {
    public static void printSubarrays(int nums[]){
        int totalSum = 0;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){           //print
                    
                    totalSum =totalSum +nums[k];    
                }
                if(largest<totalSum){
                    largest = totalSum;
                }
                totalSum = 0;
            }
        }
        System.out.println("Largest sum of subarray is: "+ largest);

    }
    public static void main(String[] args){
        int nums[] = {2,3,4,5,6,7};
        printSubarrays(nums);

    }
}
