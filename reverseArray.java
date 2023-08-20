public class reverseArray{
    public static void reverse(int nums[]){
        int first = 0, last=nums.length-1;
        while(first < last){
            //swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String []args){
        int nums[] ={2,4,6,8,10,12,14};
        reverse(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
//Time Complexity-- O(n)
//Space Complexity -- O(1)