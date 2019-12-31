import java.util.ArrayList;

public class Variables
{
  //contains important variables of data that overseas everything
  private static ArrayList<Bucket> allBuckets = new ArrayList<>();
  private static ArrayList<Subset> allSubsetPatterns = new ArrayList<>();
  
  public static void addSubsetPattern(Subset a)
  {
    allSubsetPatterns.add(a);
  }
  
  public static ArrayList<Subset> getSubsetPatterns()
  {
    return allSubsetPatterns;
  }
  
  public static boolean isSubset(Thing child, Thing parent)
  {
    for(int i = 0; i < allSubsetPatterns.size(); i++) {
      if(allSubsetPatterns.get(i).getChild() == child && allSubsetPatterns.get(i).getParent() == parent) {
        return true;
      }
    }
    return false;
  }
  
  public static void save()
  {
    
  }

}
