import java.util.Comparator;

public class IndexRange 
{
  private int a;
  private int b;
  
  public IndexRange(int a, int b)
  {
    this.a = a;
    this.b = b;
  }
  
  public void setA(int a)
  {
    this.a = a;
  }
  
  public int getA()
  {
    return a;
  }
  
  public void setB(int b)
  {
    this.b = b;
  }

  public int compareTo(IndexRange other)
  {
    if(this.a == other.a && this.b == other.b || this.a < other.a && other.b < this.b)
      return 0;
    if(this.a < other.a)
      return -1;
    else
      return 1;
  }
  
  public String toString()
  {
    return "[" + a + "," + b + "]";
  }
}
