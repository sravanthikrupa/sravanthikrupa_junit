package epam.com.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
public class RemoveAInFirstTwoCharctersTest {
	/*TODO List 
	 * 1. "" => ""
	 * 2. "A" => ""
	 * 3. "B" => "B"
	 * 4. "AA" => ""
	 * 5. "AB" => "B"
	 * 6. "BA" => "B"
	 * 7. "AACD" => "CD"
	 * 8. "ABCD" => "BCD"
	 * 9. "BACD" => "BCD";
	 * 10. "BBAA" => "BBAA"
	 * 11. "BCDE" => "BCDE"
	 * 12. "AABAA" => "AABAA"
	 * 13. "BCDAB" => "BCDAB"
	 * 14. "AAAAAAA" => "AAAAA"
	 */
	
	RemoveAInFirstTwoCharacters removeAInFirstTwoCharacters;
	
	@BeforeEach
	public void setUp() {
		RemoveAInFirstTwoCharacters removeAInFirstTwoCharacters = new RemoveAInFirstTwoCharacters(); 
	}


	@Test
	public void test0Chars() {
		assertEquals("", removeAInFirstTwoCharacters.remove(""));
	}
	
	@Test
	public void test1CharRemoveA() {
		assertEquals("", removeAInFirstTwoCharacters.remove("A"));
	}
	
	@Test
	public void test1CharNoAAtFirst() {
		assertEquals("B", removeAInFirstTwoCharacters.remove("B"));
	}
	
	@Test
	public void test2CharsRemove2AChars() {
		assertEquals("", removeAInFirstTwoCharacters.remove("AA"));
	}
	
	@Test
	public void test2CharsRemove1AAtFirst() {
		assertEquals("B", removeAInFirstTwoCharacters.remove("AB"));
	}
	
	@Test
	public void test2CharsRemove1AAtSecond() {
		assertEquals("B", removeAInFirstTwoCharacters.remove("BA"));
	}
	
	@Test
	public void test4CharsRemove2As() {
		assertEquals("CD", removeAInFirstTwoCharacters.remove("AACD"));
	}
	
	@Test
	public void test4CharsRemove1AAtFirst() {
		assertEquals("BCD", removeAInFirstTwoCharacters.remove("ABCD"));
	}
	
	@Test
	public void test4CharsRemove1AAtSecond() {
		assertEquals("BCD", removeAInFirstTwoCharacters.remove("BACD"));
	}
	
	@Test
	public void test4CharsNoAAtFirstSecondPosition() {
		assertEquals("BBAA", removeAInFirstTwoCharacters.remove("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", removeAInFirstTwoCharacters.remove("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", removeAInFirstTwoCharacters.remove("AABAA"));
	}
	
	@Test
	public void testNCharsNoAAtFirstSecondPosition() {
		assertEquals("BCDAB", removeAInFirstTwoCharacters.remove("BCDAB"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAA", removeAInFirstTwoCharacters.remove("AAAAAAA"));
	}


}
