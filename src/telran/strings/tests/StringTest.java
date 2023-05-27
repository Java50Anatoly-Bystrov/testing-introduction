package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void CharAtTest() {
		String str = "Hello";
		assertEquals('H',str.charAt(0));
		assertEquals('o',str.charAt(4));
		assertEquals('l',str.charAt(2));
		assertEquals('c', 'e' -2);
		assertEquals("Hello2", str+2);
	}
	@Test
	void containstTest() {
		String str = "Hello";
		assertTrue(str.contains("H"));
		assertFalse(str.contains("h"));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("lelo"));
	}
	  @Test
	    public void testCompareTo() {
		  String str = "Hello";
	        assertEquals(0, str.compareTo("Hello"));
	    }

    @Test
    public void testCompareToIgnoreCase() {
    	String str = "Hello";
    	assertEquals(0, str.compareToIgnoreCase("Hello"));
    }

    @Test
    public void testConcat() {
    	String str = "Hello";
        assertEquals("Hello World", str.concat(" World"));
    }

    @Test
    public void testStartsWith() {
    	String str = "Hello";
        assertTrue(str.startsWith("Hel"));
        assertFalse(str.startsWith("lo"));
    }

    @Test
    public void testEndsWith() {
    	String str = "Hello";
        assertTrue(str.endsWith("lo"));
        assertFalse(str.endsWith("World"));
    }

    @Test
    public void testEqualsIgnoreCase() {
    	String str = "Hello";
        assertTrue(str.equalsIgnoreCase("Hello"));
        assertFalse(str.equalsIgnoreCase("World"));
    }
    @Test
    public void testIndexOf() {
    	String str = "Hello";
        assertEquals(0, str.indexOf("H"));
        assertEquals(1, str.indexOf("e"));
        assertEquals(2, str.indexOf("l"));
        assertEquals(4, str.indexOf("o"));
    }

    @Test
    public void testLastIndexOf() {
    	String str = "Hello";
        assertEquals(3, str.lastIndexOf("l"));
        assertEquals(3, str.lastIndexOf("l"));
        assertEquals(1, str.lastIndexOf("e"));
        assertEquals(0, str.lastIndexOf("H"));
    }
}
