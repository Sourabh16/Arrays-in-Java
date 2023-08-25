public class searchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int k = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                k = i;    
            }
        }
        int start = 0; int end = k;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
         start = k+1;  end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }    
        return -1;
        
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));

    } 
}