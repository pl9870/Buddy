import java.util.ArrayList;

public class CauseEffect extends Pattern
{
  private double spacing;
  
  //we can relate ideas, words with spacing, ideas and words, and we should have multiple things
  //need to look at subset of ideas when analyzing 
  public CauseEffect(ArrayList<Thing> a, Thing b, ArrayList<Exc> c, double spacing)
  {
    super(a,b,c);
    this.spacing = spacing;
  }
  
  public CauseEffect(ArrayList<Thing> a, Thing b, ArrayList<Exc> c)
  {
    super(a,b,c);
  }
  
  private class Spacing {
    public Spacing() 
    {
      
    }
  }
}
