package com.xiao.common.xss;

import org.apache.commons.lang.StringUtils;

import com.xiao.common.utils.RRException;

public class SQLFilter {


    public static String sqlInject(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");


        str = str.toLowerCase();

        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alter", "drop"};

        for(String keyword : keywords){
            if(str.indexOf(keyword) != -1){
                throw new RRException("contains illegal symbols");
            }
        }

        return str;
    }
}
