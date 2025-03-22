package com.example.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

  public String[] calculateFizzBuzz(int input) {
    String[] result = new String[input];

    for (int i = 1; i <= input; i++) {
      int index = i - 1;

      if (i % 3 == 0) {
        result[index] = "Fizz";
      } else if (i % 5 == 0) {
        result[index] = "Buzz";
      } else {
        result[index] = i + "";
      }
    }

    return result;
  }
}
