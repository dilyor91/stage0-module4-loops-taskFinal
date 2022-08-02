package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 0; row < cathetusLength; row++) {
            int numIs = row + 1;
            for (int col = 1; col <= cathetusLength + row; col++) {
                if (col == cathetusLength - row || (col >= cathetusLength - row && col <= cathetusLength + col)) {
                    System.out.print(numIs);
                    if (numIs == 1 || col >= cathetusLength) {
                        numIs++;
                    } else {
                        numIs--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
