package javapackage1;
import java.util.HashMap;

public class Assessments {
    public static void main(String[] args) {
        HashMap<String, String> fleet;
        fleet=new HashMap<>();
        fleet.put("admiral","akbar");
        fleet.remove("akbar");  //akbar is not a key but a value
        System.out.println(fleet);
        if(fleet.isEmpty()){
            System.out.println("empty!");
        }else{
            System.out.println(fleet.toString());
        }

  //      m= new HashMap<>();

//        m.put(1,"print & remove");

        //System.out.println(m.get(1));
        //m.remove(1);

        //map=new HashMap<>();
        //map.put("food","bratwurst");
        //map.put("food","pie");
        //System.out.println(map);
       //m=new HashMap<>();
        //m.put(1,"hogwarts");
       //if(!m.isEmpty()){
         //  String s = m.get(1);
           //System.out.println(s);

       }

        //map.remove(34);
        //boolean empty = map.isEmpty();
        //if(empty){
          //  String s="hashmap is empty";
            //System.out.print(map);
        }
        //map.put(23,"vishnu");
        //map.put(91,"dennis");
        //String value = map.get(23);
        //System.out.println(value);




