# fizz-buzz-kata

In this exercise we learn about unit testing and Test Driven Design, using the simple Fizz Buzz
problem.<br>
(A secondary purpose is to set up my laptop's dev environment ^_^ )

I have chosen to create a simple HTTP API.<br>
After running the project you can make a HTTP GET request.

URI:        `localhost:8080/api/fizzbuzz`<br>
Parameter:  `input` <br>
Example:    http://localhost:8080/api/fizzbuzz?input=45

## Chosen Tech

* Language: Java
* Dependency management: Gradle
* Framework: SpringBoot
* Unit Testing Framework: JUnit5


## Fizz Buzz Problem

Given an integer n, return a string array answer (1-indexed) where:

* `answer[i] == "FizzBuzz"` if `i` is divisible by `3` and `5`.
* `answer[i] == "Fizz"` if `i` is divisible by `3`.
* `answer[i] == "Buzz"` if `i` is divisible by `5`.
* `answer[i] == i` (as a string) if none of the above conditions are true.

Example 1:

    Input: n = 3
    Output: ["1","2","Fizz"]

Example 2:

    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]

Example 3:

    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

Constraints:
* `1 <= n <= 104`

