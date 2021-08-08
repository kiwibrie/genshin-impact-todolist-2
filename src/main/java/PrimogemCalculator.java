package main.java;

public class PrimogemCalculator {
    int fates = 0;
    int primos = 0;
    int wishes = 0;
    int pastwishes = 0;

    public int getFates() {
        return fates;
    }

    public void setFates(int fates) {
        this.fates = fates;
    }

    public int getPrimos() {
        return primos;
    }

    public void setPrimos(int primos) {
        this.primos = primos;
    }

    public int getWishes() {
        return wishes;
    }

    public void setWishes(int wishes) {
        this.wishes = wishes;
    }

    public int getPastWishes(){
        return pastwishes;
    }

    public void setPastWishes(int num){
        pastwishes = num;
    }

    public void calcWishes(int fates, int primos){
        setWishes(fates + (primos / 160));
    }

    public void clearCalculations(){
        setFates(0);
        setPrimos(0);
        setWishes(0);
    }

    public boolean willHitCharacterPity(){
        return (getWishes() + getPastWishes()) >= 90;
    }

    public boolean willHitWeaponPity(){
        return (getWishes() + getPastWishes()) >= 80;
    }
}
