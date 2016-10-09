import java.io.BufferedReader;	
import java.io.BufferedWriter;	
import java.io.File;	
import java.io.FileNotFoundException;	
import java.io.FileOutputStream;	
import java.io.FileReader;	
import java.io.IOException;	
import java.io.OutputStreamWriter;	
import java.util.ArrayList;	
import java.util.List;	
import java.util.Random;	
	
public class IoTest {	
	public static void main(String[] args) {	
		long start = System.currentTimeMillis();	
		//委办局账号密码模板	
		File file1 = new File("C:/Users/admin/Desktop/新建文本文档.txt");	
		//输出模板	
		File file2 = new File("C:/Users/admin/Desktop/out.txt");	
		BufferedReader br1 = null;	
		BufferedReader br2 = null;	
		BufferedWriter bw = null;	
		Random ra =new Random();	
		try {	
			br1 = new BufferedReader(new FileReader(file1));	
			br2 = new BufferedReader(new FileReader(file2));	
			//输出文件	
			bw = new BufferedWriter(new OutputStreamWriter(	
					new FileOutputStream(	
							"C:/Users/admin/Desktop/新建文本文档 (2).txt")));	
			String s1 = null;	
			String s2 = null;	
			String[] re1 = null;	
			List<String> re2 = new ArrayList<String>();	
			// 处理file2 得到输出模板	
			while ((s2 = br2.readLine()) != null) {	
				re2.add(s2);	
			}	
			int index = 1;	
			while ((s1 = br1.readLine()) != null) {	
				re1 = s1.split("\t");	
				int randNum = ra.nextInt(899999)+100000;	
				//每一个委办局	
				for (String s : re2) {	
					s = s.replaceAll("anonymous", re1[0].trim());	
					s = s.replaceAll("\\{委办局\\}", re1[0].trim());	
					if (s.endsWith("userpassword=")) {	
						s = s + randNum;	
					}	
					if (s.endsWith("ftp")) {	
						s = s + "/" + re1[0].trim();	
					}	
					//System.out.println(s);	
					bw.write(s);	
					bw.write("\n");	
				}	
				System.out.println("委办局名称:"+re1[1].trim()+" 账号:"+re1[0].trim()+" 密码:"+randNum);	
				bw.write("\n");	
				//System.out.println();	
				index++;	
				bw.flush();	
			}	
				
		} catch (IOException e) {	
			e.printStackTrace();	
		} finally {	
			if (br1 != null) {	
				try {	
					br1.close();	
				} catch (IOException e) {	
					e.printStackTrace();	
				}	
			}	
			if (br2 != null) {	
				try {	
					br2.close();	
				} catch (IOException e) {	
					// TODO Auto-generated catch block	
					e.printStackTrace();	
				}	
			}	
		}	
		long end = System.currentTimeMillis();	
		System.out.println(end - start);	
	}	
	
}	
	
class t2 {	
	public static void main(String[] args) {	
		String s = "spypjdglj	市药监局";	
	
		String[] re = s.split("\t");	
		for (String string : re) {	
			System.out.println(string);	
		}	
	}	
}	
