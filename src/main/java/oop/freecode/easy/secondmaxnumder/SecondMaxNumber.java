package oop.freecode.easy.secondmaxnumder;

public class SecondMaxNumber {
    public Integer find(Integer[] arr) {
        boolean unsorted = true;
        int buf;
        while (unsorted){
            unsorted = false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i + 1]){
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                    unsorted = true;
                }
            }
        }

        return arr[arr.length - 2];
    }
}
