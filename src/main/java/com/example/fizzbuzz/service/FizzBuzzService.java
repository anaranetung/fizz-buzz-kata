package com.example.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

  public String[] calculateFizzBuzz(int input) {
    String[] result = new String[input];

    for (int i = 1; i <= input; i++) {
      int index = i - 1;
      // return same value by default
      String temp = i + "";

      if (i % 3 == 0 && i % 5 == 0) {
        temp = "FizzBuzz";
      } else if (i % 3 == 0) {
        temp = "Fizz";
      } else if (i % 5 == 0) {
        temp = "Buzz";
      }

      result[index] = temp;
    }

    return result;
  }
}
