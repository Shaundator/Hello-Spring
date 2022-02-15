package com.example.springweek7.services;

import java.time.LocalDate;

public class CalculateDayOfWeek {
    public int date(){
        int q = LocalDate.now().getDayOfMonth();
        int m = LocalDate.now().getMonthValue();
        int year = LocalDate.now().getYear();
        if(m==1||m==2){
            m += 12;
            year -= 1;
        }
        int j = year/100;
        int k = year%100;
        int h = (q+((13*(m+1))/5) + k + (k/4) + (j/4) - 2*(j))%7;
        return ((h+5)%7)+1;
    }
}
