public class Jagged_21 {
    public static void main(String args[])
    {
        int nums[][] = new int[3][];
         nums[0] = new int[4];
         nums[1] = new int[3];
         nums[2] = new int[2];

         for (int x = 0; x < nums.length;x++)
         {
            for (int y = 0; y < nums[x].length; y++)
            {
                 nums[x][y] = (int)(Math.random()*10);
                System.out.print(nums[x][y]+" ");
            }
            System.out.println();
         }

        //  3D - Arrays
        int num[][][] = new int[3][4][5]; // Declaring a 3D array with 3 layers, 4 rows, and 5 colmuns

        for (int i =0;i<num.length;i++)
        {
            for(int j = 0; j<num[i].length;j++)
            {
                for(int k =0;k<num[i][j].length;k++)
                {
                    num[i][j][k] = (int)(Math.random()*10);
                    System.out.print(num[i][j][k]+" ");

                }
                System.out.println();

            }
        }

         

    
    
    }

}
