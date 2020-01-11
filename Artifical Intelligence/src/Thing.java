import java.util.ArrayList;

public class Thing
{
  private String characters;
  
  public Thing(String characters)
  {
    //check String if duplicate, have another parameter, based on that parameter if it is duplicate, findAllThingCombos will change its value
    //find better solution
    this.characters = characters;
    boolean duplicate = false;
    for(int i = 0; i < Variables.getAllThings().size(); i++) {
      if(Variables.getAllThings().get(i).equals(this)) {
          duplicate = true;
          break;
      }
    }
    
    if(duplicate) {
      
    } else {
      Variables.addThing(this);
    }
  }
  
  //returns all parents of this thing
  public ArrayList<Thing> getParents()
  {
    ArrayList<Thing> x = new ArrayList<Thing>();
    for(int i = 0; i < Variables.getAllThings().size(); i++)
    {
      if(Variables.isSubset(this, Variables.getAllThings().get(i)) != -1) {
        x.add(Variables.getAllThings().get(i));
        ArrayList<Thing> y = Variables.getAllThings().get(i).getParents();
        for(int j = 0; j < y.size(); j++)
        {
          x.add(y.get(j));
        }
      }
    }
    return x;
  }
  
  public ArrayList<Thing> getChildren()
  {
    ArrayList<Thing> x = new ArrayList<Thing>();
    for(int i = 0; i < Variables.getAllThings().size(); i++)
    {
      if(Variables.isSubset(Variables.getAllThings().get(i), this) != -1)
        x.add(Variables.getAllThings().get(i));
    }
    return x;
  }
  
  public String getCharacters()
  {
    return characters;
  }
  
  //public String toString()
  //{
    //return characters;
  //}
  
  public boolean isWord()
  {
    if(characters.substring(0,2).equals("!~")) {
      return true;
    }
    return false;
  }
  
  public boolean isGroup()
  {
    return !isWord();
  }
  
  public boolean equals(Thing other)
  {
    if(this.characters.equals(other.characters)) {
      return true;
    }
    return false;
  }
  
  public static void passReference(Thing[] x)
  {
    x[0] = x[1];
  }
  
  

}
