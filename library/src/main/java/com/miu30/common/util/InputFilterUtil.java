package com.miu30.common.util;

import android.text.InputFilter;
import android.text.Spanned;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Murphy on 2018/10/22.
 */
public class InputFilterUtil {

    public static String chineseRegex = "^[\\u4E00-\\u9FA5]+$";//中文
    public static String letterChineseRegex = "^[\\u4E00-\\u9FA5A-Za-z]+$";//中英文
    public static String letterNumberRegex = "^[0-9A-Za-z]+$";//字母数字
    public static String numberRegex = "^[0-9]+$";//字母数字
    public static String idCardRegex = "^[0-9Xx]+$";//字母数字
    public static String letterChineseNumberRegex = "^[\\u4E00-\\u9FA50-9]+$";//中文数字
    public static String letterNumberChineseRegex = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$";//中英数字
    public static String specialSymbols = "[`~@#%^&*+=|{}\\[\\]<>￥…【】]|\n|\r|\t]";//特殊符号
    public static String regEx1= "[";
    public static String regEx2= "…";
    public static String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】|\n|\r|\t]";

    public static InputFilter[] getInputFilters(String regex, int max) {
        return new InputFilter[]{getInputFilter(regex), new InputFilter.LengthFilter(max)};
    }

    private static InputFilter getInputFilter(final String regex) {
        return new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dstart, int dend) {
                boolean is = Pattern.matches(regex, source.toString());
                if (!is) {
                    return "";
                }
                return null;
            }
        };
    }


    public static boolean valid(String str){
        Pattern p = Pattern.compile(specialSymbols);
        Matcher m = p.matcher(str);
        return  m.find();
    }

    public static InputFilter[] getInputFilters2(String regex, int max) {
        return new InputFilter[]{getInputFilter2(regex), new InputFilter.LengthFilter(max)};
    }


    private static InputFilter getInputFilter2(final String regex) {
        return new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dstart, int dend) {
                boolean is = Pattern.matches(regex, source.toString());
                if (is) {
                    return "";
                }
                return null;
            }
        };
    }
}
