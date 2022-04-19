package user;

import java.util.ArrayList;
import java.util.List;

public class MainController {

	public static void main(String[] args) {
		 List<UserVO> list = new ArrayList<UserVO>();
         list.add(new UserVO("Alex","DEVELOP",200));
         list.add(new UserVO("Max","DEVELOP",80));
         list.add(new UserVO("Brian","DEVELOP",100));
         list.add(new UserVO("mr.Hyun","MANAGER",300));
         list.add(new UserVO("Allen","DEVELOP",110));
         list.add(new UserVO("Katter","DEVELOP",220));
         list.add(new UserVO("Hooker","MANAGER",1500));
         list.add(new UserVO("King","MASTER",0));
         int sal = 0;
         //1¹ø
         for(int i=0; i<list.size(); ++i) {
        	if(list.get(i).getDname() == "DEVELOP") {
        		sal = list.get(i).getSal()*2;
        	}
        	 System.out.println(sal);
         }
         int lv1;
         int lv2;
         int lv3;
         for(int i=0; i<list.size(); ++i) {
        	 if(0 < list.get(i).getSal() &&list.get(i).getSal() < 100 ) {
        		 lv1=list.get(i).getLv();
        	 }
        	 if(101 < list.get(i).getSal() &&list.get(i).getSal() < 1000 ) {
        		 lv2=list.get(i).getLv();
        	 }
        	 if(list.get(i).getSal() >1001 ) {
        		 lv3=list.get(i).getLv();
        	 }
        	 System.out.println(list.get(i).getLv());
         }
         
	}
	
}
