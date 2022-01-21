package com.company;
/*
цикл for работает на строго заданных условиях с известным количеством прогонов выполняя заданную операцию на заданное
количество значений на заданном промежутке
плюсы: правильность работы цикла зависит сугубо от заданных условий, все условия находятся в одном месте
минусы: однобокость применения

цикл while работает ПОКА условие не будет выполнено, при том, что количество прогонов не всегда известно.
плюсы: вариативность использования: использование не только числовых значений, но, например и boolean(True/False).
Минусы: не совсем интуитивное и разбросанное расположение условий.

цикл do while при заданных условиях прогонит цикл как минимум один раз, даже в случае ошибки в логике
плюсы: легче найти ошибку, в случае ее наличия, так как используется проверка.
минусы: явных не увидел
 */
public class cycles {

    public static void main(String[] args) {
	for (int a = 1; a <= 10; a++) {
        System.out.println(a);
    }
        System.out.println("цикл for выполнен");
int b = 0;
    while (b < 10) {
        b +=1;
        System.out.println(b);

    }
System.out.println("цикл while выполнен");
    int c = 0;
    do {
        c++;
        System.out.println(c);
    } while (c < 10);
    System.out.println("цикл do while выполнен");

    }
}
