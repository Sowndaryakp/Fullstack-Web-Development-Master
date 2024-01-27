public class enhancedLoop {
    public static void main(String[] args) {
        // integer array
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        //add length of array
        //traditional for loop
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        //for each loop
        for(int n: nums){
            System.out.print(n + " ");
        }
    }
}
