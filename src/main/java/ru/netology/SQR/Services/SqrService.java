package ru.netology.SQR.Services;
public class SqrService {
    public int countSquares(int minimum, int maximum) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimum) {
                if (i * i <= maximum) {
                    count++;
                }
            }

        }
        return count;
    }
}