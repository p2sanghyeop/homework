package user;

import java.util.List;

public class UserService {
	 //1. �μ��̸��� DEVELOP�� ��� �޿��� 2�� �λ��Ͻÿ�.
    public List<UserVO> updateSal(List<UserVO> list, String dname){
    	return list;
    }
    //2. �޿��� 0 ~ 100 : 1 ����, 101 ~ 1000 : 2 ����, 1001 �̻���ʹ� 3 ������ �����Ͻÿ�.
    public List<UserVO> updateLv(List<UserVO> list){
        return list;
    }
    //3. ���� 3�̻� ������ ��� �ذ��Ͻÿ�.
    public List<UserVO> deleteUser(List<UserVO> list, int lv){
        return null;
    }
    //4. �̸��� King�� ������ ��� ���� ��ȸ.
    public UserVO selectUserByEname(List<UserVO> list, String ename){
        return null;
    }

}
