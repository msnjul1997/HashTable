package hashtable;

import java.util.ArrayList;

public class Implementation<K, V> {
	 Node head;
	   Node tail;
	   private int numOfBuckets = 0;
	   ArrayList<Node<K,V>> myBucketArray;

	   public void HashTableImpl() 
	   {
	       this.numOfBuckets = 20;                    
	       this.myBucketArray = new ArrayList<>();
	       for (int i = 0; i < numOfBuckets; i++)
	           this.myBucketArray.add(null);
	   }

	   public void add(K key, V value)
	   {
	       int index = this.getBucketIndex(key);
	       Node<K,V> myNode= this.myBucketArray.get(index);
	       if(myNode == null)
	       {
	           myNode = new Node<>(key , value);
	           this.myBucketArray.set(index, myNode);
	       }
	       myNode = (Node<K, V>) searchNode(key);
	       if(myNode == null)
	       {
	           myNode = new Node<>(key , value);
	           this.append(myNode);
	       }
	       else 
	       {
	           myNode.setValue(value);
	       }
	   }

	   private Node<K, V> searchNode(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	private int getBucketIndex(K key) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Append the value in the linked list
	   public void append(Node myNode)
	   {
	       if(this.head == null)
	           this.head = myNode;
	       if(this.tail == null)
	           this.tail = myNode;
	       else
	       {
	           this.tail.setNext(myNode);
	           this.tail = myNode;
	       }
	   }

}
