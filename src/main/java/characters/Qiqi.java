package main.java.characters;

public class Qiqi extends Character {

    public Qiqi(){
        super("Qiqi", 5, "cryo", "sword", "");

        setHP(963, 2498, 4973, 6396, 8023, 9463, 10912, 12368);
        setATK(22, 58, 115, 148, 186, 220, 253, 287);
        setDEF(72, 186, 371, 477, 598, 706, 814, 922);
        setAscensionStat("Healing Bonus");

        setAscensionMaterials("Shivada Jade", "Violetgrass", "Hoarfrost Core", "Scroll");
        setTalentMaterials("Prosperity", "Scroll", "Tail of Boreas");

        setAttackName("Ancient Sword Art");
        setAttackDesc("");
        setSkillName("Adeptus Art: Herald of Frost");
        setSkillDesc("");
        setBurstName("Adeptus Art: Preserver of Fortune");
        setBurstDesc("");

        setPassive00Name("Former Life Memories");
        setPassive00Desc("");
        setPassive20Name("Life-Prolonging Methods");
        setPassive20Desc("");
        setPassive60Name("A Glimpse into Arcanum");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
