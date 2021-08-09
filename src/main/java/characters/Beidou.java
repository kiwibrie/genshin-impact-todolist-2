package main.java.characters;

public class Beidou extends Character {

    public Beidou(){
        super("Beidou", 4, "electro", "claymore", "");

        setHP(1094, 2811, 5435, 6919, 8597, 10081, 11565, 13050);
        setATK(19, 48, 94, 119, 148, 174, 200, 225);
        setDEF(54, 140, 270, 344, 427, 501, 575, 648);
        setAscensionStat("Electro DMG Bonus");

        setAscensionMaterials("Vajrada Amethyst", "Noctilucous Jade", "Lightning Prism", "Insignia");
        setTalentMaterials("Gold", "Insignia", "Dvalin's Sigh");

        setAttackName("Oceanborne");
        setAttackDesc("");
        setSkillName("Tidecaller");
        setSkillDesc("");
        setBurstName("Stormbreaker");
        setBurstDesc("");

        setPassive00Name("Conqueror of Tides");
        setPassive00Desc("");
        setPassive20Name("Retribution");
        setPassive20Desc("");
        setPassive60Name("Lightning Storm");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
