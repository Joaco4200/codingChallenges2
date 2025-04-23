package Tp6;

public class Program {

	public static void main(String[] ags) {
		
	Node node1= new Node();
	Node node2= new Node();
	Node node3= new Node();
	node1.setValue(5);
	node2.setValue(2);
	node3.setValue(11);
	node1.setNext(node2);
	node2.setNext(node3);
	
	System.out.println(NodeExercises.countPairNodeValues(node1));
	
	}
}
