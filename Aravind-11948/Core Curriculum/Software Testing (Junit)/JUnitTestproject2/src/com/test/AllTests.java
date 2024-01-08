package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, FactorialTest.class ,PrimeTest.class})
public class AllTests {

}
