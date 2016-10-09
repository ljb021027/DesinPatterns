package sanj;	
	
import java.util.ArrayList;	
import java.util.List;	
	
public class Method {	
	
	/**	
	 * 初始化图形点数据	
	 */	
	public static List<Line> init() {	
		List<Line> lineList = new ArrayList<Line>();	
		Line Line1 = addLine("A", "D", "C");	
		lineList.add(Line1);	
	
		Line Line2 = addLine("A", "I", "K", "G");	
		lineList.add(Line2);	
	
		Line Line3 = addLine("A", "J", "L", "H");	
		lineList.add(Line3);	
	
		Line Line4 = addLine("A", "E", "B");	
		lineList.add(Line4);	
	
		Line Line5 = addLine("B", "H", "G", "C");	
		lineList.add(Line5);	
	
		Line Line6 = addLine("C", "K", "L", "E");	
		lineList.add(Line6);	
	
		Line Line7 = addLine("D", "I", "J", "E");	
		lineList.add(Line7);	
	
		return lineList;	
	}	
	
	/**	
	 * 添加线方法	
	 * 	
	 * @param spot	
	 * @return	
	 */	
	public static Line addLine(String... spot) {	
		Line line = new Line();	
		List<String> spots = new ArrayList<String>();	
		for (int i = 0; i < spot.length; i++) {	
			spots.add(spot[i]);	
		}	
		line.setSpots(spots);	
		return line;	
	}	
	
	public String ss = "";	
	
	/**	
	 * 从M字符串中N个字符的所有不重复排列组合	
	 * 	
	 * @param number	
	 *            M	
	 * @param length	
	 *            N	
	 * @param s2	
	 *            一般为""	
	 */	
	public void printAll(String number, int length, String s2) {	
		if (s2.length() == length) {	
			ss = ss + s2 + ",";	
		} else {	
			for (int i = 0; i < number.length(); i++) {	
				printAll(new StringBuffer(number).substring(i + 1).toString(),	
						length, s2 + number.charAt(i));	
			}	
		}	
	}	
	/**	
	 * 是否是三角形	
	 * @param lineList 所有线集合	
	 * @param num 3个字符的字符串	
	 * @return	
	 */	
	public Boolean isTriangle(List<Line> lineList,String num){	
		char[] cs = num.toCharArray();	
		Boolean bl = onOneLine(lineList, String.valueOf(cs[0]), String.valueOf(cs[1]), String.valueOf(cs[2]));	
		if(bl){	
			return false;	
		}	
		ss="";	
		printAll(num, 2, "");	
		String[] strs = ss.split(",");	
		for(String s : strs){	
			char[] cA = s.toCharArray();	
			Boolean b = onOneLine(lineList,String.valueOf(cA[0]),String.valueOf(cA[1]));	
			if(!b){	
				return b;	
			}	
		}	
		return true;	
			
	}	
	/**	
	 * 判断2个点是否在一条线	
	 * 在true	
	 * 不在false	
	 * @param a	
	 * @param b	
	 * @return	
	 */	
	public Boolean onOneLine(List<Line> lineList,String a,String b){	
		for(Line line : lineList){	
			List<String> spots = line.getSpots();	
			if(spots.contains(a) && spots.contains(b)){	
				return true;	
			}	
		}	
		return false;	
			
	}	
	/**	
	 * 判断三个点是否在一条线上	
	 * 在true	
	 * 不在false	
	 * @param lineList	
	 * @param a	
	 * @param b	
	 * @param c	
	 * @return	
	 */	
	public Boolean onOneLine(List<Line> lineList,String a,String b,String c){	
		for(Line line : lineList){	
			List<String> spots = line.getSpots();	
			if(spots.contains(a) && spots.contains(b) && spots.contains(c)){	
				return true;	
			}	
		}	
		return false;	
			
	}	
		
	
	public Spot addSpot(String mySpotName, String... otherSpotName) {	
		Spot spot = new Spot();	
		spot.setMySpot(mySpotName);	
		List<String> otherSport = new ArrayList<String>();	
		for (int i = 0; i < otherSpotName.length; i++) {	
			otherSport.add(otherSpotName[i]);	
		}	
		spot.setOtherSpot(otherSport);	
		return spot;	
	}	
}	
