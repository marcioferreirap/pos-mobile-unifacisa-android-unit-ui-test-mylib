package com.marciofp.mylib.models;

/**
 * Created by Marcio Ferreira on 16/03/2018.
 */

public class Fine {

    public double calcFineTax(double fine, int days){
        double total;
        total = fine * days;
        return total;
    }

}
