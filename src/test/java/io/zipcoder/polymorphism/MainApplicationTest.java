package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testMe(){}

@Test
    public void fishTest(){
    //given

    Pet fish = new Fish("Hiep");

    //when

    String actual = fish.speak();
    String expected = "Gloopity gloop gloop";

    //then

    Assert.assertEquals(expected, actual);
}

@Test
    public void getNameFish(){
    //given
    Pet fish = new Fish("Phi");

    //when
    String expected = "Phi";
    String actual = fish.getName();

    //then

    Assert.assertEquals(expected, actual);
}

@Test
    public void setFishName(){
    //given
    Pet fish = new Fish("Tony");

    //when
    fish.setName("Balogna");
    String expected = "Balogna";

    Assert.assertEquals(expected, fish.getName());
}


    @Test
    public void catTest(){
        //given

        Pet cat = new Cat("Adam");

        //when

        String actual = cat.speak();
        String expected = "Meow";

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameCat(){
        //given
        Pet cat = new Cat("ThyThy");

        //when
        String expected = "ThyThy";
        String actual = cat.getName();

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCatName(){
        //given
        Pet cat = new Cat("Duke");

        //when
        cat.setName("Dukus");
        String expected = "Dukus";

        Assert.assertEquals(expected, cat.getName());
    }


    @Test
    public void dogTest(){
        //given

        Pet dog = new Dog("Abby");

        //when

        String actual = dog.speak();
        String expected = "Woof!";

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameDog(){
        //given
        Pet dog = new Dog("Lan");

        //when
        String expected = "Lan";
        String actual = dog.getName();

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDogName(){
        //given
        Pet dog = new Dog("John");

        //when
        dog.setName("Tiger");
        String expected = "Tiger";

        Assert.assertEquals(expected, dog.getName());
    }

}
