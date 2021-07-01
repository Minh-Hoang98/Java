
package custom_serialize_sample;

import java.io.*;
class Account implements Serializable {
	private String ownerName;
	private String password;
	private float balance;

	public Account(){}//used when deserialize
	public Account(String ownerName, String password, float balance){
		this.ownerName=ownerName;
		this.password=password;
		this.balance=balance;
	}



	//called by ObjectOutputStream when serialize
	private void writeObject(ObjectOutputStream outStream) throws IOException {
		outStream.writeUTF("The password is swordfish");
		outStream.defaultWriteObject();
		System.out.println("Account.writeObject called");
	}

	//called by ObjectInputStream when de-serialize
	private void readObject(ObjectInputStream inStream) 	throws IOException, ClassNotFoundException {
		String pass = inStream.readUTF();
		if (!pass.equals("The password is swordfish")) 	throw new SecurityException("Bad password");
		inStream.defaultReadObject();
		System.out.println("Account.readObject called");
	}

	//override toString()
	public String toString(){
		return "Owner: "+ownerName +"\n"+"Password:"+password+"\n"+"Balance: "+balance+" USD";
	}

}

public class Custom_Serialize_Sample{
	public static void main(String[] args){
		//Serialization

		System.out.println("Serialization Start");
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"));
			Account acc = new Account("FPT University","password",1000000f);
			oos.writeObject(acc);
			oos.close();
		}
		catch(IOException ex){System.out.println("Serialization ERROR:"+ex);}
		System.out.println("Serialization Finish\n\n");


		//De-Serialization
		System.out.println("De-Serialization Start");
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"));
			Account acc = (Account)ois.readObject();
			ois.close();
			System.out.println("De-Serialization Finish\n\n");

			System.out.println("Account Details:");
			System.out.println(acc);
		}
		catch(Exception ex){System.out.println("Serialization ERROR:"+ex);}



	}
}
