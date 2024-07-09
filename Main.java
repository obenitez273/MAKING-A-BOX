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

        LinkedList list = new LinkedList();

        

        // Add nodes to the list
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);

        // Print the list
        list.printList(); // Output: 10 -> 20 -> 30 -> null

        // Get the size of the list
        System.out.println("Size: " + list.getSize()); // Output: Size: 3

        // Delete first and last nodes
        list.deleteFirst();
        list.deleteLast();

        // Print the list again
        list.printList(); // Output: 20 -> null

        
    }
}
