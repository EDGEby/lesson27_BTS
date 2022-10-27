package lesson27_BST;

public interface BinaryTree<T> {
    boolean isEmpty();
    void add(T data);
    Node<T> findMin(Node<T> root);
    T findMax();
    void delete(T data);
    boolean contains(T data);
}
