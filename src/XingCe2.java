public class XingCe2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long a = 0;
        long b = 1000000000;
        double c = 0;
        while(true){
            c = Math.pow(a,2);
            if(c > b){
                break;
            }
            a = a + 1;
        }
        long endu = System.currentTimeMillis() - startTime;

        System.out.println("过了" + endu + "毫秒");
    }
}
