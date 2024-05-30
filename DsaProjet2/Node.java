package DsaProjet2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // 1. Inserting a Node at Any Given Position in a Singly Linked List
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 2; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null) {
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // 2. Deleting a Node at Any Given Position in a Singly Linked List
    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 2; i++) {
            if (current == null || current.next == null) {
                return;
            }
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    // 3. Deleting a Node After a Given Node in a Singly Linked List
    public void deleteAfterNode(int data) {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current.data != data) {
            if (current.next == null) {
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    // 4. Searching a Node in a Singly Linked List
    public boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

    // 5. Implementing a Stack Using Linked Lists
     class Stack {
        Node head;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (head == null) {
                return -1;
            }
            int item = head.data;
            head = head.next;
            return item;
        }

        public int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }
