package com.example.fizzbuzz.controller;

import com.example.fizzbuzz.service.FizzBuzzService;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Validated
public class FizzBuzzController {
  // this dependency will be injected by spring framework through the constructor
  private final FizzBuzzService fizzBuzzService;

  @GetMapping("/fizzbuzz")
  public String[] getFizzBuzz(@RequestParam @Positive int input) {
    return fizzBuzzService.calculateFizzBuzz(input);
  }
}
