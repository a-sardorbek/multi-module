package com.system.api;

import com.system.core.Utils;

public class App {
    public static void main(String[] args) {
        String[] strings = {"-54","0","-451",null};
        try {
                boolean flag = Utils.isAllPositiveNumbers(strings);
            if(flag){
                System.out.println("---------All is positive ");
            }else {
                System.out.println("-------All is not positive");
            }
        }catch (NumberFormatException | NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
