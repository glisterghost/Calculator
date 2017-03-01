package com.codeclan.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 28/02/2017.
 */

public class TestCalculator {

   Calculator calculator;

   @Before
   public void setup(){
      calculator = new Calculator();
   }

   @Test
   public void testCanAdd(){
      assertEquals(100, calculator.add(51, 49));
   }

   @Test
   public void testCanSubtract(){
      assertEquals(10, calculator.subtract(30, 20));
   }

   @Test
   public void testCanMultiply(){
      assertEquals(49, calculator.multiply(7, 7));
   }

   @Test
   public void testCanDivide(){
      assertEquals(25, calculator.divide(100, 4));
   }




}
