/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_4;

/**
 *
 * @author PC
 */


import Practical1_4.Bus;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;







public class SaveBusTree {


	public static boolean savefile(BSTreeBus dskh, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			LinkedList<BusNode> listLine= dskh.getListNode();


			for(BusNode kh : listLine) {
				String line = kh.info.getbCode()+";"+kh.info.getBusName()+";"+ kh.info.getSeat()+";"
						+ kh.info.getBooked()+";"+kh.info.getDepartTime()+";"+kh.info.getArrivalTime();
				bw.write(line);
				bw.newLine();
			}

			bw.close();
			osw.close();
			fos.close();
			return true;

		} catch (Exception e) {
			System.out.println("Please must be checked file's path again! ");
		}
		return false;		
	}





	public static BSTreeBus readfile (String path){
//		LinkedList<Bus> dskh = new LinkedList<Bus>();
		BSTreeBus dskh=new BSTreeBus();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String line = br.readLine();

			while(line!= null) {
				String arr[] = line.split(";");
				int a=Integer.valueOf(arr[2]);
				int b=Integer.valueOf(arr[3]);
				double c=Double.valueOf(arr[4]);
				double d=Double.valueOf(arr[5]);
				if(arr.length==6) {
					Bus kh = new Bus(arr[0], arr[1], a, b, c, d);
					dskh.insert(kh);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Please must be checked file's path again or you must "
					+ "be save file before execute that function! ");
		}
		return dskh;

	}


}
