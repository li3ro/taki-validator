package test.taki.sample.game;

import java.util.Vector;
import junit.framework.TestCase;
import org.junit.Test;
import com.taki.sample.game.*;

public class DealerTest extends TestCase{

	private Dealer dl;
	private Card inPack[] = new Card[10];
	private Vector<Card> player_cards[] = (Vector<Card>[]) new Vector[10]; // WHY MUST I CAST?

	
	public DealerTest(String name) {
	        super(name);
	        dl = new Dealer();
	}
	
	/**
	* For initializing the values.
	*/
	protected void setUp() throws Exception {
		super.setUp();
		// Test 0: should return true
		inPack[0] = new Card(Config.TYPE.get(0), Config.COLOR.get(0));		// ONE + BLUE
		player_cards[0] = new Vector<Card>();
		player_cards[0].add(new Card(Config.TYPE.get(16), Config.COLOR.get(0))); // TAKI BLUE
		player_cards[0].add(new Card(Config.TYPE.get(3), Config.COLOR.get(0))); // FOUR BLUE
		player_cards[0].add(new Card(Config.TYPE.get(4), Config.COLOR.get(0))); // FIVE BLUE
		// Test 1: should return false
		inPack[1] = new Card(Config.TYPE.get(3), Config.COLOR.get(2)); // FOUR + YELLOW
		player_cards[1] = new Vector<Card>();
		player_cards[1].add(new Card(Config.TYPE.get(10), Config.COLOR.get(2)));  // '+' YELLOW
		player_cards[1].add(new Card(Config.TYPE.get(10), Config.COLOR.get(0)));  // '+' BLUE
		player_cards[1].add(new Card(Config.TYPE.get(6), Config.COLOR.get(0)));   // SEVEN BLUE
		player_cards[1].add(new Card(Config.TYPE.get(16), Config.COLOR.get(0)));  // TAKI BLUE <-- Should fail
		//Test 2: should return true
		inPack[2] = new Card(Config.TYPE.get(7), Config.COLOR.get(3)); // EIGHT + RED
		player_cards[2] = new Vector<Card>();
		player_cards[2].add(new Card(Config.TYPE.get(10), Config.COLOR.get(3)));  // '+' RED
		player_cards[2].add(new Card(Config.TYPE.get(2), Config.COLOR.get(3)));  // THREE RED
		//Test 3: should return true
		inPack[3] = new Card(Config.TYPE.get(12), Config.COLOR.get(1)); // SWITCH DIRECTION + GREEN
		player_cards[3] = new Vector<Card>();
		player_cards[3].add(new Card(Config.TYPE.get(5), Config.COLOR.get(1)));  // FOUR GREEN
		player_cards[3].add(new Card(Config.TYPE.get(15), Config.COLOR.get(0)));  // SUPER TAKI BLUE
		player_cards[3].add(new Card(Config.TYPE.get(6), Config.COLOR.get(0)));  // SEVEN BLUE
		player_cards[3].add(new Card(Config.TYPE.get(10), Config.COLOR.get(0)));  // '+' BLUE
		//Test 4: should return true
		inPack[4] = new Card(Config.TYPE.get(9), Config.COLOR.get(2)); // +2 YELLOW
		player_cards[4] = new Vector<Card>();
		player_cards[4].add(new Card(Config.TYPE.get(14), Config.COLOR.get(1)));  // SWITCH HANDS GREEN
		//Test 5: should return false
		inPack[5] = new Card(Config.TYPE.get(2), Config.COLOR.get(3)); // THREE RED
		player_cards[5] = new Vector<Card>();
		player_cards[5].add(new Card(Config.TYPE.get(14), Config.COLOR.get(4)));  // SWITCH HANDS IRRELEVANT COLOR
		
	}

	/**
	* For cleaning the values.
	*/
	protected void tearDown() throws Exception {
		super.tearDown();
		player_cards=null;
		inPack=null;
	}
	
	
	@Test
	public void testValidate() {
		
		assertEquals(true,dl.Validate(inPack[0], player_cards[0]));
		
		assertEquals(false, dl.Validate(inPack[1], player_cards[1]));
		
		assertEquals(true, dl.Validate(inPack[2], player_cards[2]));
		
		assertEquals(true, dl.Validate(inPack[3], player_cards[3],true,Config.COLOR.get(3),false,"",false,false,false));
		
		assertEquals(true, dl.Validate(inPack[4], player_cards[4],false,"",true,Config.COLOR.get(2),true,false,false));

		assertEquals(false, dl.Validate(inPack[5], player_cards[5],false,"",false,"",false,true,false));
	}

	
	
    public static void main(String[] args) {
        junit.textui.TestRunner.run(DealerTest.class);
    }
}

