public class BinaryTree<E extends Comparable<E>>
{
    Node<E> root;
	int nodes = 0;

	public BinaryTree() {
		root = null;	
	}
	
	private Node<E> addRecursive(Node<E> current, E value) {
		if (current == null) {
			Node<E> node = new Node<>(value, nodes);
			nodes++;
			return node;
		}
	
		if (root.compareTo(value) < 0) {
			current.left = addRecursive(current.left, value);
		} else if (root.compareTo(value) > 0) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}
	
		return current;
	}

	public void add(E value) {
		root = addRecursive(root, value);
	}
	
	public void traverseInOrder(Node<E> node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public Node<E> getRoot() {
		return root;
	}

	public E getValue(Node<E> node) {
		return node.value;
	}
	
}