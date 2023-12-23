public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        list.revers();
        System.out.println(list);
        
    }
}