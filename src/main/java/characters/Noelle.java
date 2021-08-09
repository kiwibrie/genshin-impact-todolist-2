package main.java.characters;

public class Noelle extends Character {

    public Noelle(){
        super("Noelle", 4, "geo", "claymore", "");

        setHP(1012, 2600, 5027, 6400, 7953, 9325, 10698, 12071);
        setATK(16, 41, 80, 101, 126, 148, 169, 191);
        setDEF(67, 172, 333, 423, 526, 617, 708, 799);
        setAscensionStat("DEF");

        setAscensionMaterials("Prithiva Topaz", "Valberry", "Basalt Pillar", "Mask");
        setTalentMaterials("Resistance", "Mask", "Dvalin's Claw");

        setAttackName("Favonius Bladework - Maid");
        setAttackDesc("");
        setSkillName("Breastplate");
        setSkillDesc("");
        setBurstName("Sweeping Time");
        setBurstDesc("");

        setPassive00Name("Maid's Knighthood");
        setPassive00Desc("");
        setPassive20Name("Devotion");
        setPassive20Desc("");
        setPassive60Name("Nice and Clean");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
