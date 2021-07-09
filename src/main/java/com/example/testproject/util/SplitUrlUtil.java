package com.example.testproject.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Auth：niuxiaowen
 * @Desc:
 * @Date: 2021/6/3
 */
@Component
public class SplitUrlUtil {
    private static String fileUrl = "/Users/danjiaying/牛晓文/testfile/equipment_group_model_output.sql";

    public static void splitUril(String fileUrl){
        String[] test = fileUrl.split("/");
        int i = test.length -1;
        String AllUrl = "";
        for (String  Url: test){
            AllUrl = AllUrl + Url +"/";
            i-=1;
            if (i==0) break;
        }
        System.out.println(AllUrl);
    }

    public static void main(String[] args) {
        //testAtomicReference();
        //splitString("110000|110000_22|1002|20200709115934|1594267148000");
        test();
    }
    public static void test(){
        String closeRate = "2021-06-29 00:00:00";
        String[] spilt = closeRate.split(" ",2);
        for (String string: spilt){
            System.out.println(string);
        }

    }


    public static void testAtomicReference(){
        AtomicReference<Float> score = new AtomicReference<>((float) 0);
        score.updateAndGet(v1 -> new Float((float) (v1 + 2)));
        float warnScore = score.get();
        System.out.println(warnScore);
    }

    public static void splitString(String test){
        String[] mes = test.split("\\|");
        List<String>  list = new ArrayList<>();
        for (String s: mes){
            String tes = s;
            list.add(tes);
        }
        System.out.println(list.get(2));
    }
}
