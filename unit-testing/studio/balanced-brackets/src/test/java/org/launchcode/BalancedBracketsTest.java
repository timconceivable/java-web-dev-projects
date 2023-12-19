package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest () {
        assertEquals(true,true);
    }
    @Test
    public void EmptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void closingBracketWithoutOpeningReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void oneOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void oneClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void multipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }
    @Test
    public void missingOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code]"));
    }
    @Test
    public void missingClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch][Code"));
    }
    @Test
    public void ClosingBracketBeforeOpening() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[]"));
    }
    @Test
    public void redundantTestOne() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch][Code]]"));
    }
    @Test
    public void redundantTestTwo() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[another][redundant[test]][]"));
    }
    @Test
    public void redundantTestThree() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[This is basically the same thing as the previous test]]"));
    }
}