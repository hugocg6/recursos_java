public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int[] oneDimArray = {1345, 2536, 563};
        System.out.println(oneDimArray[2]);

        int[][] multDimArray = {{1345, 2536, 563}, {34, 56, 89}, {56, 23, 45}};
        System.out.println(multDimArray[1][2]);
        System.out.println(multDimArray[2][0]);

        double[][] array = new double[4][2];

        array[2][1] = 2.6;
        System.out.println(array[2][1]);

        for(int i = 0; i < multDimArray.length; i++){
            for(int j = 0; j < multDimArray[i].length; j++){
                System.out.print(multDimArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
