package Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        int[][] array = new int[100][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
            }
        }
        print2DArray(array);
    }

    /** 
     * Function name: randomNumber.
     * 
     * @return randomNumber (int)
     * 
     * Inside the function:
     *    1. return a random number between 0 and 99. 
     */
    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }
    /**
     * Method name: print2SArray
     * @param array (int[][])
     * 
     * Inside the Method:
     *  1. Nested Loop: 
     *    - Inner Loop: System.out.prin(array[i][j] + " ");
     *    - After the Inner Loop Completes: System.out.prin("\n");
     */
    public static void print2DArray(int[][] array) {
        for  (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");

        }
    }
}
