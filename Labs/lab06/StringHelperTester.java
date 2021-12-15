/**
 * written by Evan Scales
 */
public class StringHelperTester {

    public static void main(String[] args) {
        System.out.println("Welcome to the String Helper Tester!");
        System.out.println("\nTesting Has All Unique Characters with \"facetiously\"");
        System.out.println(StringHelper.hasAllUniqueCharacter("facetiously"));
        System.out.println("Testing has all unique characters with \"banana\"");
        System.out.println(StringHelper.hasAllUniqueCharacter("banana"));
        System.out.println("\nTesting mesh strings with \"harp\" and \"fiddle\"");
        System.out.println(StringHelper.meshString("harp", "fiddle"));
        System.out.println("\nTesting replace vowels with Oodle with \"burrito\"");
        System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
        System.out.println("\nTesting weight with \"heavy\"");
        System.out.println(StringHelper.weight("heavy"));
        System.out.println("\nTesting weight with \"light\"");
        System.out.println(StringHelper.weight("light"));


    }
}