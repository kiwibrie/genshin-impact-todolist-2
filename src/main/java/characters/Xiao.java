package main.java.characters;

public class Xiao extends Character {

    public Xiao() {
        super("Xiao", 5, "anemo", "polearm", "");

        setHP(991, 2572, 5120, 6586, 8262, 9744, 11236, 12736);
        setATK(27, 71, 141, 181, 227, 267, 308, 349);
        setDEF(62, 161, 321, 413, 519, 612, 705, 799);
        setAscensionStat("Crit Rate");

        setAscensionMaterials("Vayuda Turquoise", "Qingxin", "Juvenile Jade", "Slime");
        setTalentMaterials("Prosperity", "Slime", "Shadow of the Warrior");

        setAttackName("Whirlwind Thrust");
        setAttackDesc("");
        setSkillName("Lemniscatic Wind Cycling");
        setSkillDesc("");
        setBurstName("Bane of All Evil");
        setBurstDesc("");

        setPassive00Name("Transcension: Gravity Defier");
        setPassive00Desc("");
        setPassive20Name("Conqueror of Evil: Tamer of Demons");
        setPassive20Desc("");
        setPassive60Name("Dissolution Eon: Heaven Fall");
        setPassive60Desc("");

        setNotes("");
    }
    //todo descriptions
}
