package com.qfedu.utils;

/**
 * Created by 鲁帅 on 2019/6/20.
 */
public class suij {


    public  static String getVerCode() {
       String num="";
        for(int i=0 ;i<4;i++) {
             int n = (int) (Math.random() * 10);
              num+=n;
        }
       return  num;
    }
}
