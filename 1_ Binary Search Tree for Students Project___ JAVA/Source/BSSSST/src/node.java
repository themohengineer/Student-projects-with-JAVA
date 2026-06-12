
import java.util.Scanner;
public class node {
	static Scanner in=new Scanner(System.in);
	private String name;
	private float avrage;
	private long studentNumber;
	private int numberOfCourses;
	private node lc;
	private node rc;
	public node()
	{
		name="Mohammad Mohammadi";
		avrage=14;
		studentNumber=971120027;
		numberOfCourses=10;
		lc=null;
		rc=null;
	}
	public node( long s , int c , node l , node r)
	{
		//name=n;
		studentNumber=s;
		numberOfCourses=c;
		lc=l;
		rc=r;
	}
	public node(String n , long s , float a , int c , node l , node r)
	{
		name=n;
		studentNumber=s;
		avrage=a;
		numberOfCourses=c;
		lc=l;
		rc=r;
	}
	public void setName()
	{
		name=in.nextLine();
	}
	public String getName()
	{
		return name;
	}
	public void setAvrage(float a)
	{
		avrage=a;
	}
	public float getAvrage()
	{
		return avrage;
	}
	public void setStudentNumber(long s)
	{
		studentNumber=s;
	}
	public long getStudentNumber()
	{
		return studentNumber;
	}
	public void setNumberOfCourses(int n)
	{
		numberOfCourses=n;
	}
	public long getNumberOfCourses()
	{
		return numberOfCourses;
	}
	public void setLeftChild(node l)
	{
		lc=l;
	}
	public node getLeftChild()
	{
		return lc;
	}
	public void setRightChild(node r)
	{
		rc=r;
	}
	public node getRightChild()
	{
		return rc;
	}
}
