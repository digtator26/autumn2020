package com.company.UC;

public class MagicMath {

    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int abs(int n){
        if (n < 0){
            return n * -1;
        }
        return n;
    }

    public static int pow(int n, int e){
        int result = 1;
        for(int i = 0; i < e; i++){
            result *= n;
        }
        return result;
    }

}
