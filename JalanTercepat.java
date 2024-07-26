public class JalanTercepat {
    public static void main(String[] args) {
        char[][] array = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '^', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        char[][] array2 = {
            {'#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', '*', '#', '#'},
            {'#', ' ', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', '#', '#'},
            {'#', '#', '#', '#', '#', ' ', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', '#', '#'},
            {'#', ' ', '#', '#', '#', '#', '^', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#'}
        };

        int gerakKanan = 0;
        int gerakAtas = 0;
        int gerakKiri = 0;
        int gerakBawah = 0;
        int totalGerakan = 0;

        int startX = 0;
        int startY = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '^') {
                    startX = i;
                    startY = j;
                }
            }
        }

        do {
            if (startY + 1 < array[startX].length && array[startX][startY + 1] != '#' && array[startX][startY + 1] != '^') {
                startY++;
                gerakKanan++;
            }
            else if (startX - 1 >= 0 && array[startX - 1][startY] != '#' && array[startX - 1][startY] != '^') {
                startX--;
                gerakAtas++;
            }
            else if (startY - 1 >= 0 && array[startX][startY - 1] != '#' && array[startX][startY - 1] != '^') {
                startY--;
                gerakKiri++;
            }
            else if (startX + 1 < array.length && array[startX + 1][startY] != '#' && array[startX + 1][startY] != '^'){
                startX++;
                gerakBawah++;
            }

            if (array[startX][startY] == '*') {
                break;
            }
            array[startX][startY] = '^';
            // printArray(array);
            
        } while (array[startX][startY] != '*');


        totalGerakan = gerakKanan + gerakAtas + gerakKiri;

        if(gerakAtas != 0){
            System.out.println(gerakAtas + " Atas");
        }
        if(gerakKanan != 0){
            System.out.println(gerakKanan + " Kanan");
        }
        if(gerakBawah != 0){
            System.out.println(gerakBawah + " Bawah");
        }
        if(gerakKiri != 0){
            System.out.println(gerakKiri + " Kiri");
        } 
    
        System.out.println(totalGerakan + " Langkah");
    }

    
}