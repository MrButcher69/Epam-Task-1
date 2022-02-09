package com.company;

public class Nine {
    public String concat() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{7, 8, 9, 0};

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
        int k = 5;
        int aLen = a.length;
        int bLen = b.length;
        int[] c = new int[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        int shift;
        for (int index = 0; index < bLen; index++) {
            shift = index + k;
            int tmp = c[shift];
            c[shift] = c[shift+bLen];
            c[shift + bLen] = tmp;
        }

        String str = "";

        for(int i = 0; i< c.length; i++){
            str = str + Integer.toString(c[i]);
        }
        return str;
    }
}
