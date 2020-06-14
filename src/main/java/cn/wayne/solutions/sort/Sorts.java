package cn.wayne.solutions.sort;

import java.util.Arrays;

/**
 * Author: Waynnne
 * Date: 2020/6/11 00:16
 * Desc: Sorts
 */

public class Sorts {

    /**
     * 冒泡排序
     *
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 针对所有的元素重复以上的步骤，除了最后一个；
     * 重复步骤1~3，直到排序完成。
     */
    public static int[] bubbleSort(int array[]) {
//        int array[] = {6, 5, 3, 2, 4};

        //外层循环，遍历次数
        for (int i = 0; i < array.length; i++) {
            //内层循环，升序（如果前一个值比后一个值大，则交换）
            //内层循环一次，获取一个最大值
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println(111111);
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public static void bubbleSort1(int[] A){
        for(int i=0;i < A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                System.out.println(222222);
                if(A[i] > A[j]){
                    swap(A,i,j);
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * 将第一个值看成最小值
     * 然后和后续的比较找出最小值和下标
     * 交换本次遍历的起始值和最小值
     * 说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，然后每次遍历无序列表找出最小值。
     */
    public static int[] selectionSort(int array[]) {
//        int array[] = {6, 5, 3, 2, 4};

        for (int i = 0; i < array.length; i++) {
            //默认第一个是最小的
            int min = array[i];
            //记录最小的下标
            int index = i;

            //通过与后面未排序的数据进行比较得出，最小值和下标
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }

            //然后将最小值与本次循环的，开始值交换
            int temp = array[i];
            array[i] = min;
            array[index] = temp;

            System.out.println(Arrays.toString(array));
        }

        return array;
    }

    /**
     * 插入排序
     *
     * 从第一个元素开始，该元素可以认为已经被排序；
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
     * 将新元素插入到该位置后；
     * 重复步骤2~5。
     */
    public static int[] insertSort(int array[]) {
//        int array[] = {6, 5, 3, 2, 4};

        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;

            System.out.println(Arrays.toString(array));
        }

        return array;
    }

    /**
     * 快速排序方法
     *
     * 从数列中挑出一个元素，称为 “基准”（pivot）；
     * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
     * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
//    public static int[] quickSort(int[] array, int start, int end) {
//        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
//        int smallIndex = partition(array, start, end);
//        if (smallIndex > start)
//            quickSort(array, start, smallIndex - 1);
//        if (smallIndex < end)
//            quickSort(array, smallIndex + 1, end);
//        return array;
//    }

    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
//    public static int partition(int[] array, int start, int end) {
//        int pivot = (int) (start + Math.random() * (end - start + 1));
//        int smallIndex = start - 1;
//        swap(array, pivot, end);
//        for (int i = start; i <= end; i++)
//            if (array[i] <= array[end]) {
//                smallIndex++;
//                if (i > smallIndex)
//                    swap(array, i, smallIndex);
//            }
//        return smallIndex;
//    }

    /**
     * 交换数组内两个元素
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*
        快速排序（从小到大）
    */
//    public static void quickSort(int arr[], int _left, int _right){
//        int left = _left;
//        int right = _right;
//        int temp = 0;
//        /* 待排序的元素至少有两个的情况 */
//        if(left <= right){
//            /* 待排序的第一个元素作为基准元素 */
//            temp = arr[left];        //
//            /* 从左右两边交替扫描，直到left = right */
//            while(left != right){
//                /* 从右往左扫描，找到第一个比基准元素小的元素 */
//                while(right > left && arr[right] >= temp){
//                    right --;
//                }
//                /* 找到这种元素arr[right]后与arr[left]交换 */
//                arr[left] = arr[right];
//
//                /* 从左往右扫描，找到第一个比基准元素大的元素 */
//                while(left < right && arr[left] <= temp){
//                    left ++;
//                }
//                /* 找到这种元素arr[left]后，与arr[right]交换 */
//                arr[right] = arr[left];
//
//            }
//            /* 基准元素归位 */
//            arr[right] = temp;
//            /* 对基准元素左边的元素进行递归排序 */
//            quickSort(arr,_left,left-1);
//            /* 对基准元素右边的进行递归排序 */
//            quickSort(arr, right+1,_right);
//        }
//    }


    // (1)  我们从待排序的记录序列中选取一个记录(通常第一个)作为基准元素(称为key)key=arr[left]，然后设置两个变量，left指向数列的最左部，right指向数据的最右部。
    // (2)  key首先与arr[right]进行比较，如果arr[right]<key，则arr[left]=arr[right]将这个比key小的数放到左边去，如果arr[right]>key则我们只需要将right--，right--之后，再拿arr[right]与key进行比较，直到arr[right]<key交换元素为止。
    // (3)  如果右边存在arr[right]<key的情况，将arr[left]=arr[right]，接下来，将转向left端，拿arr[left ]与key进行比较，如果arr[left]>key,则将arr[right]=arr[left]，如果arr[left]<key，则只需要将left++,然后再进行arr[left]与key的比较。
    // (4)  然后再移动right重复上述步骤
    // (5)  最后得到 {23 58 13 10 57 62} 65 {106 78 95 85}，再对左子数列与右子数列进行同样的操作。最终得到一个有序的数列。

    public static int[] quickSort(int[]array, int left, int right) {
        int pivot = 0;
        if (left < right) {
            // 分区，此时基准点左边右两边分别小于和大于基准点
            pivot = partition(array, left, right);
            // 对左右两边递归排序
            quickSort(array, left, pivot-1);
            quickSort(array, pivot+1, right);
        }
        return array;
    }

    public static int partition(int[]array, int left, int right) {
        int temp = array[left];

        // 左边索引小于右边
        while (left < right) {
            // 先从右边比较，如果大于基准数，索引-1
            while (left < right && array[right] >= temp) {
                right --;
            }
            // 小于，则移到左侧
            array[left] = array[right];

            // 同理，对左侧操作
            while (left < right && array[left] <= temp) {
                left ++;
            }
            // 大于，则移到右侧
            array[right] = array[left];
        }

        // 基准点在中间
        array[left] = temp;
        // 返回基准点的索引
        return left;
    }


    public static void main(String[] args) {
        int array[] = {6, 5, 7, 2, 4, 1, 9};
//        bubbleSort(array);
//        bubbleSort1(array);
//        selectionSort(array);
//        insertSort(array);
//        System.out.println();
//        quickSort(array, 0, array.length-1);

    }
}
