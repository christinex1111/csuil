public class islandCounting {
    public static void main(String[] args) {
        int[] land = {1,0,1,0,1,1,0,1,0,0,0,1,0,1,0,1};
        int size = 4;
        int island = 0;
        int rowCount = 0;
        int columnCount = 0;

        for (int i = 0; i < land.length;) {
            if (land[i] == 1) {
                rowCount = land[i++];
                columnCount = land[i+=size];
                if (rowCount == 0 && columnCount == 0) {
                    island++;
                }   
            } else {
                i++;
            }
        }

        System.out.println(island);
    }
}