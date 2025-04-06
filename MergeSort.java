import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(ArrayList<Result> arr) {
        int sizeArr = arr.size();
        if (sizeArr < 2)
            return;

        int middleIndex = sizeArr / 2;
        ArrayList<Result> leftHalf = new ArrayList<>();
        ArrayList<Result> rightHalf = new ArrayList<>();

        int i = 0;
        int j = 0;

        for (; i < sizeArr; i++) {
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

    public static void merge(ArrayList<Result> leftArr, ArrayList<Result> rightArr, ArrayList<Result> mainArr) {
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
