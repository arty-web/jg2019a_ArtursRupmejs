package lv.jg.lesson4.level1;

import java.util.Random;

//Ik reizi palaižot testu ir jārāda viens un tas pats rezultāts
//citādi nav iespejams pārliecināties par koda pareizumu
public class LightColorDetectorTest {
	
	public static void main(String[] args) {
		
		Random randomGenerator = new Random ();
		int rand1 = randomGenerator.nextInt(600) + 250;
		int rand2 = randomGenerator.nextInt(600) + 250;
		int rand3 = randomGenerator.nextInt(600) + 250;
		int rand4 = randomGenerator.nextInt(600) + 250;
		
		LightColorDetector detective = new LightColorDetector();
		detective.detect(rand1);
		detective.detect(rand2);
		detective.detect(rand3);
		detective.detect(rand4);
		
	}

}