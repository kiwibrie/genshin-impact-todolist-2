package main.java.characters;

public class Keqing extends Character {

    public Keqing(){
        super("Keqing", 5, "electro", "sword", "");

        setHP(1020, 2646, 5268, 6776, 8500, 10025, 11561, 13103);
        setATK(25, 65, 130, 167, 209, 247, 285, 323);
        setDEF(62, 161, 321, 413, 519, 612, 705, 799);
        setAscensionStat("Crit DMG");

        setAscensionMaterials("Vajrada Amethyst", "Cor Lapis", "Lightning Prism", "Nectar");
        setTalentMaterials("Prosperity", "Nectar", "Ring of Boreas");

        setAttackName("Yunlai Swordsmanship");
        setAttackDesc("");
        setSkillName("Stellar Restoration");
        setSkillDesc("");
        setBurstName("Starward Sword");
        setBurstDesc("");

        setPassive00Name("Land's Overseer");
        setPassive00Desc("");
        setPassive20Name("Thundering Penance");
        setPassive20Desc("");
        setPassive60Name("Aristocratic Dignity");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
