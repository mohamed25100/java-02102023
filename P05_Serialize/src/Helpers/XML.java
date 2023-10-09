package Helpers;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XML {

	public static void encodeToFile(Object obj, String path) throws FileNotFoundException {
		
//		FileOutputStream fos = new FileOutputStream(path);
//		
//		XMLEncoder encoder = new XMLEncoder(fos);
		
		// try with ressources : s'occupe de libérer les ressources allouées
		try (XMLEncoder encoder = new XMLEncoder(new FileOutputStream(path))) {
			encoder.writeObject(obj);
		}
	}
	
	public static Object decodeFromFile(String path) throws FileNotFoundException {
		
		Object object = null;
			
		// try with ressources : s'occupe de libérer les ressources allouées
		try(XMLDecoder decoder = new XMLDecoder(new FileInputStream(path))){
			object = decoder.readObject();
		}
		
		return object;
	}
}
