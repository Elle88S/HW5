package ru.netology.HW5.services;


public class VacationCalcService {
    public int calculate(int income, int expenses, int thereshold) {
        int money = 0; // количество денег на счету

        int count = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= thereshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }


        return count;

    }
}
