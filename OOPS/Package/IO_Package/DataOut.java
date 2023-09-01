

import java.io.*;

class Test 
{
    public static void main(String args[]) throws IOException 
	{
        File obj = new File("FPRI.txt");
        FileOutputStream fos = new FileOutputStream(obj);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeByte(5);
        dos.writeInt(10);
        dos.writeDouble(879.6);
        dos.writeBoolean(true);
        dos.close();
        fos.close();

        // -------------------Read The Data----------------------------
        DataInputStream dis = new DataInputStream(new FileInputStream(obj));
        System.out.println("Value= " + dis.readByte());
        System.out.println("Value= " + dis.readInt());
        System.out.println("Value= " + dis.readDouble());
        System.out.println("Value= " + dis.readBoolean());
        dis.close();
    }
}
