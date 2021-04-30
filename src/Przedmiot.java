import java.util.ArrayList;

public class Przedmiot {
    private String przedmiot;
    private Integer liczbaGodzin = 0;
    private Integer liczbaTematow = 0;
    //private ArrayList<Integer, Zajecia>() listaTematow = new ArrayList<Integer, Zajecia>(); // lub HASH MAP

    Przedmiot(String nazwa, Integer liczbaGodzin){
        this.przedmiot = nazwa;
        this.liczbaGodzin = liczbaGodzin;
    }
    private void dodajTemat(){
    //this.listaTematow.add(zaj);
    }
    private void zmienTemat(){

    }
    private void usunTemat(){

    }
    public void pobierzTemat(){

    }
    public void listujTemat(){
        //for (Zajecia zaj : listaTematow){

        //}
    }
    public int liczbaTematow(){
        return liczbaTematow;
    }
    public int liczbaGodzin(){
        return liczbaGodzin;
    }
    public int liczbaPozostalo(){
        Integer liczbaGodzTematow = 0; // zajęcia => liczba godzin();
        return liczbaGodzin - liczbaGodzTematow;
    }
}
