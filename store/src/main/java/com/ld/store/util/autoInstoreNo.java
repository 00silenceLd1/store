package com.ld.store.util;

import java.util.Calendar;

import static javafx.scene.input.KeyCode.O;

/**
 * Created by liudong on 2019/12/13
 */
public class autoInstoreNo {
    public static void main(String[] args) {
        int i =1;
        //获得当前日期
        String months ="";
        String days ="";
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) +1;
        if(month < 10 ){
            months = "0"+month;
        }else{
            months = ""+month+"";
        }
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        if (day < 10 ){
            days = "0"+day;
        }else{
            days = ""+day+"";
        }
        String instoreNo = year+months+days;
        System.out.println(instoreNo);

    }
}
