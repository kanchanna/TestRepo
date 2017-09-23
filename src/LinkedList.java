
public class LinkedList<T> {
	private Node<T> head;
	
	private static class Node<T>{
		Node<T> next;
		T data;
		Node(T data){
			this.data = data;
		}
	}
	
	public void addNode(T value){
		Node<T> n = new Node<>(value);
		if (head!=null) {
			n.next= head;
			head= n;
		}else{
			head =n;
		}
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList llObj = new LinkedList();
		llObj.addNode(1);
		llObj.addNode(34);
		System.out.println("Hello world");

	}

}
