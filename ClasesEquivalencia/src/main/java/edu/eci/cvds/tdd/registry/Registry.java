package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    private ArrayList<Person> dataBase = new ArrayList<Person>();
    public RegisterResult registerVoter(Person p) {
        int verification = validatorVoter(p);
        switch (verification) {
            case 1:{
                return RegisterResult.VALID;
            }
            case 2:{
                return RegisterResult.UNDERAGE;
            }
            case 3:{
                return RegisterResult.INVALID_AGE;
            }
            case 4:{
                return RegisterResult.DEAD;
            }
            case 5:{
                return RegisterResult.DUPLICATE;
            }
        }
        return null;
    }
    /**
     * This method should see if the voter is valid for registration
     * @return the return will be 1 if VALID - 2 if UNDERAGE - 3 if Invalid Age - 4 if DEATH - 5 if Duplicated
     */
    public int validatorVoter(Person p){
        if(p.getAge() < 18 ){
            if(p.getAge() < 0) return 3;
            else return 2;
        }
        else if(!p.isAlive()) return 4;

        else if(!dataBase.isEmpty()){
            for(Person p1 : dataBase){
                if(p1.getId() == p.getId()){
                    return 5;
                }
            }
        }else{
            dataBase.add(p);
            return 1;
        }
        return 0;
    }
}