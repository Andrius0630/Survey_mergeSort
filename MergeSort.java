import java.util.ArrayList;

public class MergeSort {
    public static <T extends Comparable<T>> void mergeSort(ArrayList<T> arr) {
        int sizeArr = arr.size();
        if (sizeArr < 2)
            return;

        int middleIndex = sizeArr / 2;
        ArrayList<T> leftHalf = new ArrayList<>();
        ArrayList<T> rightHalf = new ArrayList<>();

        for (int i = 0; i < sizeArr; i++) {
            if (i < middleIndex) {
                leftHalf.add(arr.get(i));
            } else {
                rightHalf.add(arr.get(i));
            }
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(leftHalf, rightHalf, arr);
    }

    public static <T extends Comparable<T>> void merge(ArrayList<T> leftArr, ArrayList<T> rightArr, ArrayList<T> mainArr) {
        int leftSize = leftArr.size();
        int rightSize = rightArr.size();

        int leftCounter = 0, rightCounter = 0;
        mainArr.clear();

        while (leftCounter < leftSize && rightCounter < rightSize) {
            if (leftArr.get(leftCounter).compareTo(rightArr.get(rightCounter)) < 0) {
                mainArr.add(leftArr.get(leftCounter));
                leftCounter++;
            } else {
                mainArr.add(rightArr.get(rightCounter));
                rightCounter++;
            }
        }

        while (leftCounter < leftSize) {
            mainArr.add(leftArr.get(leftCounter));
            leftCounter++;
        }

        while (rightCounter < rightSize) {
            mainArr.add(rightArr.get(rightCounter));
            rightCounter++;
        }
    }
}
