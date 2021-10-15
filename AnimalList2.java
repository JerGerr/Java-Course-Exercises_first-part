
// Java program select a random element from List
 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class AnimalList2 {
 
    // Drive Function
    public static void main(String[] args)
    {
 
        // create a list of Integer type
        List<String> list = new ArrayList<>();
        // add 5 element in ArrayList
        list.add("Pig");
        list.add("Bear");
        list.add("Dog");

 
        AnimalList obj = new AnimalList();
 
        // boundIndex for select in sub list
        int numberOfElements =1;
 
        // take a random element from list and print them
        System.out.println(
            obj.getRandomElement(list, numberOfElements));
        System.out.println(
                obj.getRandomElement(list, numberOfElements));
        System.out.println(
                obj.getRandomElement(list, numberOfElements));
    }
 
    // Function select an element base on index and return
    // an element
    public List<String>
    getRandomElement(List<String> list, int totalItems)
    {
        Random rand = new Random();
 
        // create a temporary list for storing
        // selected element
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {
 
            // take a random index between 0 to size
            // of given List
            int randomIndex = rand.nextInt(list.size());
 
            // add element in temporary list
            newList.add(list.get(randomIndex));
 
            // Remove selected element from original list
            list.remove(randomIndex);
        }
        return newList;
    }
}