import java.util.ArrayList;
import java.util.HashMap;

public class CauseEffect extends Pattern
{
  private boolean wordsOnly;
  private double ratio; 
  private ArrayList<Integer> order;
  
  //we can relate ideas, words with spacing, ideas and words, and we should have multiple things
  //need to look at subset of ideas when analyzing 
  public CauseEffect(ArrayList<Thing> a, Thing b, ArrayList<Exc> c, boolean wordsOnly, double ratio, ArrayList<Integer> order)
  {
    super(a,b,c);
    this.wordsOnly = wordsOnly;
    this.ratio = ratio;
    this.order = order;  //when finding order, you simply give a counter add one for every thing, once you put the b thing give it a negative
  }
  
  public void updateRatio()
  {
    
  }
  

  
 
}
