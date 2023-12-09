package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void Remain1() { // если покупаем на 999 руб., то сообщает докупить еще на 1 руб.
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void Remain2() { // если покупаем на 1000 руб., то сообщает докупить еще на 0 руб.
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void Remain3() { // если покупаем на 1000 руб., то не должен сообщать докупить еще на 1000 руб.
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void Remain4() { // если покупаем на 1001 руб., то сообщает докупить еще на 999 руб.
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
}