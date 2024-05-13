package question3;
import java.util.NoSuchElementException;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main2 {

    public class question3 {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public question3() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(int item) {
            stack1.push(item); // Add to stack1 for efficient enqueue
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            // Transfer elements from stack1 to stack2 if stack2 is empty
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop(); // Remove from stack2 for FIFO order
        }

        public int peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            // Transfer elements from stack1 to stack2 if stack2 is empty
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek(); // Peek at the top of stack2 for FIFO order
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }




}

