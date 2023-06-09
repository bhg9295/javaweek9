package homwworkWeek9Java;
//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;

//Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class RetrieveArrayList6 {

    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        // Use for each loop to iterate the value from Map
        for (String key : people.keySet()) {
            System.out.println("key: " + key + " value: " + people.get(key));
        }
    }
}
