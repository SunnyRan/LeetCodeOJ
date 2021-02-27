package com.sunny;

import java.util.*;
import java.util.stream.Collectors;

public class RearrangeBarcodes_1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map = new HashMap();
        for (int barcode : barcodes) {
            if(map.containsKey(barcode)){
                map.put(barcode,map.get(barcode) + 1);
            }else {
                map.put(barcode,1);
            }
        }
        List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream().sorted((v1,v2)->v1.getValue().compareTo(v2.getValue())).collect(Collectors.toList());
        int[] re = new int[barcodes.length];
        int index = 0;
        for (int i = 0; i < collect.size(); i++) {
            int key = collect.get(i).getKey();
            int count = collect.get(i).getValue();
            while (count -- > 0 && index < barcodes.length){
                re[index] = key;
                index = index + 2;
            }
        }

        index  = barcodes.length%2 ==0? barcodes.length -1 : barcodes.length -2;


        for (int i = collect.size() - 1; i >=0; i--) {
            int key = collect.get(i).getKey();
            int count = collect.get(i).getValue();
            while (count -- > 0 && index > 0){
                re[index] = key;
                index = index - 2;
            }
        }

        return re;
    }

    public static void main(String[] args) {
        RearrangeBarcodes_1054 demo = new RearrangeBarcodes_1054();
        System.out.println(Arrays.toString(demo.rearrangeBarcodes(new int[]{1,1,1,1,2,2,3})));

    }
}
