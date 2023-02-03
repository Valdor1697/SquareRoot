package ru.netology.sqr.sqrcalc.services;
public class SQRService {

    public int calcSqrRoot(int a, int b){
        int x = 99;
        int numbers = 0;

        for (int i = 10; i <= x; i++) {
            if (a <= i * i && i * i <= b) {
                numbers++;
            }
        }
        return numbers;
    }
}