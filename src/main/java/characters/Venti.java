package main.java.characters;

public class Venti extends Character {

    public Venti() {
        setName("Venti");
        setStars(5);
        setVision("Anemo");
        setWeapon("Bow");
        setLevel(1);
        //todo setImage("Venti.png");

        setFlower(false);
        setFeather(false);
        setSands(false);
        setGoblet(false);
        setCirclet(false);

        setAttackName("Divine Marksmanship");
        setAttackDesc("""
                Normal Attack: Perform up to 6 consecutive shots with a bow.

                Charged Attack: Perform a more precise Aimed Shot with increased DMG. While aiming, favorable winds will accumulate on the arrowhead. A fully charged wind arrow will deal Anemo DMG.

                Plunging Attack:  Fires off a shower of arrows in mid-air before falling and striking the ground, dealing AoE DMG upon impact.""");
        setSkillName("Skyward Sonnet");
        setSkillDesc("""
                Press: Summons a Wind Domain at the opponent's location, dealing AoE Anemo DMG and launching opponents into the air.
                Hold: Summons an even larger Wind Domain with Venti as the epicenter, dealing AoE Anemo DMG and launching affected opponents into the air. After unleashing the Hold version of this ability, Venti rides the wind into the air.
                Opponents hit by Skyward Sonnet will fall to the ground slowly.""");
        setBurstName("Wind's Grand Ode");
        setBurstDesc("""
                Fires off an arrow made of countless coalesced winds, creating a huge Stormeye that sucks in objects and opponents and deals continuous Anemo DMG.
                Elemental Absorption: If the Stormeye comes into contact with Hydro/Pyro/Cryo/Electro elements, it will deal additional elemental DMG of that type.
                Elemental Absorption may only occur once per use.""");

        setPassive00Name("Windrider");
        setPassive00Desc("Decreases gliding Stamina consumption for your own party members by 20%.\n" +
                "Not stackable with Passive Talents that provide the exact same effects.");
        setPassive20Name("Embrace of Winds");
        setPassive20Desc("Holding Skyward Sonnet creates an upcurrent that lasts for 20s.");
        setPassive60Name("Stormeye");
        setPassive60Desc("Regenerates 15 Energy for Venti after the effects of Wind's Grand Ode end. If an Elemental Absorption occurred, this also restores 15 Energy to all characters of that corresponding element.");

        setNotes("");
    }
}
