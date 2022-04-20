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
         
         //1번
         int sal = 0;
         for(int i=0; i<list.size(); ++i) {
        	if(list.get(i).getDname().equals("DEVELOP")) {
        		sal = list.get(i).getSal()*2;
        	}
        	 System.out.println("월급"+sal);
         }
         
         //2번
         for(int i=0; i<list.size(); ++i) {
        	 if(0 < list.get(i).getSal() &&list.get(i).getSal() <=100 ) {
        		 list.get(i).setLv(1);
        	 }
        	 if(101 < list.get(i).getSal() &&list.get(i).getSal() <= 1000 ) {
        		 list.get(i).setLv(2);
        	 }
        	 if(list.get(i).getSal() > 1000 ) {
        		 list.get(i).setLv(3);
        	 }
        	 System.out.println("레벨"+list.get(i).getLv());
         }
         
         //3번
         for(int i=0; i<list.size(); ++i) {
        	 if(list.get(i).getLv() == 3) {
        		 list.remove(i);
        	 }
        	 System.out.println("남은직원"+list.get(i).getEname()+" 레벨"+list.get(i).getLv());
         }
         
         //4번
         for(int i=0; i<list.size(); ++i) {
        	 if(list.get(i).getEname().equals("King")) {
        		 System.out.println("부서 "+list.get(i).getDname());
        		 System.out.println("레벨 "+list.get(i).getLv());
        		 System.out.println("월급 "+list.get(i).getSal());
        		 System.out.println("이름 "+list.get(i).getEname());
        	 }
         }
	}
	
}
