### README.md

## Singly Linked List Implementations for Stack and Queue

This project contains implementations of a singly linked list used to create stack and queue data structures in Java. Each implementation includes basic operations for managing the data structure.

### ListNode Class
The `ListNode` class is used by both the stack and queue implementations. It represents each node in the linked list.

#### Definition
```java
class ListNode {
    int data;
    ListNode next;

    // Constructor to initialize the node
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
```

### Stack Implementation
The `Stack` class provides the functionality of a stack data structure using a singly linked list.

#### Stack Operations

1. **Push Operation**

   **Pseudocode:**
   ```
   PUSH(data)
       Create newNode with data
       newNode.next = head
       head = newNode
   ```

   **Code:**
   ```java
   public void push(int data) {
       ListNode newNode = new ListNode(data);
       newNode.next = head;
       head = newNode;
   }
   ```

2. **Pop Operation**

   **Pseudocode:**
   ```
   POP()
       IF head is null THEN
           THROW exception ("Stack is empty")
       END IF
       data = head.data
       head = head.next
       RETURN data
   ```

   **Code:**
   ```java
   public int pop() {
       if (head == null) {
           throw new IllegalStateException("Stack is empty");
       }
       int data = head.data;
       head = head.next;
       return data;
   }
   ```

3. **Display Operation**

   **Pseudocode:**
   ```
   DISPLAY()
       current = head
       WHILE current is not null DO
           PRINT current.data + " --> "
           current = current.next
       END WHILE
       PRINT "null"
   ```

   **Code:**
   ```java
   public void display() {
       ListNode current = head;
       while (current != null) {
           System.out.print(current.data + " --> ");
           current = current.next;
       }
       System.out.println("null");
   }
   ```

### Queue Implementation
The `Queue` class provides the functionality of a queue data structure using a singly linked list.

#### Queue Operations

1. **Enqueue Operation**

   **Pseudocode:**
   ```
   ENQUEUE(data)
       Create newNode with data
       IF tail is null THEN
           head = tail = newNode
       ELSE
           tail.next = newNode
           tail = newNode
       END IF
   ```

   **Code:**
   ```java
   public void enqueue(int data) {
       ListNode newNode = new ListNode(data);
       if (tail == null) {
           head = tail = newNode;
       } else {
           tail.next = newNode;
           tail = newNode;
       }
   }
   ```

2. **Dequeue Operation**

   **Pseudocode:**
   ```
   DEQUEUE()
       IF head is null THEN
           THROW exception ("Queue is empty")
       END IF
       data = head.data
       head = head.next
       IF head is null THEN
           tail = null
       END IF
       RETURN data
   ```

   **Code:**
   ```java
   public int dequeue() {
       if (head == null) {
           throw new IllegalStateException("Queue is empty");
       }
       int data = head.data;
       head = head.next;
       if (head == null) {
           tail = null;
       }
       return data;
   }
   ```

3. **Display Operation**

   **Pseudocode:**
   ```
   DISPLAY()
       current = head
       WHILE current is not null DO
           PRINT current.data + " --> "
           current = current.next
       END WHILE
       PRINT "null"
   ```

   **Code:**
   ```java
   public void display() {
       ListNode current = head;
       while (current != null) {
           System.out.print(current.data + " --> ");
           current = current.next;
       }
       System.out.println("null");
   }
   ```

### How to Run
To test the stack and queue implementations, you can run the main methods provided in each class. This will demonstrate the basic operations and their expected behavior.

### Stack Example
```java
public static void main(String[] args) {
    Stack stack = new Stack();

    // Testing stack operations
    System.out.println("Stack operations:");
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.display(); // Should display 30 --> 20 --> 10 --> null
    System.out.println("Popped: " + stack.pop()); // Should display 30
    stack.display(); // Should display 20 --> 10 --> null
}
```

### Queue Example
```java
public static void main(String[] args) {
    Queue queue = new Queue();

    // Testing queue operations
    System.out.println("Queue operations:");
    queue.enqueue(40);
    queue.enqueue(50);
    queue.enqueue(60);
    queue.display(); // Should display 40 --> 50 --> 60 --> null
    System.out.println("Dequeued: " + queue.dequeue()); // Should display 40
    queue.display(); // Should display 50 --> 60 --> null
}
```


Sure! Here's how we can represent the memory layout for your `SinglyLinkedList` class in Java. The code defines a singly linked list with a `Node` class, a `SinglyLinkedList` class to manage the list, and methods to create and insert nodes.

### Node Class Definition

Let's start by defining the `Node` class, which isn't included in your code snippet but is necessary for the `SinglyLinkedList` to function.

```java
package SinglyLinkedList;

public class Node {
    public int value;
    public Node next;
}
```

### SinglyLinkedList Class Definition

Your provided `SinglyLinkedList` class:

```java
package SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1; // In this case size of Singly LinkedList is 1
        return head;
    }

    // Insert Method for SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
}
```

### Main Method to Test the SinglyLinkedList

```java
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        sll.insertInLinkedList(3, 1);
        sll.insertInLinkedList(7, 2);

        // Print the list to verify
        Node current = sll.head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
```

### Visual Representation of Memory Layout

Here’s how it looks when you insert nodes with values 5, 3, and 7:

1. **Node Creation and Insertion**:
    - Creating a `Node` object allocates memory in the heap.
    - The `head` and `tail` reference variables in the `SinglyLinkedList` class point to the `Node` objects in the heap.
    - Each `Node` object contains its `value` and a reference to the next `Node` (`next`).

2. **Memory Layout**:
    - The `SinglyLinkedList` object and its reference variables (`head`, `tail`, `size`) are stored in the heap.
    - Each `Node` object contains its `value` and a `next` reference to the next `Node` in the list (or `null` if it's the last node).

### Detailed Memory Layout

Here’s how it looks when you insert nodes with values 5, 3, and 7:

```
Heap:
+-------------------------------+
| SinglyLinkedList object       |
+-------------------------------+
| head = (ref)------------------|----+
| tail = (ref)------------------|----+
| size = 3                      |
+-------------------------------+
                                  |
                                  v
                      +-----------+------------+
                      | Node object (head)     |
                      +------------------------+
                      | value = 5              |
                      | next  = (ref)----------|----+
                      +------------------------+    |
                                                    v
                                   +----------------+----------------+
                                   | Node object (head.next)         |
                                   +---------------------------------+
                                   | value = 3                       |
                                   | next  = (ref)-------------------|----+
                                   +---------------------------------+    |
                                                                         v
                                                   +--------------------+----------------+
                                                   | Node object (head.next.next)        |
                                                   +-------------------------------------+
                                                   | value = 7                           |
                                                   | next  = null                        |
                                                   +-------------------------------------+
```

### Explanation

1. **SinglyLinkedList Object**:
    - Contains the `head`, `tail`, and `size` attributes.
    - `head` and `tail` reference variables point to the first and last nodes in the list, respectively.

2. **Node Objects**:
    - Each node contains a `value` and a `next` reference.
    - The `next` reference points to the next node in the list or `null` if it's the last node.

3. **Memory References**:
    - `head` points to the first `Node` object (with value 5).
    - `tail` points to the last `Node` object (with value 7).
    - The `next` references create the link between nodes, forming the linked list structure.

This visual representation and explanation demonstrate how the `SinglyLinkedList` and `Node` objects are stored and linked in memory.