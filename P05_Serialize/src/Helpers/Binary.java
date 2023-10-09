package Helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Binary {

	public static void encodeToFile(Object obj, String path) throws IOException {
		
		try(ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(path))){
			oos.writeObject(obj);
		}
	}
	
	public static Object decodeFromFile(String path) throws IOException, ClassNotFoundException {
		Object object = null;
		
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(path))){
			object = ois.readObject();
		}
		
		return object;
	}
}
