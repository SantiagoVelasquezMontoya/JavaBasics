package org.example;


public class ValidationService {
    public Boolean isNameValid(String name){
        if(!name.matches("[aA-zZ]+")){
            return false;
        } else{
            return true;
        }
    }
}
