public class Chessboard {

    public static void main(String args[]) {

            String[][] chessboard = new String[8][8];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    chessboard[i][j] = (i + j) % 2 == 0 ? "BB" : "WW";
                }
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(chessboard[i][j]+"|");
                }
                System.out.println();
            }
        }
    }

