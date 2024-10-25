package org.example;

public class conjugaison {


    public void conjuguer( String verbe){
        if (verbe.endsWith("er")){
            verbe=verbe.substring(0,verbe.length()-2);
            System.out.println("je " +verbe+"e\n"+"tu "+verbe+"es\n"+ "il " +verbe+"e\n"+"nous "
                    +verbe+"ons\n"+"vous "+verbe+"ez\n" +"ils "+verbe+"ent\n");
        }
        else {
            System.out.println( "il ne s'agit pas d'un verbe de 1er groupe , veuillez ressayer");
        }
    }

}
