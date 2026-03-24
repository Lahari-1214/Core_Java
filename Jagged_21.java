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
         

    
    
    }

}
