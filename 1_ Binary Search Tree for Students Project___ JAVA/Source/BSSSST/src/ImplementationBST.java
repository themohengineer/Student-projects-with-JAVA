

import java.util.Scanner;
public class ImplementationBST {
static Scanner in=new Scanner(System.in);
private node root;
private int numberOfNodes;
public ImplementationBST()
{
	root=null;
	numberOfNodes=0;
}
public void setRoot(node r)
{
	root=r;
}
public node getRoot()
{
	return root;
}
public void setNumberOfNodes(int x)
{
	numberOfNodes=x;
}
public int getNumberOfNodes()
{
	return numberOfNodes;
}



public void createAnEmptyBinarySearchTree()
{ 
	ImplementationBST t1=new ImplementationBST();
}
public boolean add()
{
	node newNode=new node();
	System.out.print("\nEnter name : ");
	newNode.setName();
	System.out.print("\nEnter Avrage : ");
	newNode.setAvrage(in.nextFloat());;
	System.out.print("\nEnter student number : ");
    newNode.setStudentNumber(in.nextLong());
	System.out.print("\nEnter number of courses : ");
	newNode.setNumberOfCourses(in.nextInt());
	
	 
	if(root==null)
	{
		root=newNode;
		numberOfNodes++;
		return true;
	}
	node temp=root;
	while(1>0)
	{
		if(temp.getStudentNumber()<newNode.getStudentNumber()&&temp.getRightChild()==null)
		{
			temp.setRightChild(newNode);
			numberOfNodes++;
			return true;
		}
		else if(temp.getStudentNumber()<newNode.getStudentNumber()&&temp.getRightChild()!=null)
			temp=temp.getRightChild();
		else if(temp.getStudentNumber()>=newNode.getStudentNumber()&&temp.getLeftChild()==null)
		{
			temp.setLeftChild(newNode);
			numberOfNodes++;
			return true;
		}
		else
			temp=temp.getLeftChild();
	}
}


// Delete Node  
public void deleteNode(String name , float avg , long studentNumber , int numberOfCourses) 
{ 
    root = deleteRec(root , name , avg , studentNumber , numberOfCourses); 
} 
node deleteRec(node root , String name , float avg , long studentNumber , int numberOfCourses) 
{ 
    if (root == null)  return root; 
    if (studentNumber < root.getStudentNumber()) 
        root.setLeftChild(deleteRec(root.getLeftChild(), name , avg , studentNumber , numberOfCourses)) ; 
    else if (studentNumber > root.getStudentNumber())
        root.setRightChild(deleteRec(root.getRightChild() , name , avg , studentNumber , numberOfCourses)) ; 
    else
    { 
        if (root.getLeftChild() == null) 
            return root.getRightChild(); 
        else if (root.getRightChild() == null) 
            return root.getLeftChild(); 
        root.setStudentNumber(minValue(root.getRightChild())); 
        root.setRightChild(deleteRec(root.getRightChild() , name , avg , studentNumber , numberOfCourses)); 
    } 
    return root; 
} 
public long minValue(node root) 
{ 
    long minv = root.getStudentNumber(); 
    while (root.getLeftChild() != null) 
    { 
        minv = root.getLeftChild().getStudentNumber(); 
        root = root.getLeftChild(); 
    } 
    return minv; 
} 
public void insert(String name , float avg , long studentNumber , int numberOfCourses) 
{ 
    root = insertRec(root , name , avg , studentNumber , numberOfCourses); 
} 
node insertRec(node root , String name, float avg  , long studentNumber , int numberOfCourses) 
{ 
    if (root == null) 
    { 
        root = new node(name , studentNumber , avg , numberOfCourses , null , null);                     
        return root; 
    } 
    if (studentNumber < root.getStudentNumber()) 
        root.setLeftChild(insertRec(root.getLeftChild() , name , avg , studentNumber , numberOfCourses)); 
    else if (studentNumber > root.getStudentNumber()) 
        root.setRightChild(insertRec(root.getLeftChild() , name , avg , studentNumber , numberOfCourses)); 
    return root; 
} 
public void inorder() 
{ 
    inorderRec(root); 
} 
public void inorderRec(node root) 
{ 
    if (root != null) 
    { 
        inorderRec(root.getLeftChild()); 
        System.out.print(root.getStudentNumber() + " "); 
        inorderRec(root.getRightChild()); 
    } 
} 
//End of delete


public node search(String name , float avg , long studentNumber , int numberOfCourses)
{
	node temp=root;
	while(temp!=null)
	{
		if(temp.getStudentNumber()==studentNumber)
			return temp;
		else if(temp.getStudentNumber()<studentNumber)
			temp=temp.getRightChild();
		else
			temp=temp.getLeftChild();
	}
	return null;
}


//Level order
void printLevelOrder() 
{ 
    int h = height(root); 
    int i; 
    for (i=1; i<=h; i++) 
        printGivenLevel(root, i); 
} 
int height(node root)
{ 
    if (root == null) 
       return 0; 
    else
    { 
        int lheight = height(root.getLeftChild()); 
        int rheight = height(root.getRightChild()); 
        if (lheight > rheight) 
            return(lheight+1); 
        else return(rheight+1);  
    } 
} 
void printGivenLevel (node root ,int level) 
{ 
    if (root == null) 
        return; 
    if (level == 1) 
        System.out.print(root.getName() + "\n"); 
    else if (level > 1) 
    { 
        printGivenLevel(root.getLeftChild(), level-1); 
        printGivenLevel(root.getRightChild(), level-1); 
    } 
} 
//End of level order


public void traversePreOrder(node node1) 
{
    if (node1 != null) {
        System.out.print(node1.getName() + " , ");
        traversePreOrder(node1.getLeftChild());
        traversePreOrder(node1.getRightChild());
    }
}
public void traverseInOrder(node node1) 
{ 
    if (root != null) 
    { 
        inorderRec(root.getLeftChild()); 
        System.out.print(root.getName() + " , "); 
        inorderRec(root.getRightChild()); 
    } 
} 
public void traversePostOrder(node node1) 
{
    if (node1 != null) {
        traversePostOrder(node1.getLeftChild());
        traversePostOrder(node1.getRightChild());
        System.out.print(node1.getName() + " , ");
    }
}
//traverse

public boolean isEmpty()
{
	if(root==null)
		return true;
	return false;
}
public boolean isFull()
{
	return false;
}
public void makeNull()
{
	root=null;
	numberOfNodes=0;
}
public boolean isLeaf(node node1)
{
	if(node1.getLeftChild()==null && node1.getRightChild()==null)
		return true;
	else
		return false;
}
public int numberOfNodes()
{
	return numberOfNodes;
}


public node getParentNode(node node1 , long studentNumber)
{
	if(node1 == null )
	return null;
	node getParent=null;
	while(node1!=null)
	{
		if(studentNumber<node1.getStudentNumber())
		{
			getParent=node1;
			node1=node1.getLeftChild();
		}
		else if(studentNumber>node1.getStudentNumber())
		{
			getParent=node1;
			node1=node1.getRightChild();
		} 
		else
			break;
	}
	return getParent;
	}
public void showParent(node node1 , long studentNumber)
{
	if(getParentNode(node1 , studentNumber)!=null)
		System.out.println("Parent of " + studentNumber + " = " + getParentNode(node1, studentNumber).getStudentNumber());
	else
		System.out.println("There is not Parent");
}
//End of find parent


public node getSiblingNode(node node1 , long studentNumber)
{
	if(node1==null||node1.getStudentNumber()==studentNumber)
	{
		System.out.println("Root does not have sibling");
		return null;
	}
	node parentNode=null;
	while(node1!=null)
	{
		if(studentNumber<node1.getStudentNumber())
		{
			parentNode=node1;
			node1=node1.getLeftChild();
		}
		else if(studentNumber>node1.getStudentNumber())
		{
			parentNode=node1;
			node1=node1.getRightChild();
		}
		else 
			break;
	}
	if(parentNode.getLeftChild()!=null && studentNumber==parentNode.getLeftChild().getStudentNumber())
	{
		return parentNode.getRightChild();
	}
	else if(parentNode.getRightChild()!=null && studentNumber==parentNode.getRightChild().getStudentNumber())
	{
		return parentNode.getLeftChild();
	}
	return null;
}
public void showSibling(node node1 , long studentNumber)
{
	if(getSiblingNode(node1, studentNumber)!=null)
		System.out.println("Sibling = " + getSiblingNode(node1 , studentNumber).getStudentNumber());
	else
		System.out.println("There is not Sibling ");
}
//End of find sibling

public int numberOfInternalNodes(node node1)
{
     int count =1;
     if(node1.getLeftChild() != null && !isLeaf(node1.getLeftChild()))
     {
           count += numberOfInternalNodes(node1.getLeftChild());
     }
      if(node1.getRightChild() != null && !isLeaf(node1.getRightChild()))
      {
             count += numberOfInternalNodes(node1.getRightChild());
      }
   return count;
}
public int numberOfLeafNodes(node node1)
{
	if(node1==null)
		return 0;
	if(node1.getLeftChild()==null && node1.getRightChild()==null)
		return 1;
	return numberOfLeafNodes(node1.getLeftChild()) + numberOfLeafNodes(node1.getRightChild());
}
public boolean isCompelete(node node1)
{
if(node1.getLeftChild() != null)
{
	if(!(node1.getLeftChild()==null && node1.getRightChild()==null)||(node1.getLeftChild()!=null && node1.getRightChild()!=null))
		return false;
      isCompelete(node1.getLeftChild());
}
 if(node1.getRightChild() != null)
 {
	 if(!(node1.getLeftChild()==null && node1.getRightChild()==null)||(node1.getLeftChild()!=null && node1.getRightChild()!=null))
 		return false;
        isCompelete(node1.getRightChild());
 }
return true;
}
public int height2(node node1)  
{ 
    if (node1 == null) 
        return 0; 
    else 
    { 
        int lHeight = height(node1.getLeftChild()); 
        int rHeight = height(node1.getRightChild()); 
        if (lHeight > rHeight) 
            return (lHeight + 1); 
         else 
            return (rHeight + 1); 
    } 
} 







}
