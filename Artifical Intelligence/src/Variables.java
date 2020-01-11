import java.util.ArrayList;

public class Variables
{
  //contains important variables of data that overseas everything
  private static ArrayList<Thing> allThings = new ArrayList<>();
  private static ArrayList<Bucket> allBuckets = new ArrayList<>();
  private static ArrayList<Subset> allSubsetPatterns = new ArrayList<>();
  private static ArrayList<CauseEffect> allCauseEffectPatterns = new ArrayList<>();
  public static final double SUBSET_STRENGTH_THRESHOLD = 5.0;
  public static final double NOT_SUBSET_VALUE = -1.0;
  
  public static ArrayList<Thing> getAllThings()
  {
    return allThings;
  }
  
  
  public static void addCauseEffectPattern(CauseEffect a)
  {
    allCauseEffectPatterns.add(a);
  }
  
  public static void addSubsetPattern(Subset a)
  {
    allSubsetPatterns.add(a);
  }
  
  public static void addThing(Thing a)
  {
    allThings.add(a);
  }
  
  public static ArrayList<Subset> getSubsetPatterns()
  {
    return allSubsetPatterns;
  }
  
  public static double isSubset(Thing child, Thing parent)
  {
    for(int i = 0; i < allSubsetPatterns.size(); i++) {
      if(allSubsetPatterns.get(i).getChild() == child && allSubsetPatterns.get(i).getParent() == parent) {
        return allSubsetPatterns.get(i).getSubScore();
      }
    }
    return NOT_SUBSET_VALUE;
  }
  
  public static void save()
  {
    
  }

}
