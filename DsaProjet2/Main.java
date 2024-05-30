package DsaProjet2;


import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {
        // Example usage
        LinkedList linkedList = new LinkedList();

// 1. Inserting a Node at Any Given Position
        linkedList.insertAtPos(10, 1);
        linkedList.insertAtPos(2, 2);
        linkedList.insertAtPos(3, 3);
        linkedList.insertAtPos(4, 4);

        linkedList.printList();

// 2. Deleting a Node at Any Given Position
        linkedList.deleteAtPosition(2);
        linkedList.printList();
// 3. Deleting a Node After a Given Node
        linkedList.deleteAfterNode(1);
        linkedList.printList();

// 4. Searching a Node
        System.out.println(linkedList.searchNode(10)); // true
        System.out.println(linkedList.searchNode(5)); // false

// 5. Implementing a Stack Using Linked Lists
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // 2
        System.out.println(stack.peek()); // 1
    }
}