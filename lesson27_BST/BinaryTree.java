package lesson27_BST;

public interface BinaryTree<T> {
    boolean isEmpty();
    void add(T data);
    T findMin();
    T findMax();
    void delete(T data);
    boolean contains(T data);
    void INOrder();
}
