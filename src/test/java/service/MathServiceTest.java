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
       int res = mathService.sumar(a,b);

       assertEquals(res, 5);
    }

    @Test
    public void testRestarL(){
        int a = 2;
        int b = 3;
        int resultado = mathService.restar(a,b);

        assertEquals(resultado,5);
    }
}