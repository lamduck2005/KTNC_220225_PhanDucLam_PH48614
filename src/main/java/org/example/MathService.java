package org.example;

public class MathService {

    public int tinhTongSoNguyen(Integer number){
        if(number == null) throw new IllegalArgumentException();
        if(number <= 0){ throw new IllegalArgumentException();}
        if(number > 10000){ throw new IllegalArgumentException();}
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(i % 2 != 0 ){
                sum += i;
            }
        }

        return sum;
    }
}
