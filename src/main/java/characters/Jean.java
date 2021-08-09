package main.java.characters;

public class Jean extends Character {

    public Jean(){
        super("Jean", 5, "anemo", "sword", "");

        setHP(1144, 2967, 5908, 7599, 9533, 11243, 12965, 14695);
        setATK(19, 48, 96, 124, 155, 183, 211, 239);
        setDEF(60, 155, 309, 397, 499, 588, 678, 769);
        setAscensionStat("Healing Bonus");

        setAscensionMaterials("Vayuda Turquoise", "Dandelion Seed", "Hurricane Seed", "Mask");
        setTalentMaterials("Resistance", "Mask", "Dvalin's Plume");

        setAttackName("Favonius Bladework");
        setAttackDesc("");
        setSkillName("Gale Blade");
        setSkillDesc("");
        setBurstName("Dandelion Breeze");
        setBurstDesc("");

        setPassive00Name("Guiding Breeze");
        setPassive00Desc("");
        setPassive20Name("Wind Companion");
        setPassive20Desc("");
        setPassive60Name("Let the Wind Lead");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
