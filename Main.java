//* MAKING A BOX
//Create a function that creates a box based on dimension n.
/*makeBox(5) ➞ [
  "#####",
  "#   #",
  "#   #",
  "#   #",
  "#####"
] 5x5 box */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your box: ");
        int box_size = scanner.nextInt() ;
        scanner.close();

        LinkedList list = new LinkedList();

        for (int i = 1; i<= box_size ; i++){
            
            if (i == 1 || i == box_size) {               
                //Tapa de la caja
                list.addMultipleBs(box_size);
                list.printList();
                list.clear();
            } else if (i >= 2 || i < box_size ) {
                //Relleno de la caja              
                list.addFirst("#");
                for (int j = 0; j <= box_size - 3; j++) {
                    list.addFirst(" ");
                }
                list.addFirst("#");
                list.printList();
                list.clear();
            }

        }

        System.out.println(box_size + " x " + box_size + " box ");
        // Print the list
        //list.printList(); 

        // Get the size of the list
        //System.out.println("Size: " + list.getSize()); // Output: Size: 3

        // Delete first and last nodes
        //list.deleteFirst();
        //list.deleteLast();

    }
}
