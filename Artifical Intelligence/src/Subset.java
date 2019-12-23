import java.util.ArrayList;

public class Subset extends Pattern
{
  //should measure how close of a subset something is, 0 means complete match, closer matches to 0 are better matches
  private double subScore; 
  
  public Subset(Thing child, Thing parent, ArrayList<Exc> c, double subScore)
  {
    super(child,parent,c);
    Variables.addSubsetPattern(this);
    autoAdd();
  }
  
  public void autoAdd()
  {
    //if the parent is in the subset, then naturally
    for(int i = 0; i < Variables.getSubsetPatterns().size(); i++) {
      if(Variables.getSubsetPatterns().get(i).getChild().toString().equals(getParent().toString())) {
          Variables.getSubsetPatterns().add(new Subset(getChild(), Variables.getSubsetPatterns().get(i).getParent(), null, subScore +1));
      }
      //fix the duplciation error
    }
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
    return getChild().toString() + " is a subset of " + getParent().toString();
  }
}
