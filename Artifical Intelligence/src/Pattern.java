import java.util.ArrayList;

public abstract class Pattern
{
  private Thing a;
  private Thing b;
  private ArrayList<Exc> c;
  private ArrayList<Thing> d;
  
  public Pattern(ArrayList<Thing> d, Thing b, ArrayList<Exc> c)
  {
    this.d = d;
    this.b = b;
    this.c = c;
  }
  
  public Pattern(Thing a, Thing b, ArrayList<Exc> c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  public Thing getA()
  {
    return a;
  }
  
  public Thing getB()
  {
    return b;
  }
  
  public ArrayList<Exc> getC()
  {
    return c;
  }
  
  public ArrayList<Thing> getD()
  {
    return d;
  }
}
