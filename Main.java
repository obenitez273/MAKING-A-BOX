//* MAKING A BOX
//Create a function that creates a box based on dimension n.
/*makeBox(5) ➞ [
  "#####",
  "#   #",
  "#   #",
  "#   #",
  "#####"
] 5x5 box */

public class Main {
    public static void main(String[] args) {

        int box_size = 1;
        LinkedList list = new LinkedList();


        // Add nodes to the list
        for (int i = 1; i<= box_size ; i++){
            
            if (i == 1 || i == box_size) {
                LinkedList list1 = new LinkedList();
                //System.out.println("TAPA");
                list1.addMultipleBs(box_size);
                list1.printList1();
                list1.clear();
            } else if (i >= 2 || i < box_size ) {
                //System.out.println("RELLENO");
                LinkedList list2 = new LinkedList();
                list2.addFirst("#");
                for (int j = 0; j <= box_size - 3; j++) {
                    list2.addFirst(" ");
                }
                list2.addFirst("#");
                //System.out.println("TAPA");
                //list2.addMultipleBs(2);
                list2.printList2();
                list2.clear();
            }

            
            //System.out.println("\n");*/
        }
        

        // Print the list
        //list.printList(); // Output: 10 -> 20 -> 30 -> null

        // Get the size of the list
        System.out.println("Size: " + list.getSize()); // Output: Size: 3

        // Delete first and last nodes
        list.deleteFirst();
        list.deleteLast();

        // Print the list again
        //list.printList(); // Output: 20 -> null



        
        
    }
}
