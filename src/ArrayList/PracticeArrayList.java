package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class PracticeArrayList {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(22);
    list.add(21);
    list.add(20);
    list.add(19);
    list.add(17);
    list.add(16);
        System.out.println("List is: \n"+list);

//        Get element using index
        int getElement = list.get(0);
        System.out.println("Getting element index 0: "+getElement);

//       delete
        list.remove(0);
        System.out.println("After removing index 0: "+list);

//      Adding element in between with index
        list.add(0,22);
        System.out.println("After adding element(22) in index 0: "+list);

//        Set Element using index
        list.set(0,222);
        System.out.println("Setting element(222) in index 0: "+list);

//        Size of an arrayList
        int sizeOfArrayList = list.size();
        System.out.println("Size of an ArrayList is: "+sizeOfArrayList);

//        Displaying each element using Loop in ArrayList
        for (int i = 0; i<list.size();i++){
            System.out.println("The element in index: "+i+".  "+list.get(i));
        }

//        Sorting ArrayList
        Collections.sort(list);
        System.out.println("Array list after sorting: "+list);
    }
}
