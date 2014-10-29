package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BiTree<T> extends Tree<T> {

	@Override
	public void add(Tree<T> data) {
		// TODO Auto-generated method stub
		
		Stack<Tree<T>> stack=new Stack<Tree<T>>();
		if(data!=null)
		stack.push(data);
		while(!stack.empty()){
			
			
			
		}
		
		
	}

	@Override
	public List<T> Travel() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> DLRTravel() { 
		this.travelResult.add(data);
		if(this.getLeftChildTree()!=null){
		   
			
			
		}else{
			
			
			
			
		}
		
		
		
		
		return this.travelResult;
		

	
	}

	private int id;
	private T data;
	private Tree<T> leftChildTree;
	private Tree<T> rirhtChildTree;
	private List<T> travelResult = new ArrayList<T>();

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		id = id;
	}

	protected T getData() {
		return data;
	}

	protected void setData(T data) {
		this.data = data;
	}

	protected Tree<T> getLeftChildTree() {
		return leftChildTree;
	}

	protected void setLeftChildTree(Tree<T> leftChildTree) {
		this.leftChildTree = leftChildTree;
	}

	protected Tree<T> getRirhtChildTree() {
		return rirhtChildTree;
	}

	protected void setRirhtChildTree(Tree<T> rirhtChildTree) {
		this.rirhtChildTree = rirhtChildTree;
	}

public BiTree(){
	
	super();
	
}

public BiTree(int id,T data){
	this.id=id;
	this.data=data;
	
	
}
}
