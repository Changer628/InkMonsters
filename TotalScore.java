package com.shelfspace.michael.inkmonsters;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Michael on 22/03/2018.
 */

public class TotalScore {
    private int baseValue;
    private int bonusValue;

    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }

    public int getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(int bonusValue) {
        this.bonusValue = bonusValue;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public int getClothes() {
        return clothes;
    }

    public void setClothes(int clothes) {
        this.clothes = clothes;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getHair() {
        return hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    public int getHorns() {
        return horns;
    }

    public void setHorns(int horns) {
        this.horns = horns;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getGrey() {
        return grey;
    }

    public void setGrey(int grey) {
        this.grey = grey;
    }

    public void setInkSpill(int inkSpill) {
        this.inkSpill = inkSpill;
    }

    public int getPink() {
        return pink;
    }

    public void setPink(int pink) {
        this.pink = pink;
    }

    public int getPurple() {
        return purple;
    }

    public void setPurple(int purple) {
        this.purple = purple;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    private int arms, clothes, eyes, hair, horns, spots, teeth;
    private int blue, green, grey, inkSpill, pink, purple, red, yellow;
    private ArrayList<String> name = new ArrayList<String>();

    public TotalScore(){
        super();
        baseValue = 0;
        arms = 0;
        clothes = 0;
        eyes = 0;
        hair = 0;
        horns = 0;
        spots = 0;
        teeth = 0;
        blue = 0;
        green = 0;
        grey = 0;
        inkSpill = 0;
        pink = 0;
        purple = 0;
        red = 0;
        yellow = 0;
    }

    public boolean checkName(String name){
        if(this.name.contains(name)){
            return true;
        }else{
            return false;
        }
    }

    public int getTotalScore(){
        //Log.d("ability", "Basevalue = " + this.baseValue);
        //Log.d("ability", "Inkspill subtract = " + (this.inkSpill*this.inkSpill));
        int abilityTotal = abilityScore();
        int totalScore = this.baseValue - (this.inkSpill*this.inkSpill) + abilityTotal;

        //Log.d("ability", "TotalAbilityValue = " + abilityTotal);
        return totalScore;
    }

    public void addBaseValue(int baseValue){
        this.baseValue += baseValue;
    }

    public void subBaseValue(int baseValue){
        this.baseValue -= baseValue;
    }

    public void addArms(int arms){
        this.arms += arms;
    }

    public void subArms(int arms){
        this.arms -= arms;
    }

    public void addClothes(int clothes){
        this.clothes += clothes;
    }

    public void subClothes(int clothes){
        this.clothes -= clothes;
    }

    public void addEyes(int eyes){
        this.eyes += eyes;
    }

    public void subEyes(int eyes){
        this.eyes -= eyes;
    }

    public void addHair(int hair){
        this.hair += hair;
    }

    public void subHair(int hair){
        this.hair -= hair;
    }

    public void addHorns(int horns){
        this.horns += horns;
    }

    public void subHorns(int horns){
        this.horns -= horns;
    }

    public void addSpots(int spots){
        this.spots += spots;
    }

    public void subSpots(int spots){
        this.spots -= spots;
    }

    public void addTeeth(int teeth){
        this.teeth += teeth;
    }

    public void subTeeth(int teeth){
        this.teeth -= teeth;
    }

    public void addBlue(int blue){
        this.blue += blue;
    }

    public void subBlue(int blue){
        this.blue -= blue;
    }

    public void addGreen(int green){
        this.green += green;
    }

    public void subGreen(int green){
        this.green -= green;
    }

    public void addGrey(int grey){
        this.grey += grey;
    }

    public void subGrey(int grey){
        this.grey -= grey;
    }

    public void addInkSpill(int inkSpill){
        this.inkSpill += inkSpill;
    }

    public void subInkSpill(int inkSpill){
        this.inkSpill -= inkSpill;
    }

    public void addPink(int pink){
        this.pink += pink;
    }

    public void subPink(int pink){
        this.pink -= pink;
    }

    public void addPurple(int purple){
        this.purple += purple;
    }

    public void subPurple(int purple){
        this.purple -= purple;
    }

    public void addRed(int red){
        this.red += red;
    }

    public void subRed(int red){
        this.red -= red;
    }

    public void addYellow(int yellow){
        this.yellow += yellow;
    }

    public void subYellow(int yellow){
        this.yellow -= yellow;
    }

    public int getInkSpill(){
        return this.inkSpill;
    }

    public void addName(String name){
        this.name.add(name);
    }

    public void subName(String name){
        this.name.remove(name);
    }

    public int getBaseValue(){
        return this.baseValue;
    }

    public void addColour(String colour){
        if (colour.equals("all")){
            this.blue += 1;
            this.green += 1;
            this.grey += 1;
            this.pink += 1;
            this.purple += 1;
            this.red += 1;
            this.yellow += 1;
        }
        if (colour.equals("blue")){
            this.blue += 1;
        }
        if (colour.equals("green")){
            this.green += 1;
        }
        if (colour.equals("grey")){
            this.grey += 1;
        }
        if (colour.equals("pink")){
            this.pink += 1;
        }
        if (colour.equals("purple")){
            this.purple += 1;
        }
        if (colour.equals("red")){
            this.red += 1;
        }
        if (colour.equals("yellow")){
            this.yellow += 1;
        }
        if (colour.equals("ink spill")){
            this.inkSpill += 1;
        }
    }

    public void subColour(String colour){
        if (colour.equals("all")){
            this.blue -= 1;
            this.green -= 1;
            this.grey -= 1;
            this.pink -= 1;
            this.purple -= 1;
            this.red -= 1;
            this.yellow -= 1;
        }
        if (colour.equals("blue")){
            this.blue -= 1;
        }
        if (colour.equals("green")){
            this.green -= 1;
        }
        if (colour.equals("grey")){
            this.grey -= 1;
        }
        if (colour.equals("pink")){
            this.pink -= 1;
        }
        if (colour.equals("purple")){
            this.purple -= 1;
        }
        if (colour.equals("red")){
            this.red -= 1;
        }
        if (colour.equals("yellow")){
            this.yellow -= 1;
        }
        if (colour.equals("ink spill")){
            this.inkSpill -= 1;
        }
    }

    public void addAttributes(String[] attributes){
        for (int i = 0; i < attributes.length; i++){
            if (attributes[i].equals("arms")){
                this.arms += 1;
            }else if (attributes[i].equals("clothes")){
                this.clothes += 1;
            }else if (attributes[i].equals("eyes")){
                this.eyes += 1;
            }else if (attributes[i].equals("hair")){
                this.hair += 1;
            }else if (attributes[i].equals("horns")){
                this.horns += 1;
            }else if (attributes[i].equals("spots")){
                this.spots += 1;
            }else if (attributes[i].equals("teeth")){
                this.teeth += 1;
            }
        }
    }

    public void subAttributes(String[] attributes){
        for (int i = 0; i < attributes.length; i++){
            if (attributes[i].equals("arms")){
                this.arms -= 1;
            }else if (attributes[i].equals("clothes")){
                this.clothes -= 1;
            }else if (attributes[i].equals("eyes")){
                this.eyes -= 1;
            }else if (attributes[i].equals("hair")){
                this.hair -= 1;
            }else if (attributes[i].equals("horns")){
                this.horns -= 1;
            }else if (attributes[i].equals("spots")){
                this.spots -= 1;
            }else if (attributes[i].equals("teeth")){
                this.teeth -= 1;
            }
        }
    }

    public int abilityScore(){
        this.bonusValue = 0;
        for(int i = 0; i < this.name.size(); i++){
            if (name.get(i).equals("Aaron and Gabriel")){
                abilityAaronAndGabriel();
            }
            else if (name.get(i).equals("Agnes Skinner")){
                abilityAgnesSkinner();
            }
            else if (name.get(i).equals("Allistair Cookie")){
                abilityAllistairCookie();
            }
            else if (name.get(i).equals("Bronson Stone")){
                abilityBronsonStone();
            }
            else if (name.get(i).equals("Broox")){
                abilityBroox();
            }
            else if (name.get(i).equals("Cary Granite")){
                abilityCaryGranite();
            }
            else if (name.get(i).equals("Cramual Craiden")){
                abilityCramuelCraiden();
            }
            else if (name.get(i).equals("Daryl Andrews")){
                abilityDarylAndrews();
            }
            else if (name.get(i).equals("Erica Hayes")){
                abilityEricaHayes();
            }
            else if (name.get(i).equals("Gunnar Si")){
                abilityGunnarSi();
            }
            else if (name.get(i).equals("Jane Stella")){
                abilityJaneStella();
            }
            else if (name.get(i).equals("Jessica Mei")){
                abilityJessicaMei();
            }
            else if (name.get(i).equals("Lisa Maggie")){
                abilityLisaMaggie();
            }
            else if (name.get(i).equals("Natasha Avenue")){
                abilityNatashaAvenue();
            }
            else if (name.get(i).equals("Pea Buddy")){
                abilityPeaBuddy();
            }
            else if (name.get(i).equals("Phreddy Poole")){
                abilityPhreddyPoole();
            }
            else if (name.get(i).equals("Shauna OHara")){
                abilityShaunaOHara();
            }
            else if (name.get(i).equals("Telly Drive")){
                abilityTellyDrive();
            }
            else if (name.get(i).equals("Toshisa Sadakats")){
                abilityToshiSadakats();
            }
        }
        if (name.contains("Barney Avalahe") || name.contains("Nataly Lazie")){
            if (name.contains("Nataly Lazie")){
                abilityNatalyLazie();
            }else{
                abilityBarneyAvalahe();
            }
        }
        return bonusValue;
    }

    public void abilityAaronAndGabriel(){
        this.bonusValue += this.blue/2 + this.grey/2 + this.pink/2 + this.green/2 +
                this.purple/2 + this.red/2 + this.yellow/2;
        //Log.d("ability", "aaron and gabriel = " + this.blue/2 + this.grey/2 + this.pink/2 + this.green/2 +
                //this.purple/2 + this.red/2 + this.yellow/2);
    }

    public void abilityAgnesSkinner(){
        this.bonusValue += this.pink + this.purple;
        //Log.d("ability", "agnes skinner = " + this.pink + this.purple);
    }

    public void abilityAllistairCookie(){
        this.bonusValue += this.eyes;
        //Log.d("ability", "abilityAllistairCookie = " + this.eyes);
    }

    public void abilityBarneyAvalahe(){
        this.bonusValue += (this.getInkSpill() * this.getInkSpill()) + (this.getInkSpill() * 2);
        //Log.d("ability", "abilityBarneyAvalahe = " + (this.getInkSpill() * this.getInkSpill()) + (this.getInkSpill() * 2));
    }

    public void abilityBronsonStone(){
        if (this.blue > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
        if (this.green > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
        if (this.grey > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
        if (this.pink > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
        if (this.purple > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
        if (this.red > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
        if (this.yellow > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityBronsonStone = 1");
        }
    }

    public void abilityBroox(){
        this.bonusValue += this.eyes;
        //Log.d("ability", "abilityBroox = " + this.eyes);
    }

    public void abilityCramuelCraiden(){
        this.bonusValue += this.teeth;
        //Log.d("ability", "abilityCramuelCraiden = " + this.teeth);

    }

    public void abilityCaryGranite(){
        this.bonusValue -= this.hair;
        //Log.d("ability", "abilityCaryGranite = " + this.hair);
    }

    public void abilityDarylAndrews(){
        for(int i = 0; i < this.name.size(); i++){
            if (name.get(i).equals("Erica Hayes")){
                this.bonusValue += 3;
                //Log.d("ability", "abilityDarylAndrews = " + "3");
            }
        }
    }

    public void abilityEricaHayes(){
        for(int i = 0; i < this.name.size(); i++){
            if (name.get(i).equals("Daryl Andrews")){
                this.bonusValue += 3;
                //Log.d("ability", "abilityEricaHayes = " + "3");
            }
        }
    }

    public void abilityGunnarSi(){
        this.bonusValue += this.hair;
        //Log.d("ability", "abilityGunnarSi = " + this.hair);
    }

    public void abilityJaneStella(){
        this.bonusValue -= this.spots;
        //Log.d("ability", "abilityJaneStella = " + this.spots);
    }

    public void abilityJessicaMei(){
        this.bonusValue += this.pink + this.blue;
        //Log.d("ability", "abilityJessicaMei = " + this.pink + this.blue);
    }

    public void abilityLisaMaggie(){
        if (this.blue > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
        if (this.green > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
        if (this.grey > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
        if (this.pink > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
        if (this.purple > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
        if (this.red > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
        if (this.yellow > 0){
            this.bonusValue += 1;
            //Log.d("ability", "abilityLisaMaggie = 1");
        }
    }

    public void abilityNatalyLazie(){
        this.bonusValue += (this.getInkSpill() * this.getInkSpill()) + (this.getInkSpill() * 3);
        //Log.d("ability", "abilityNatalyLazie = " + (this.getInkSpill() * this.getInkSpill()) + (this.getInkSpill() * 3));
    }

    public void abilityPhreddyPoole(){
        if (this.blue > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
        if (this.green > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
        if (this.grey > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
        if (this.pink > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
        if (this.purple > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
        if (this.red > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
        if (this.yellow > 0){
            this.bonusValue -= 1;
            //Log.d("ability", "abilityPhreddyPoole = -1");
        }
    }

    public void abilityToshiSadakats(){
        this.bonusValue += this.horns;
        //Log.d("ability", "abilityToshiSadakats = " + this.horns);
    }

    public void abilityNatashaAvenue(){
        this.bonusValue -= this.grey;
        //Log.d("ability", "abilityNatashaAvenue = " + this.grey);
    }

    public void abilityPeaBuddy(){
        this.bonusValue += this.arms;
        //Log.d("ability", "abilityPeaBuddy = " + this.arms);
    }

    public void abilityShaunaOHara(){
        this.bonusValue += this.arms;
        //Log.d("ability", "abilityShaunaOHara = " + this.arms);
    }

    public void abilityTellyDrive(){
        this.bonusValue += this.clothes;
        //Log.d("ability", "abilityTellyDrive = " + this.clothes);
    }

}
