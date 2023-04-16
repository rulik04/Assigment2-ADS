public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(1);
        System.out.print("ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size of ArrayList " + arrayList.size);
        System.out.println("Get 2th element " + arrayList.get(1));
        arrayList.remove(4);
        arrayList.remove((Integer) 5);
        System.out.print("ArrayList after remove: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("contain: 0? " + arrayList.contains(0));
        System.out.println("s: 3? " + arrayList.contains(3));
        arrayList.add(5, 3);
        System.out.print("ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println("index of 2: " + arrayList.indexOf(2));
        System.out.println("index of 20: " + arrayList.indexOf(20));
        System.out.println("Last index of 5: " + arrayList.lastIndexOf(5));
        System.out.println("Last index of 20: " + arrayList.lastIndexOf(20));
        arrayList.sort();
        System.out.print("ArrayList after sort: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println("--------------------------------------------------------------");


        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(1);
        System.out.print("LinkedList: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size of LinkedList " + linkedList.size);
        System.out.println("Get 2th element " + linkedList.get(1));
        linkedList.remove(4);
        linkedList.remove((Integer) 5);
        System.out.print("LinkedList after remove: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
        System.out.println("contain: 0? " + linkedList.contains(0));
        System.out.println("s: 3? " + linkedList.contains(3));
        linkedList.add(5, 3);
        System.out.print("LinkedList: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        System.out.println("index of 2: " + linkedList.indexOf(2));
        System.out.println("index of 20: " + linkedList.indexOf(20));
        System.out.println("Last index of 5: " + linkedList.lastIndexOf(5));
        System.out.println("Last index of 20: " + linkedList.lastIndexOf(20));
        linkedList.sort();
        System.out.print("ArrayList after sort: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();




    }
}