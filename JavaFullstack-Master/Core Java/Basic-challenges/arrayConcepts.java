public class arrayConcepts {
    public static void main(String[] args) {
        // int nums[] = {3,5,6,7};
        // nums[1] = 9;
        // System.out.println(nums[1]);

        // int nums[] = new int[4];
        // nums[0]=4;
        // nums[1]=6;
        // nums[2]=8;
        // for(int i=0;i<4;i++){
        //     System.out.println(nums[i]);
        // }
        
        //multi dimensional array
        int nums[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        //or
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
