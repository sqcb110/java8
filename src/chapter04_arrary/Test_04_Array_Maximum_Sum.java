package chapter04_arrary;

/*
**举例7(难)：输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，
每个子数组都有一个和。求所有子数组的和的最大值。要求时间复杂度为O(n)。
例如：输入的数组为1, -2, 3, -10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，因此输出为该子数组的和18。
*/

public class Test_04_Array_Maximum_Sum {
    public static void main(String[] args) {
        //1.一个整形数组：
        int[] arr = new int[]{1,2,3,-4,-10,5,7,18,96,23,24,45,77,-30};

        int sum = 0;

        //2.将数组arr从0索引到每一个位置的求和保存至arrSum
        int[] arrSum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arrSum[i] = sum;
        }

        //3。求arrSum每一个元素的最大最小值，以及最大值，以及对应索引。
        int min = arrSum[0];
        int max = arrSum[0];

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arrSum.length; i++) {
            if(arrSum[i] < min){
                min = arrSum[i];
                minIndex = i;
            }
            if(arrSum[i] > max){
                max = arrSum[i];
                maxIndex = i;
            }
        }

        //4.数组arr连续元素最大和，等于arr[minIndex+1]累加到arr[maxIndex],如果min大于0，则等于从arr[0]累加到arr[maxIndex]
        int maxSum = 0;
        if (min<=0){
            for (int i = minIndex+1; i <= maxIndex; i++) {
                maxSum += arr[i];
            }
        }else{
            for (int i = 0; i <= maxIndex ; i++) {
                maxSum += arr[i];
            }
        }
        System.out.println(maxSum);

        int i = getGreatestSum(arr);
        System.out.println(i);
    }

    public static int getGreatestSum(int[] arr){
        int greatestSum = 0;
        if(arr == null || arr.length == 0){
            return 0;
        }
        int temp = greatestSum;
        for(int i = 0;i < arr.length;i++){
            temp += arr[i];

            if(temp < 0){
                temp = 0;
            }

            if(temp > greatestSum){
                greatestSum = temp;
            }
        }
        if(greatestSum == 0){
            greatestSum = arr[0];
            for(int i = 1;i < arr.length;i++){
                if(greatestSum < arr[i]){
                    greatestSum = arr[i];
                }
            }
        }
        return greatestSum;
    }

}
