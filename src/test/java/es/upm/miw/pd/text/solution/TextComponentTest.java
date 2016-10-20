package es.upm.miw.pd.text.solution;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextComponentTest {

	TextComponent text;
	Paragraph paragraph;
	FactoryCharacter factoryofchar = FactoryCharacter.getFactoryCharacter();
	Character acharacter = factoryofchar.get("a");
	Character bcharacter = factoryofchar.get("b");
	
	@Before
	public void Before() {
		text = new Text();
		paragraph = new Paragraph();
	}
	
    @Test
    public void testFactoryCharIsSingleton() {
        assertSame(FactoryCharacter.getFactoryCharacter(), FactoryCharacter.getFactoryCharacter());
    }
    
    @Test
    public void testFactoryCharisFlyweight() {
        assertSame(FactoryCharacter.getFactoryCharacter().get("a"), acharacter);
    }
	
	@Test
	public void testEmptyText() {
		assertEquals("---o---\n", text.toString(false));
	}
	
	@Test
	public void testEmptyParagraph() {
		assertEquals("\n", paragraph.toString(false));
	}
	
	@Test
	public void testToStringChar() {
		assertEquals("a", acharacter.toString(false));
		assertEquals("A", acharacter.toString(true));
	}
	
	@Test
	public void testParagraphInsertion() {
	    paragraph.add(acharacter);
		paragraph.add(bcharacter);
		assertEquals("ab\n", paragraph.toString(false));
		assertEquals("AB\n", paragraph.toString(true));
	}
	
	@Test
	public void testParagraphDeletion() {
	    paragraph.add(acharacter);
	    paragraph.add(bcharacter);
	    paragraph.remove(acharacter);
		assertEquals("b\n", paragraph.toString(false));
	}
	
	@Test
	public void testTextInsertion() {
		Text text2 = new Text();
		paragraph.add(acharacter);
		text2.add(paragraph);
		text.add(text2);
		assertEquals("a\n---o---\n---o---\n", text.toString(false));
		assertEquals("A\n---o---\n---o---\n", text.toString(true));


	}
	
	@Test
	public void testTextDeletion() {
		paragraph.add(acharacter);
		text.add(paragraph);
		text.remove(paragraph);
		assertEquals("---o---\n", text.toString(false));
	}
	
	@Test
	public void testTextAddNotComposite() {
		try {
			text.add(acharacter);
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testParagraphAddComposite() {
		try {
			paragraph.add(paragraph);
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}
	
	

}
