package com.test;
/**
 * 面向对象的三大特性：
 * 封装性
 * 继承性
 * 多态性
 *
 *
 *
 * **/
public class Main {

    public static void main(String[] args) {

        String number = "13843838438";
        Card card = new Card(number);
        Phone phone = new Phone(card);
        PersonUsePhone personUsePhone = new PersonUsePhone(phone);
        personUsePhone.callPhone();







        //Zoo zoo = new Zoo();
        //Dog erHa = new ErHa();
//        zoo.giveFoodForDog(erHa);
//        Dog taiDi = new TaiDi();
//        zoo.giveFoodForDog(taiDi);

        //EastPerson ep = new EastPerson();
        //ep.eat();
        //WestPerson westPerson = new WestPerson("song",'n',19);
        //westPerson.eat();

        //Person person = new WestPerson();
        //person.eat();
        //Person person1 = new EastPerson();
        //person1.eat();

    }

    {

    }
}
