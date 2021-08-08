package test.java;

import main.java.CharacterToDoList;
import main.java.characters.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterToDoListTest {

    @Test
     void addCharacter() {
        CharacterToDoList list = new CharacterToDoList();
        Venti e = new Venti();
        list.addCharacter(e);
        assertEquals("Venti", list.todolist.get(0).getName());
    }

    @Test
    void deleteCharacter() {
        CharacterToDoList list = new CharacterToDoList();
        Venti venti = new Venti();
        Zhongli zhongli = new Zhongli();
        list.addCharacter(venti);
        list.addCharacter(zhongli);

        list.deleteCharacter(venti);
        assertEquals("Zhongli", list.todolist.get(0).getName());
    }

    @Test
    void insertPriority() {
        CharacterToDoList list = new CharacterToDoList();
        list.addCharacter(new Venti());
        list.addCharacter(new Zhongli());
        Jean e = new Jean();
        list.addCharacter(e);
        assertEquals("Venti", list.todolist.get(0).getName());

        list.insertPriority(e, 0);
        assertEquals("Jean", list.todolist.get(0).getName());
        assertEquals("Venti", list.todolist.get(1).getName());
        assertEquals("Zhongli", list.todolist.get(2).getName());
    }
}