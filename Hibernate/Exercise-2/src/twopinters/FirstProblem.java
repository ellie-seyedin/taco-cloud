package twopinters;

import java.util.concurrent.LinkedBlockingDeque;

public class FirstProblem {

    //use 2 pointers technique
    //O(nlogn)
    public static boolean twoSum(int[] array, int n, int sum) {
        int right = n - 1;
        int left = 0;
        while (left < right) {
            if (array[left] + array[right] == sum) {
                return true;
            }
            if (array[left] + array[right] < sum) {
                left++;
            }
            if (array[left] + array[right] > sum) {
                right--;
            }
        }
        return false;
    }

    static class TestFirstProblem {
        public static void main(String[] args) {
            // Declaring and initializing array
            int[] arr = {2, 3, 5, 8, 9, 10, 11};

            int val = 17;

            System.out.println(FirstProblem.twoSum(arr, arr.length, val));
        }
    }

    static int removeElement(int[] A, int elem) {
        int pointer = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[pointer++] = A[i];
            }
            if (A[i] == elem)
                index = i;
        }
        return index;
    }

    static class TestRemoveDuplicate {
        public static void main(String[] args) {
            int[] array = {30, 20, 50, 10, 60};
            int element = 10;

            int i = removeElement(array, element);
            System.out.println("i = " + i);
        }
    }

    static int removeDuplicateValue(int[] array) {
        int nonDuplicate = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[nonDuplicate - 1] != array[i]) {
                array[nonDuplicate] = array[i];
                nonDuplicate++;
            }
        }
        return nonDuplicate;
    }


    static class TestRemove {
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 30};

            int i = removeDuplicateValue(array);
            System.out.println("i = " + i);
        }
    }

//    static boolean pairSum(int[] array, int n, int target){
//        int right = n-1;
//        int left = 0;
//        while (left<right){
//    }
//}
}