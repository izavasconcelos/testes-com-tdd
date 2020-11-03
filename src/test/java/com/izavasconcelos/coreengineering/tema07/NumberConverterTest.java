package com.izavasconcelos.coreengineering.tema07;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {
    private NumberConverter numberConverter;

    @Before
    public void inputTestBefore() {
        numberConverter = new NumberConverter();
    }

    @Test
    public void testConverterRomanNumberToInteger() {

        assertEquals(1, numberConverter.romanToInteger("i"));

        assertEquals(2, numberConverter.romanToInteger("II"));

        assertEquals(3, numberConverter.romanToInteger("IiI"));

        assertEquals(4, numberConverter.romanToInteger("IV"));

        assertEquals(5, numberConverter.romanToInteger("v"));

        assertEquals(6, numberConverter.romanToInteger("VI"));

        assertEquals(7, numberConverter.romanToInteger("VII"));

        assertEquals(8, numberConverter.romanToInteger("VIII"));

        assertEquals(9, numberConverter.romanToInteger("Ix"));

        assertEquals(10, numberConverter.romanToInteger("X"));

        assertEquals(11, numberConverter.romanToInteger("XI"));

        assertEquals(12, numberConverter.romanToInteger("XiI"));

        assertEquals(13, numberConverter.romanToInteger("XIII"));

        assertEquals(14, numberConverter.romanToInteger("XIV"));

        assertEquals(15, numberConverter.romanToInteger("xV"));

        assertEquals(16, numberConverter.romanToInteger("XVI"));

        assertEquals(17, numberConverter.romanToInteger("XVII"));

        assertEquals(18, numberConverter.romanToInteger("XViII"));

        assertEquals(19, numberConverter.romanToInteger("XIX"));

        assertEquals(20, numberConverter.romanToInteger("xx"));
    }

    @Test
    public void testRomanNumberIsValid () {

        assertTrue(numberConverter.romanNumberIsValid("Xi"));

        assertTrue(numberConverter.romanNumberIsValid("VI"));

        assertTrue(numberConverter.romanNumberIsValid("vi"));

        assertTrue(numberConverter.romanNumberIsValid("iii"));

        assertTrue(numberConverter.romanNumberIsValid("xVi"));
    }

    @Test
    public void testRomanNumberIsNotValid () {

        assertEquals(0, numberConverter.romanToInteger("XiXX"));

        assertFalse(numberConverter.romanNumberIsValid(null));

        assertFalse(numberConverter.romanNumberIsValid(""));

        assertEquals(0, numberConverter.romanToInteger("1x"));

        assertEquals(0, numberConverter.romanToInteger("vxx"));

        assertFalse(numberConverter.romanNumberIsValid("XXI"));

        assertFalse(numberConverter.romanNumberIsValid("xxv"));

        assertFalse(numberConverter.romanNumberIsValid("11"));
    }

    @Test
    public void testConverterIntegerNumberToRoman() {

        assertEquals("I", numberConverter.integerToRoman(1));

        assertEquals("IV", numberConverter.integerToRoman(4));

        assertEquals("VIII", numberConverter.integerToRoman(8));

        assertEquals("IX", numberConverter.integerToRoman(9));

        assertEquals("X", numberConverter.integerToRoman(10));

        assertEquals("XII", numberConverter.integerToRoman(12));

        assertEquals("XIV", numberConverter.integerToRoman(14));

        assertEquals("XV", numberConverter.integerToRoman(15));

        assertEquals("XIX", numberConverter.integerToRoman(19));

        assertEquals("XX", numberConverter.integerToRoman(20));
    }

    @Test
    public void testIntegerIsValid(){

        assertTrue(numberConverter.integerNumberIsValid(1));

        assertTrue(numberConverter.integerNumberIsValid(5));

        assertTrue(numberConverter.integerNumberIsValid(3));

        assertTrue(numberConverter.integerNumberIsValid(11));

        assertTrue(numberConverter.integerNumberIsValid(20));

        assertTrue(numberConverter.integerNumberIsValid(17));
    }

    @Test
    public void testIntegerNotIsValid(){

        assertFalse(numberConverter.integerNumberIsValid(0));

        assertEquals("", numberConverter.integerToRoman(0));

        assertFalse(numberConverter.integerNumberIsValid(35));

        assertEquals("", numberConverter.integerToRoman(35));

        assertFalse(numberConverter.integerNumberIsValid(324));

        assertEquals("", numberConverter.integerToRoman(324));

        assertFalse(numberConverter.integerNumberIsValid(21));
    }
}
