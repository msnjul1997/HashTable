package hashtable;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) 
	{
	        Hashtable<String, Integer> hashImpl = new Hashtable();
	        String message = "Paranoids are not paranoid because they are paranoid but " +
	                "because they keep putting themselves deliberately into paranoid avoidable situations";

	        //String to String[] conversion.
	   
	        String[] messageArray = message.toLowerCase().split(" ");

	        //Iterate within the array
			/*
			 * for(String word: messageArray) { Integer value = hashImpl.get(word);
			 * 
			 * if( value == null) value = 1; else value = value + 1; hashImpl.add(word ,
			 * value); }
			 */
	        //Display the hashTable
	        System.out.println(hashImpl);

	        //Remove "avoidable" from the hashTable
	        hashImpl.remove("avoidable");

	        //Display the hashTable
	        System.out.println(hashImpl);
	    }

}
