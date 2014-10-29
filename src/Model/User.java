package Model;

public class User {
private int id;
public  int getId() {
	return id;
}
public  void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public  void setName(String name) {
	this.name = name;
}
public  String getInfo() {
	return info;
}
public  void setInfo(String info) {
	this.info = info;
}
private String name;
private String info;
public User(){}
public User(int id,String name,String info ){
	this.id=id;
	this.name=name;
	this.info=info;
	
	
	}
public User(String name,String info){
	
	super();
	this.name=name;
	this.info=info;
	
	
}
}
