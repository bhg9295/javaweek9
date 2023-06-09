package homwworkWeek9Java;
/* Declare following two arrylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
//c1.add("Red");
//c1.add("Green");
//c1.add("Black");
//c1.add("White");
//c1.add("Pink");
//ArrayList<String> c2= new ArrayList<String>();
//c2.add("Red");
//c2.add("Green");
//c2.add("Black");
//c2.add("Pink");*/

import java.util.ArrayList;

public class ArraylistToCompare11 {
    public static void comp() {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");


        if (c1.equals(c2)) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }

    }

    public static void main(String[] args) {
        comp();
    }
}
