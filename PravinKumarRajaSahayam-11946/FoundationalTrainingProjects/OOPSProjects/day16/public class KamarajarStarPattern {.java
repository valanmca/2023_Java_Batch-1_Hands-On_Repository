public class KamarajarStarPattern {
    public static void main(String[] args) {
        int rows = 9; // Adjust the number of rows as per your preference
        
        // Array representation of the picture
        int[][] kamarajarPicture = {
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0}
        };
        
        // Generate the star pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (kamarajarPicture[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
