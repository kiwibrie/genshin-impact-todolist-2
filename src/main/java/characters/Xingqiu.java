package main.java.characters;

public class Xingqiu extends Character {

    public Xingqiu(){
        super("Xingqiu", 4, "hydro", "sword", "");

        setHP(857, 2202, 4257, 5420, 6735, 7897, 9060, 10223);
        setATK(17, 43, 84, 107, 133, 156, 179, 202);
        setDEF(64, 163, 316, 402, 499, 585, 671, 758);
        setAscensionStat("ATK");

        setAscensionMaterials("", "Silk Flower", "", "");
        setTalentMaterials("", "", "");

        setAttackName("Guhua Style");
        setAttackDesc("");
        setSkillName("Guhua Sword: Fatal Rainscreen");
        setSkillDesc("");
        setBurstName("Guhua Sword: Raincutter");
        setBurstDesc("");

        setPassive00Name("Flash of Genius");
        setPassive00Desc("");
        setPassive20Name("Hydropathic");
        setPassive20Desc("");
        setPassive60Name("Blades Amidst Raindrops");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions, materials
}
