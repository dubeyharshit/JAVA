public class Fibonacci {
    public static void main(String[] args) {
        int yourInt = 8;
        System.out.println(findFibRecursive(yourInt));
       // System.out.println(findFibIterative(yourInt));
    }

    public static int findFibRecursive(int theirInt) {
        if(theirInt <= 1) {
            return theirInt;
        }
        return findFibRecursive(theirInt - 1) + findFibRecursive(theirInt - 2);
    }

    /*public static int findFibIterative(int theirInt) {
        int[] array = new int[theirInt + 1];
        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < theirInt + 1; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[theirInt];
    }*/
}

