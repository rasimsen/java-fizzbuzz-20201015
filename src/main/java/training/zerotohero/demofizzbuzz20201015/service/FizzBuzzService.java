package training.zerotohero.demofizzbuzz20201015.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String validation(int num) {
        if (num % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (num % 3 == 0) {
            return FIZZ;
        } else if (num % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(num);
    }
}
