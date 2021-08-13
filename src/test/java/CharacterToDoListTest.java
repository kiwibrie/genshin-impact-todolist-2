package test.java;

import main.java.CharacterToDoList;
import main.java.characters.*;
import main.java.characters.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterToDoListTest {

    @Test
    void getCharacterByInt(){
        CharacterToDoList list = new CharacterToDoList();
        Venti e = new Venti();
        list.addCharacter(e);
        assertEquals(e, list.getCharacterByInt(0));
    }

    @Test
    void getCharacterByName(){
        CharacterToDoList list = new CharacterToDoList();
        Venti e = new Venti();
        list.addCharacter(e);
        assertEquals(e, list.getCharacterByName(e));
    }

    @Test
     void addCharacter() {
        CharacterToDoList list = new CharacterToDoList();
        Venti e = new Venti();
        list.addCharacter(e);
        assertEquals("Venti", list.getCharacterByInt(0).getName());
    }

    @Test
    void deleteCharacter() {
        CharacterToDoList list = new CharacterToDoList();
        Venti venti = new Venti();
        Zhongli zhongli = new Zhongli();
        list.addCharacter(venti);
        list.addCharacter(zhongli);

        list.deleteCharacter(venti);
        assertEquals("Zhongli", list.getCharacterByInt(0).getName());
    }

    @Test
    void insertPriority() {
        CharacterToDoList list = new CharacterToDoList();
        list.addCharacter(new Venti());
        list.addCharacter(new Zhongli());
        Jean e = new Jean();
        list.addCharacter(e);
        assertEquals("Venti", list.getCharacterByInt(0).getName());

        list.insertPriority(e, 0);
        assertEquals("Jean", list.getCharacterByInt(0).getName());
        assertEquals("Venti", list.getCharacterByInt(1).getName());
        assertEquals("Zhongli", list.getCharacterByInt(2).getName());
    }
}