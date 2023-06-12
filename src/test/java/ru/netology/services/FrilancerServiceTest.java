package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrilancerServiceTest {
    @Test
    public void testCalculateRest(){
        FrilancerService service= new FrilancerService();
        int actual = service.calculate(10000,3000,20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}