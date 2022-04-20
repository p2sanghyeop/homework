package user2;

import java.util.ArrayList;
import java.util.List;

public class MainController{
    public static void main(String args[]){
        
        List<UserVO> list = new ArrayList<UserVO>();
        list.add(new UserVO("Alex","DEVELOP",200));
        list.add(new UserVO("Max","DEVELOP",80));
        list.add(new UserVO("Brian","DEVELOP",100));
        list.add(new UserVO("mr.Hyun","MANAGER",300));
        list.add(new UserVO("Allen","DEVELOP",110));
        list.add(new UserVO("Katter","DEVELOP",220));
        list.add(new UserVO("Hooker","MANAGER",1500));
        list.add(new UserVO("King","MASTER",0));
        
        //���⼭ ���� Ǯ ��
        UserService service = new UserService();
        service.updateSal(list, "DEVELOP");
        service.updateLv(list);
        service.deleteUser(list, 0);
        service.selectUserByEname(list, "King");
    }
}