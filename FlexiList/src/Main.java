import java.util.*;

public class Main extends FlexliList {
    public static void main(String[] args) throws Exception {

        FlexliList fxList1 = new FlexliList();      // creation of new FlexiList object named fxList1.

        //addition operation for 2 integers , followed by 1 string and 1 character.
        fxList1.add(0);
        fxList1.add(1);
        fxList1.add("abc");
        fxList1.add('#');

        // displaying the list after performing addition operations
        fxList1.display();

        //adding at first Position operation two times.new head of the list should be the string "First"
        fxList1.addFirst('+');
        fxList1.addFirst("First");
        fxList1.display();

        //display operation for index 0 for fxList.
        fxList1.displayAt(1);

        //addition operations followed by returning the integers in flexiList as a list operation using toIntegerArray() function.
        fxList1.add(6);
        fxList1.add(7);
        List<Integer> INTEGERLIST = new ArrayList<>();
        INTEGERLIST = fxList1.toIntegerArray();
        System.out.println(INTEGERLIST);

        //addition operations followed by returning the Characters in FlexiList as a list operation using toCarArray() function.
        fxList1.add('$');
        fxList1.add('-');
        List<Character> CHARLIST = new ArrayList<>();
        CHARLIST = fxList1.toCharArray();
        System.out.println(CHARLIST);

        //printing list and den updating value as 999 in flexilist index 1.and then printing again.
        fxList1.display();
        fxList1.updateAtIndex(1,999);
        fxList1.display();

        // test case to check the working of length function of flexilist which gives the length of the list at any point of time.
        System.out.println(fxList1.length());
        fxList1.add("Last");
        System.out.println(fxList1.length());




    }
}
