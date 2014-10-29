package Tree;

import java.util.List;
public abstract class Tree<T> {
public abstract void add(Tree<T> data);
public abstract List<T> Travel();
private int id;
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}


}
