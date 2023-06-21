package chapter03_procedure_control;

/*世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/

public class Test_10_ZhuMuLangMa_Num {
    public static void main(String[] args) {
        double hight = 8848.86;
        double thickness = 0.0001;
        int count = 0;
        while(thickness < hight){
            thickness *= 2;
            count++;
        }
        System.out.println("折叠" + count + "次");
    }
}
