package main.java;

import main.java.characters.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterToDoList {
    List<Character> todolist;

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

    public Character getCharacterByName(Character e){
        for(int i = 0; i < todolist.size(); i++){
            if(getCharacterByInt(i).getName().equals(e.getName())){
                return getCharacterByInt(i);
            }
        }
        return todolist.get(todolist.size()-1);
    }

    public Character getCharacterByInt(int i){
        return todolist.get(i);
    }
}
