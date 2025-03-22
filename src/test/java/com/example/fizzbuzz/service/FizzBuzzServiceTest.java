package com.example.fizzbuzz.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzServiceTest {
  private FizzBuzzService fizzBuzzService;

  @BeforeEach
  void setup() {
    fizzBuzzService = new FizzBuzzService();
  }

  @Test
  void n_is_3() {
    // given
    int n = 3;
    String[] expected = {"1", "2", "Fizz"};
    // when
    String[] output = fizzBuzzService.calculateFizzBuzz(n);
    // then
    assertArrayEquals(expected, output);
  }
}
