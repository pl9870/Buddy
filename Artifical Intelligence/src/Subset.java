import java.util.ArrayList;

public class Subset extends Pattern
{
  //should measure how close of a subset something is, 0 means complete match, closer matches to 0 are better matches
  private double subScore; 
  private boolean derived;
  
  //only relates ideas not words
  public Subset(Thing child, Thing parent, ArrayList<Exc> c, double subScore, boolean derived)
  {
    super(child,parent,c);
    this.subScore = subScore;
    this.derived = derived;
    if(derived == false)
      Variables.addSubsetPattern(this);
    autoAdd();
  }
  
  public void autoAdd()
  {
    //if the parent is in the subset, then naturally
    for(int i = 0; i < Variables.getSubsetPatterns().size(); i++) {
      if(Variables.getSubsetPatterns().get(i).getChild().toString().equals(getParent().toString())) {
          Variables.getSubsetPatterns().add(new Subset(getChild(), Variables.getSubsetPatterns().get(i).getParent(), null, subScore + Variables.getSubsetPatterns().get(i).getSubScore(), true));
      }
    }
  }
  
  public double getSubScore()
  {
    return subScore;
  }
  
  public Thing getParent() //just here instead of b to clarify
  {
    return getB();
  }
  
  public Thing getChild() //just here instead of b to clarify
  {
    return getA();
  }

  public String toString()
  {
    return "(C:" + getChild().toString() + ",P:" + getParent().toString() + ",Sc:" + subScore + ",Der:" + derived + ")";
  }
}
