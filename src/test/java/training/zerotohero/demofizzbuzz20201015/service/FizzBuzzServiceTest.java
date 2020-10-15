package training.zerotohero.demofizzbuzz20201015.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FizzBuzzServiceTest {

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Test
    public void fizzTest(){
        assertEquals("Fizz",fizzBuzzService.validation(3));
        assertEquals("Fizz",fizzBuzzService.validation(99));
        assertEquals("Fizz",fizzBuzzService.validation(39999));
        assertEquals("Fizz",fizzBuzzService.validation(99999));
    }

    @Test
    public void buzzTest(){
        assertEquals("Buzz",fizzBuzzService.validation(5));
        assertEquals("Buzz",fizzBuzzService.validation(55));
        assertEquals("Buzz",fizzBuzzService.validation(50000));
        assertEquals("Buzz",fizzBuzzService.validation(10000));
    }


    @Test
    public void fizzBuzzTest(){
        assertEquals("FizzBuzz",fizzBuzzService.validation(15));
        assertEquals("FizzBuzz",fizzBuzzService.validation(150));
        assertEquals("FizzBuzz",fizzBuzzService.validation(45));
        assertEquals("FizzBuzz",fizzBuzzService.validation(90));
    }


    @Test
    public void invalidCasesBuzzTest(){
        assertEquals("7",fizzBuzzService.validation(7));
        assertEquals("11",fizzBuzzService.validation(11));
        assertEquals("2",fizzBuzzService.validation(2));
    }

}

/**

 TDD - RED - GREEN- BLUE


 **/