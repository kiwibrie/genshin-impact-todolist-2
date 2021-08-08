package main.java;

import main.java.characters.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterToDoList {
    public List<Character> todolist;

    public CharacterToDoList(){
        todolist = new ArrayList<>();
    }

    public void addCharacter(Character e){
        if(!todolist.contains(e)){
            todolist.add(e);
        }
    }

    public void deleteCharacter(Character e){
        todolist.remove(e);
    }

    public void insertPriority(Character who, int where){
        deleteCharacter(who);
        if(!todolist.contains(who)){
            todolist.add(where, who);
        }
    }

}
