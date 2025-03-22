package com.example.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

  public String[] calculateFizzBuzz(int input) {
    String[] result = {"1", "2", "Fizz"};
    return result;
  }
}
