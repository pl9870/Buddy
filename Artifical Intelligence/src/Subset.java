import java.util.ArrayList;

public class Subset extends Pattern
{
  //should measure how close of a subset something is, 0 means complete match, closer matches to 0 are better matches
  private double subScore; 
  
  public Subset(Thing child, Thing parent, ArrayList<Exc> c, double subScore)
  {
    super(child,parent,c);
  }
  
  
  
  

}
