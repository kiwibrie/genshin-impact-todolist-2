package test.java;

import main.java.PrimogemCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimogemCalculatorTest {

    @Test
    void getFates() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setFates(90);
        assertEquals(90, pc.getFates());
    }

    @Test
    void setFates() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setFates(90);
        assertEquals(90, pc.getFates());

        pc.setFates(-100);
        assertNotEquals(-100, pc.getFates());
    }

    @Test
    void getPrimos() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setPrimos(90);
        assertEquals(90, pc.getPrimos());
    }

    @Test
    void setPrimos() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setPrimos(90);
        assertEquals(90, pc.getPrimos());

        pc.setPrimos(-100);
        assertNotEquals(-100, pc.getPrimos());
    }

    @Test
    void getWishes() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setWishes(90);
        assertEquals(90, pc.getWishes());
    }

    @Test
    void setWishes() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setWishes(90);
        assertEquals(90, pc.getWishes());

        pc.setWishes(-100);
        assertNotEquals(-100, pc.getWishes());
    }

    @Test
    void getPastWishes() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setPastWishes(90);
        assertEquals(90, pc.getPastWishes());
    }

    @Test
    void setPastWishes() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setPastWishes(90);
        assertEquals(90, pc.getPastWishes());

        pc.setPastWishes(-100);
        assertNotEquals(-100, pc.getPastWishes());
    }

    @Test
    void calcWishes() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setFates(10);
        pc.setPrimos(1600);
        pc.calcWishes(pc.getFates(), pc.getPrimos());

        assertEquals(20, pc.getWishes());
    }

    @Test
    void clearCalculations() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setPrimos(90);
        pc.setPastWishes(90);
        pc.setFates(90);
        pc.setWishes(90);
        assertEquals(90, pc.getPrimos());

        pc.clearCalculations();
        assertEquals(0, pc.getPrimos());
    }

    @Test
    void willHitCharacterPity() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setWishes(45);
        pc.setPastWishes(45);
        assertTrue(pc.willHitCharacterPity());
    }

    @Test
    void willHitWeaponPity() {
        PrimogemCalculator pc = new PrimogemCalculator();
        pc.setWishes(40);
        pc.setPastWishes(40);
        assertTrue(pc.willHitWeaponPity());
    }
}