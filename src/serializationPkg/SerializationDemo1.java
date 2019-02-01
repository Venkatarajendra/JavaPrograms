package serializationPkg;

import java.io.*;


class Dog implements Serializable {
	int a=10;
	transient int b=20;
	int c = 30;
}
public class SerializationDemo1 {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		// Below code is for Serialization
		FileOutputStream fos = new FileOutputStream("raja.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		// Below code is for De-Serialization
		FileInputStream fis = new FileInputStream("raja.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.a+"..."+d2.b+"..."+d2.c);

	}

}

/* Conclusion: if we use transient keyword, that variable will not be serializable and hence we get default value
 * in the above example, int b is transient and hence we got 0 which is default value
 */
