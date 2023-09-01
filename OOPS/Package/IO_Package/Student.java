import java.io.*;
class Test
{
	public static void main(String args[]) throws Exception
	{
		File f = new File("Record.txt");
		FileOutputStream fos = new FileOutputStream(f);

	
		DataOutputStream dos = new DataOutputStream(fos);
		
		//dos.writeUTF("Roll Number");
		dos.writeUTF("Name     Roll Number       Marks");
		fos.write('\n');
		dos.writeUTF("Vinod       101               98");
		fos.write(10);
		dos.writeUTF("Shyam       102               99");
		fos.write('\n');
		dos.writeUTF("Nihar       103               98" );
		fos.write('\n');
		
		
		//dos.writeByte(10);
		//dos.writeInt(5);
		//dos.writeDouble(89.6);
		//dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fin  =new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fin);
		System.out.println(dis.readUTF());
		System.out.println(fin.read());
		System.out.println(dis.readUTF());
		System.out.println(fin.read());
		System.out.println(dis.readUTF());
		System.out.println(fin.read());
		System.out.println(dis.readUTF());
		System.out.println(fin.read());	
		//System.out.println(dis.readByte());
		//System.out.println(dis.readInt());
		//System.out.println(dis.readDouble());
		//System.out.println("Value="+dis.readByte());
		//dis.flush();
		dis.close();	
	}
}