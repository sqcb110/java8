package chapter04_arrary;

/*

* **案例3：**使用二维数组打印一个 10 行杨辉三角。

        提示：

        1. 第一行有 1 个元素, 第 n 行有 n 个元素

        2. 每一行的第一个元素和最后一个元素都是 1

        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：

        yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

*/

public class Test_03_YangHui_Triangle {
    public static void main(String[] args) {

        //1.动态初始化的方式创建二维数组
        int[][] yanghui = new int[10][];

        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i+1];

            //2.给数组元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;
            for (int j = 1; j < i ; j++) {
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

                }
            }
        }
    
}
