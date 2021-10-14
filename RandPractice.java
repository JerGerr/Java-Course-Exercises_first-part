import java.util.Random;

public class RandPractice{

    final static int NO_WORDS = 3;	// These constants must be static
    final static int NO_SENTS = 3;	// if they are going to be used in
    final static String SPACE = " ";	// a static method like main().
    final static String PERIOD = ".";

    static Random r = new Random();

    public static void main( String args[] ){

        String noun2[] = { "the boy", "the pig", "the soldier" };
        String noun[] = { "a girl", "the dog", "a duck" };
        String verb[] = { "drove", "jumped", "ran" };
        String preposition[] = { "to", "from", "over" };

        String sentence;
        for (int i = 0; i < NO_SENTS; i++){
            sentence = noun[rand()] + SPACE;
            char c = sentence.charAt(0);
            sentence = sentence.replace( c, Character.toUpperCase(c) );
            sentence += (verb[rand()] + SPACE + preposition[rand()]);
            sentence += (SPACE + noun2[rand()]);
            sentence += PERIOD;
            System.out.println(sentence);
            sentence = "";
        }
    }

    static int rand(){
        int ri = r.nextInt() % NO_WORDS;
        if ( ri < 0 )
            ri += NO_WORDS;
        return ri;
    }
}