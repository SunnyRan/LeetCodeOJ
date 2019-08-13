package com.interview;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-31 19:51
 **/
public class Huawei {
//    public int test(Float price){
//        for(int i =10000 ;i >0;){
//            Integer pr = Float.floatToIntBits(price);
//            pr = pr << 1;
//            price = Float.intBitsToFloat(pr);
//            if( price.equals(Float.valueOf(price.intValue()))){
//                return i;
//            }
//            price =
//        }
//
//    }



    public int test2(Float d){
        int result = 0;
        float sum = 0;
        float diff = Float.MAX_VALUE;
        for(int i =1 ;i <= 10000; i++){
            sum = Math.round(d * i);
            float diff2= Math.abs(d -  sum/i);
            //如果可以整除那么表示可以提前退出
            if(Math.abs(d - sum/i ) < 0.00000000000001 ){
                result = i;
                break;
            }
            if(diff2 < diff){
                diff = diff2;
                result = i;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Huawei huawei = new Huawei();
        System.out.println(huawei.test2(0.125f));
    }
}
