public class Multi_D_20 {
    public static void main(String args[]){
        int a[][] = new int[3][4];
        // int random = (int)Math.random()*100;
        for (int i = 0; i<3;i++){
            for (int j = 0;j<4;j++){
                a[i][j] = (int)(Math.random()*10);
            }
        System.out.println();

        }
        System.out.println("Printing Array:");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
        System.out.println();
        }
    }
}


