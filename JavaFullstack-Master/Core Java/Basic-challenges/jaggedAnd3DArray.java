public class jaggedAnd3DArray {
    public static void main(String[] args) {
        
        //jagged array
        // int nums[][] = new int[3][];

        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         nums[i][j] = (int)(Math.random()*10);
        //     }
        // }

        // for(int n[] : nums){
        //     for(int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // 3-Dimensional Array
        int[][][] nums = new int[3][4][2];

        // Initializing the 3D array with random values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // Printing the elements of the 3D array
        for (int[][] n : nums) {
            for (int[] m : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
