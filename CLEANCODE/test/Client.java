package test;
import src.*;

public class Client{
    public static void main(String[] args){
        try{
            Interest obj1=new Interest();
            System.out.println(obj1.calculateSimpleInterest(200,2,4));
            System.out.println(obj1.calculateCompoundInterest(200,2,4));
            House obj2=new House();
            System.out.println(obj2.estimateConstructionCost("standard",200,true));
            System.out.println(obj2.estimateConstructionCost("standard",200,false));
            System.out.println(obj2.estimateConstructionCost("above standard",200,true));
            System.out.println(obj2.estimateConstructionCost("above standard",200,false));
            System.out.println(obj2.estimateConstructionCost("high standard",200,true));
            System.out.println(obj2.estimateConstructionCost("high standard",200,false));
            System.out.println(obj2.estimateConstructionCost("below standard",200,true));
        }
        catch(Exception E){
            System.out.println(E.getMessage());
        }
    }
}