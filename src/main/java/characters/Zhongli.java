package main.java.characters;

public class Zhongli extends Character {

    public Zhongli(){
        super("Zhongli", 5, "geo", "polearm", "");

        setAttackName("Rain of Stone");
        setAttackDesc("""
                Normal Attack: Performs up to 6 rapid strikes.
                
                Charged Attack: Consumes a certain amount of Stamina to lunge forward, causing stone spears to fall along his path.
                
                Plunging Attack: Plunges from mid-air to strike the ground below, damaging opponents along the path and dealing AoE DMG upon impact.""");
        setSkillName("Dominus Lapidis");
        setSkillDesc("""
                Press: Commands the omnipresent power of the earth to solidify into a Stone Stele, standing 30 seconds, dealing AoE Geo DMG at the creation.
                
                Hold: Causes nearby Geo energy to explode, causing the following effects:
                If their maximum number hasn't been reached, creates a Stone Stele.
                Creates a shield of jade. The shield's DMG Absorption scales based on Zhongli's Max HP. Possesses 150% DMG Absorption against all Elemental and Physical DMG.
                Deals AoE Geo DMG.
                If there are nearby targets with the Geo element, it will drain a large amount of Geo element from a maximum of 2 such targets. This effect does not cause DMG.
                
                Stone Stele: When created, deals AoE Geo DMG. Additionally, every 2 seconds, it will resonate with other nearby Geo Constructs, dealing Geo DMG to surrounding opponents. Stele creation and Resonance generate 0.5 elemental particles.
                The Stone Stele is considered a Geo Construct that can both be climbed and used to block attacks.
                Only one Stele created by Zhongli himself may initially exist at any one time.
                
                Jade Shield: Possesses 150% DMG Absorption against all Elemental and Physical DMG.
                Characters protected by the Jade Shield will decrease the Elemental RES and Physical RES of opponents in a small AoE by 20%. This effect cannot be stacked.""");
        setBurstName("Planet Befall");
        setBurstDesc("""
                Brings a falling meteor down to earth, dealing massive Geo DMG to opponents caught in its AoE and applying the Petrification status to them.
                Petrification: Opponents affected by the Petrification status cannot move.""");

        setPassive00Name("Arcanum of Crystal");
        setPassive00Desc("Refunds 15% of the ores used when crafting Polearm-type weapons.");
        setPassive20Name("Resonant Waves");
        setPassive20Desc("""
                When the Jade Shield takes DMG, it will Fortify:
                Fortified characters have 5% increased Shield Strength.
                Can stack up to 5 times, and lasts until the Jade Shield disappears.""");
        setPassive60Name("Dominance of Earth");
        setPassive60Desc("""
                Zhongli deals bonus DMG based on his Max HP:
                Normal Attack, Charged Attack, and Plunging Attack DMG is increased by 1.39% of Max HP.
                Dominus Lapidis Stone Stele, resonance, and hold DMG is increased by 1.9% of Max HP.
                Planet Befall deals additional DMG equal to 33% of Zhongli's Max HP.""");

        setNotes("");
    }
}
