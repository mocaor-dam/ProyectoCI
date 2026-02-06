package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {
   private MathService mathService;
    @BeforeEach
    public void setUp(){
        mathService = new MathService();
    }
    @Test
    public void testSumar(){
       int a =2;
       int b =3;
       int res = mathService.sumar(2,3);

       assertEquals(res, 5);
    }
}