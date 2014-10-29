package Tree;



import java.util.List;

import Model.User;

class TestBiTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User [] users={new User(1,"name1","info1"),new	User(6,"name6","info6"),new User(3,"name3","info3"),new User(4,"name4","info4"),new User(2,"name2","info2"),new User(7,"name7","info7"),new User(9,"name9","info9")}	;	 


BiTree<User> bitree=new BiTree<User>(users[0].getId(),users[0]);
for(int i=1;i<users.length;i++){
	bitree.add(new BiTree(users[i].getId(),users[i]));
}
List<User> userList=bitree.DLRTravel();

		
	}


}
