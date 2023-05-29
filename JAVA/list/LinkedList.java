package JAVA.list;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        private int value;
        private Node nextNode;
        private Node previousNode;
    }


    public static void main(String[] args) {

        // Task 3: Реализовать метод разворота связного списка
        System.out.println("\n\t Task 3: List reverse");
        LinkedList list = new LinkedList();
        list.addList(2, 5, 7, 8, 3, 6, 1, 7);
        list.Print();

        list.revert();
        list.Print();
        System.out.println();
    }


    // Добавление элементов в конец списка
    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.nextNode = node;
            node.previousNode = tail;
            tail = node;
        }
    }


    // Добавление элементов в списсок после указанного значения
    public void add(int value, Node previousNode) {
        Node node = new Node();
        node.value = value;
        Node nextNode = previousNode.nextNode;
        previousNode.nextNode = node;
        node.previousNode = previousNode;
        node.nextNode = nextNode;
        nextNode.previousNode = node;
    }


    // Заполнение списка
    public void addList(int... arguments) {

        for (int i = 0; i < arguments.length; i++)
            addLast(arguments[i]);
    }


    // Поиск элементов в связном списке
    public Node findNode(int value) {
        Node node = head;
        while (node.nextNode != null) {
            node = node.nextNode;
            if (node.value == value) {
                return node;
            }
        }
        return null;
    }


    // Разворот связного списка
    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.nextNode;
            Node previous = currentNode.previousNode;
            currentNode.nextNode = previous;
            currentNode.previousNode = next;
            if (previous == null) {
                tail = currentNode;
            }

            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }


    // Печать связного списка
    public void Print() {
        if (head != null) {
            System.out.print("\n[ ");
            Node currentNode = head;
            while (currentNode.nextNode != null) {
                System.out.print(currentNode.value + ", ");
                currentNode = currentNode.nextNode;
            }
            System.out.print(currentNode.value + " ]\n");
        }
    }

}
