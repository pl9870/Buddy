import java.util.ArrayList;
import java.util.HashMap;

public class CauseEffect extends Pattern
{
  private boolean wordsOnly;
  private double numRight;
  private double numWrong;
  private double ratio; 
  private int order;
  
  //we can relate ideas, words with spacing, ideas and words, and we should have multiple things
  //need to look at subset of ideas when analyzing 
  
  //d contains both causes and effect in order //int order has the index of the effect
  public CauseEffect(ArrayList<Thing> d, ArrayList<Exc> c, boolean wordsOnly, double numRight, double numWrong, int order)
  {
    super(d,c);
    this.wordsOnly = wordsOnly;
    this.numRight = numRight;
    this.numWrong = numWrong;
    this.ratio = (numRight)/(numRight+numWrong);
    this.order = order;  //when finding order, you simply give a counter add one for every thing, once you put the b thing give it a negative
    Variables.addCauseEffectPattern(this);
  }
  
  public double getRatio()
  {
    return ratio;
  }
 
    
  //returns if Data has the same causes and effects //now we have to include ideas
  public void updateRatio(Data x)
  {
    for(int i = 0; i < getD().size() - 1; i++)
    {
      Thing now = getD().get(i);
      Thing next = getD().get(i+1);
      int j = 1;
      if(x.indexOf(now,1).compareTo(new IndexRange(-1,-1)) == 0)
        return;
      while(x.indexOf(now,1).compareTo(x.indexOf(next,j)) == 0)
      {
        if(x.indexOf(next,j).compareTo(new IndexRange(-1,-1)) == 0)
          return;
        if(x.indexOf(now,1).compareTo(x.indexOf(next,j)) != 0)
          break;
        j++;
      }
      
      if(x.indexOf(now,1).compareTo(x.indexOf(next,j)) < 0)
      {
        continue;
      }
      else
      {
        numWrong++;
        ratio = (numRight)/(numRight+numWrong);
        return;
      }
    }
    
    numRight++;
    ratio = (numRight)/(numRight+numWrong);
    return;
    
    //go through each element of D except the last element CHECK
    //find the index in the data of the thing wanted, and the next thing CHECK
    //create method in Data that finds the index range of Thing simple object CHEKC
    //while(index range ==  each other), find the next occurence of next CHECK
    //if index range of either isn't in contains = false; break; and do the end CHECK
    //if index range 2 > index range 1 then inOrder = true
    //else inOrder= false brekal
    

    
    
  }
  

  

  
 
}
