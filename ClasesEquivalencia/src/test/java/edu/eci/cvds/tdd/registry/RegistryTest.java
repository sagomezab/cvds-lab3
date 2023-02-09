package edu.eci.cvds.tdd.registry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
    Person person = new Person("Ivan", 7225, 35, Gender.MALE, true);
    RegisterResult result = registry.registerVoter(person);
    Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void shouldNotBeValidForAge(){
        Gender male = Gender.MALE;
        Person p1 = new Person("David", 1234, 17, male, true);
        RegisterResult result = registry.registerVoter(p1);
        assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void shouldNotBeValidForDeath(){
        Gender female = Gender.FEMALE;
        Person p1 = new Person("Juliana", 1678, 19, female, false);
        RegisterResult result = registry.registerVoter(p1);
        assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void shouldNotBeValidForDuplicate(){
        Gender female = Gender.FEMALE;
        Person p1 = new Person("Juliana", 666, 19, female, true);
        Person p2 = new Person("Carolina", 666, 25, female, true);
        RegisterResult result1 = registry.registerVoter(p1);
        RegisterResult result2 = registry.registerVoter(p2);
        assertEquals(RegisterResult.DUPLICATE, result2);
    }

    @Test
    public void shouldNotBeValidForInvalidAge(){
        Gender male = Gender.MALE;
        Person p1 = new Person("Carlos",4667, -10, male, true);
        RegisterResult result1 = registry.registerVoter(p1);
        assertEquals(RegisterResult.INVALID_AGE, result1);
    }
// TODO Complete with more test cases
}