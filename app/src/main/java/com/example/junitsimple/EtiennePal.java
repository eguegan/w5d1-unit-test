package com.example.junitsimple;

/**
 * Created by admin on 4/29/2016.
 */
public class EtiennePal {
    public boolean palindromeCorrect (char[] palind){
        if(palind != null){
            int full = palind.length;
            int middle = palind.length / 2;
            boolean isPal = true;
            for(int i = 0; i < middle; i++){
                full--;
                if(palind[i] != palind[full]){
                    isPal = false;
                    break;
                }
            }
            return isPal;
        }else{
            return false;
        }
    }
}
