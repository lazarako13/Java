package com.helloworld;

public class Player {
    // Attributs
    int number;
    String name;
    String team;
    String position;

    // Constructor
    Player( int number, String name, String team, String position){
        this.number=number;
        this.name=name;
        this.position=position;
        this.team=team;
    }
    Player( int number, String name,String position){
        this.number=number;
        this.name=name;
        this.position=position;
        this.team="Pas de team";
    }
    // Methods
    void showInfo(){
        System.out.println(name+", "+position+ " plays in "+team+" as number "+number);
    }
    void dribbling(){
        System.out.println(name+" is dribbling");
    }

    public static void main(String[] args) {
        Player rakoto=new Player(8,"Rakoto", "Barea","attaquant");
        Player rabe=new Player(10,"Rabe","Guardien");
        rakoto.dribbling();
        rabe.showInfo();

    }
}
