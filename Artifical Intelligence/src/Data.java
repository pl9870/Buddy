import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Data
{
  private String data;
  
  public Data(String data)
  {
    this.data = data;
  }
  
  //returns all subsets of data through String combo
  //has complexity O(n^4)   //unforunately we have to make //only returns words subsets later
  public ArrayList<Thing> findThingCombos()
  {  
    int len = data.length();  
    int temp = 0;  
    ArrayList<Thing> arr = new ArrayList<Thing>();
    for(int i = 0; i < len; i++) {  
        for(int j = i; j < len; j++) {  
            boolean x = false;
            for(int m = 0; m < Variables.getAllThings().size(); m++)
            {
              if(Variables.getAllThings().get(m).getCharacters().equals("!~" + data.substring(i, j+1)))
              {
                arr.add(Variables.getAllThings().get(m));
                x = true;
              }
            }
            if(x == false)
            {
              arr.add(new Thing("!~" + data.substring(i, j+1)));
            }
        }  
    } 
    return arr;
  }
  
  public String getData()
  {
    return data;
  }
  
  //kobe bryant is a god
  
  public IndexRange indexOf(Thing a, int n) //both ranges are inclusive
  {
    if(n <= 0)
      return null;
    ArrayList<Thing> p = findThingCombos();
    System.out.println(p);
    IndexRange x = new IndexRange(-1,-1);
    if(a.isWord())
    {
      int i = 0, idx = -1;
      while (i++ < n) {
        if ((idx = data.indexOf(a.getCharacters().substring(2), idx + 1)) < 0) 
        {
          idx = -1;
        }
      }
      x.setA(idx);
      x.setB(x.getA() + a.getCharacters().substring(2).length() - 1);
    }
    else
    {
      Map<Thing,IndexRange> m = new HashMap<Thing, IndexRange>();
      for(int i = 0; i < p.size(); i++)
      {
        if(p.get(i).getParents().contains(a)) //this.indexOf(new Thing(p.get(i).getCharacters(), n))
          m.put(a, indexOf(new Thing(p.get(i).getCharacters()),n));
              //new IndexRange(data.indexOf(p.get(i).getCharacters().substring(2)), data.indexOf(p.get(i).getCharacters().substring(2)) + p.get(i).getCharacters().substring(2).length() - 1));
      }
      System.out.println(m);
      if(m.size() == 0)
        return null;
      return (IndexRange)m.values().toArray()[0];

      
      /*Set<Entry<Thing, IndexRange>> set = m.entrySet();
      List<Entry<Thing, IndexRange>> list = new ArrayList<Entry<Thing, IndexRange>>(set);
      Collections.sort( list, new Comparator<Map.Entry<Thing, IndexRange>>()
      {
          public int compare( Map.Entry<Thing,IndexRange> o1, Map.Entry<Thing,IndexRange> o2 )
          {
              return (o1.getValue()).compareTo(o2.getValue());
          }
      } );
      return list.get(n-1).getValue();*/
      //low to high
      
      //go through findThingCombos each one, and check if parents.contains(a)
      //add those things to another list
      //sort it based on distance
      //and return the right index
    }
    return x;
  }
}
