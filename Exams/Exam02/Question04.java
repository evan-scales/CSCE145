/*
 * CSCE 145 Exam02 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question04 {
	public static void main(String[] args)
	{
		System.out.println("Creating a new instance of a digital piano, and printing out its default values.");
		DigitalPiano digitalPiano01 = new DigitalPiano();
		System.out.println("Number of keys: "+digitalPiano01.getNumberOfKeys()+" Number of Voices: "+digitalPiano01.getNumberOfVoices());
		System.out.println("Checking to see if Digital Piano inherits from Piano");
		Piano p = digitalPiano01;//This will cause a syntax error if it does not inherit from Piano
		System.out.println("Creating another instance of a digital piano via the parameterized constructor, and printing out its values.");
		DigitalPiano digitalPiano02 = new DigitalPiano(61,55);
		System.out.println("Number of keys: "+digitalPiano02.getNumberOfKeys()+" Number of Voices: "+digitalPiano02.getNumberOfVoices());
		System.out.println("Checking the equals method with 2 pianos with different values");
		System.out.println("Are the equal?: "+digitalPiano01.equals(digitalPiano02));
		System.out.println("Checking the equals method with 2 pianos with same values");
		System.out.println("Are the equal?: "+digitalPiano01.equals(new DigitalPiano()));
		System.out.println("Checking the equals method with a null piano");
		System.out.println("Are the equal?: "+digitalPiano01.equals(null));
	}
}
//-----------------------------------------------------------------------------------