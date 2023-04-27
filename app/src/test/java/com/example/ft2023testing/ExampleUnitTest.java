package com.example.ft2023testing;

import org.junit.Test;

import extra.TextCounter;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void getWordsCount_Given_String_Result_Four() {
        String givenString = "labas rytas sakau tau   ";
        int expectedValue = 4;
        int actualValue = TextCounter.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWhiteSpacesCount_Given_SpacesString_Result_Four() {
        String givenString = "    ";
        int expectedValue = 4;
        int actualValue = TextCounter.countWhitespaces(givenString);

        assertEquals(expectedValue, actualValue); {
}}}
