package lesson27_BST;

public class Test {
    public static void main(String[] args){
        BST<Integer> t1=new BST<>();
        t1.add(8);
        t1.add(5);
        t1.add(4);
        t1.add(9);
        t1.add(10);
        t1.add(6);
        t1.add(12);
        t1.INOrder();
        System.out.println(t1.contains(6));
        t1.delete(9);
        t1.preorder(t1.getRoot());

    }
}
