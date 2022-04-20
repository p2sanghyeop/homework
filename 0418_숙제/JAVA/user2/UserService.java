package user2;

import java.util.List;

/**
 * @author sanghyeop Lee
 * @date 2022. 4. 20.
 * @comment : 유저로직 처리 클래스
 * version : 0.0.1v
 */
public class UserService implements UserServiceImple{

	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
//		int sal = 0;
//        for(int i=0; i<list.size(); ++i) {
//       	if(list.get(i).getDname().equals("DEVELOP")) {
//       		sal = list.get(i).getSal()*2;
//       	}
//       	 System.out.println("월급"+sal);
//        }
//        return list;
		for(int i=0; i<list.size(); ++i) {
			String temp = list.get(i).getDname();
			if(temp.equals(dname)) {
				int sal = list.get(i).getSal();
				sal = sal*2;
				list.get(i).setSal(sal);
			}
		}
		return list;
	}
	

	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
//		for(int i=0; i<list.size(); ++i) {
//       	 if(0 < list.get(i).getSal() &&list.get(i).getSal() <=100 ) {
//       		 list.get(i).setLv(1);
//       	 }
//       	 if(101 < list.get(i).getSal() &&list.get(i).getSal() <= 1000 ) {
//       		 list.get(i).setLv(2);
//       	 }
//       	 if(list.get(i).getSal() > 1000 ) {
//       		 list.get(i).setLv(3);
//       	 }
//       	 System.out.println("레벨"+list.get(i).getLv());
//        }
//		return list;
		
		
		return null;
	}

	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).getLv() ==3) {
//				list.remove(i);
//			}
//			System.out.println("남은직원 "+list.get(i).getEname());
//		}
//		return list;
		for(int i=0; i<list.size(); ++i) {
			int templv = list.get(i).getLv();
			if(templv >= lv) {
				list.remove(i);
			}
		}
		return list;
	}

	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).getEname().equals("King")) {
//				System.out.println("부서 "+list.get(i).getDname());
//				System.out.println("이름 "+list.get(i).getEname());
//				System.out.println("월급 "+list.get(i).getSal());
//				System.out.println("레벨 "+list.get(i).getLv());
//			}
//		}
//		return null;
		for(int i=0; i<list.size(); ++i) {
			String tempEname = list.get(i).getEname();
			if(ename.equals(tempEname)) {
				return list.get(i);
			}
		}
		return null;
	}

	

}
