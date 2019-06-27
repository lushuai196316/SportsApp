package com.qfedu.utils;

import java.util.UUID;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
public class GetCode {

 public static String getCode() {
     String uuid = UUID.randomUUID().toString();
     return uuid.replace("-", "");
 }

}
