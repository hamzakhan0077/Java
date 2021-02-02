package com.Dgb;

public class Name {



    String title;
    String forename;
    String surname;







    public void setTitle(String s){
        title = s;
    }



    public void setForename(String s){
        forename = s;


    }

    public void setSurname(String s){
        surname = s;


    }

    public String getTitle(){
        return title;

    }
    public String getForename(){
        return forename;

    }

    public String getSurname(){
        return surname;

    }
    public String getFullName(){
        return title +" "+ forename + " "+ surname;
    }


    public String getShortName(){
        String x = getForename();
       String mid_name = x.;
    }






}
