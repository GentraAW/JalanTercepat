public class Move {
    public static void main(String[] args) {
        char[][] array = {
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '^', ' ', ' ', ' ', '*', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
        };

        printArrays(array);

        int gerakKanan = 0;

        int mulX = 0;
        int mulY =0;
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == '^'){
                    mulX = i;
                    mulY = j; 
                }
            }
        }

        while(true) {
            if (mulY + 1 < array[mulX].length && array[mulX][mulY + 1] != '#') {
                mulY++;
                gerakKanan++;
            }

            if (array[mulX][mulY] == '*') {
                break;
            }
            array[mulX][mulY] = '^';
            printArrays(array);
            
        };

        System.out.println(gerakKanan);
    }

    public static void printArrays(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);  
            }
            System.out.println();
        }
        System.out.println();
    }
}
