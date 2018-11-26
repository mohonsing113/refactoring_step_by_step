# refactoring_step_by_step


* refactor checkDriver method name
1. run and pass test cases
1. copy new checkDriver to new method and rename to checkDriverIsAdult
1. rename the test cases checkDriver method
1. run and pass all test cases
1. remove old checkerDriver method
1. run and pass all test cases
1. commit

* refactor duplicate code on checkDriverIsAdult
1. run and pass test cases
1. remove the if else and directly return the condition in checkDriverIsAdult
1. run and pass all test cases
1. commit

* refactor code by extract a check is adult condition to a new method
1. run and pass test cases
1. create a new method isAdult in Driver
1. replace the condition on checkDriverIsAdult to the new isAdult method
1. run and pass all test cases
1. commit