package main.java;

public class PrimogemCalculator {
    int fates;
    int primos;
    int wishes;
    int pastwishes;

    public PrimogemCalculator(){
        setFates(0);
        setPrimos(0);
        setWishes(0);
        setPastWishes(0);
    }

    public int getFates() {
        return fates;
    }

    public void setFates(int fates) {
        if(fates >= 0){
            this.fates = fates;
        }
    }

    public int getPrimos() {
        return primos;
    }

    public void setPrimos(int primos) {
        if(primos >= 0){
            this.primos = primos;
        }
    }

    public int getWishes() {
        return wishes;
    }

    public void setWishes(int wishes) {
        if(wishes >= 0){
            this.wishes = wishes;
        }
    }

    public int getPastWishes(){
        return pastwishes;
    }

    public void setPastWishes(int num){
        if(num >= 0){
            pastwishes = num;
        }
    }

    public void calcWishes(int fates, int primos){
        setWishes(fates + (primos / 160));
    }

    public void clearCalculations(){
        setFates(0);
        setPrimos(0);
        setWishes(0);
        setPastWishes(0);
    }

    public boolean willHitCharacterPity(){
        return (getWishes() + getPastWishes()) >= 90;
    }

    public boolean willHitWeaponPity(){
        return (getWishes() + getPastWishes()) >= 80;
    }
}
