package com.example.demo;

import org.springframework.stereotype.Service;

import java.io.Console;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayHi(String first, String second, String third) {
        int one = Integer.parseInt(first);
        int three = Integer.parseInt(third);
        int result = 0;
        switch (second) {
            case "1":
                result = one + three;
                return ""+result;
            case "2":
                result = one - three;
                return ""+result;
            case "3":
                result = one * three;
                return ""+result;
            case "4" :
                result = one / three;
                return ""+result;
        }
        //"one: " + first + " two: " + second + " three: " + third;
        return "";
    }
}
