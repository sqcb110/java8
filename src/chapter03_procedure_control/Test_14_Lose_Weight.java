package chapter03_procedure_control;

/*
2023年6月30日达到77公斤，后续每周减1公斤，一直到2023年9月30日
* */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_14_Lose_Weight {
    public static void main(String[] args) throws ParseException {

        //todo 1： 初始日期和初始体重
        DateFormat df = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2023-06-30");
        String dt = df.format(date);

        int weight = 77;

        //todo 2：
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(dt + ":" + weight);

        while (calendar.get(calendar.YEAR) <= 2023 && calendar.get(calendar.MONTH) < Calendar.OCTOBER) {
            calendar.add(calendar.DATE, 1);
            if (calendar.get(calendar.DAY_OF_WEEK) == 6) {
                weight -= 1;
                Date date_minus = calendar.getTime();
                String dt_minus = df.format(date_minus);
                System.out.println(dt_minus + ":" + weight);
            }
        }

/*        for (; calendar.get(calendar.YEAR) <= 2023 && calendar.get(calendar.MONTH) < 10; calendar.add(calendar.DATE,1)) {
            if (calendar.get(calendar.DAY_OF_WEEK) == 6) {
                weight -= 1;
                Date date_minus = calendar.getTime();
                String dt_minus = df.format(date_minus);
                System.out.println(dt_minus + ":" + weight);
            }

        }*/
    }
}
