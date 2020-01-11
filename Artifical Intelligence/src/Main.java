import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    
    
    
    ArrayList<Thing> things = new ArrayList<>();
    Thing verb = new Thing("verb");
     Thing noun = new Thing("noun");
     Thing kobe = new Thing("!~Kobe");
     Thing has = new Thing("!~has");
     things.add(noun);
     things.add(verb);
     CauseEffect c = new CauseEffect(things,null,true,0,0,1);
     Subset a = new Subset(kobe,noun,null,0.1,false);
     Subset b = new Subset(has, verb, null, 0.1, false);
     Data x = new Data("Kobe has gotten himself into trouble again.");
     Data y = new Data("has Kobe gotten himself into trouble again?");

     System.out.println(x.indexOf(verb,1));
     c.updateRatio(x);
     c.updateRatio(y);

     System.out.println(c.getRatio());
      //Testing subset logic EVERYTHING SEEMS GUCCI
     
    
    
    //Testing duplicates and indexOF
    /*Thing t = new Thing("!~Kobe");
    System.out.println(t);
   // System.out.println(t.getParents());
    Thing p = new Thing("noun");
    Thing l = new Thing("!~Kobe");
    System.out.println(l);;
    Thing b = new Thing("!~Kobe");


    Subset a = new Subset(t, p,null, 0.1, false);
    Data x = new Data("Kobe Kobe");
    System.out.println(x.findThingCombos());
    System.out.println(x.indexOf(p,2));*/
    
    
    /*Data x = new Data("Kobe Bryant is cool! Kobe Bryant is cool! Kobe Bryant is cool! Kobe Bryant is cool!Kobe Bryant is cool!Kobe Bryant is cool!Kobe Bryant is cool!");
    System.out.println(x.findThingCombos()); /*
    
    
    /* Testing subset inheritance
     Thing a = new Thing("Kobe");
    Thing b = new Thing("Bryant");
    Thing c = new Thing("Cats");
    Pattern y = new Subset(b,c,null, 3.0, false);
    Pattern x = new Subset(a,b,null,4.0, false);
    System.out.println(Variables.getSubsetPatterns());
    */

  }
  
  
  
  
}
