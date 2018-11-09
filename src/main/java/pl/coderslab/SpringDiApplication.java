package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        PhoneDao phoneDao = (PhoneDao) context.getBean("phoneDao");
//        PhoneDetailsDao phoneDetailsDao = (PhoneDetailsDao) context.getBean("phoneDetailsDao");
//        PersonDao personDao = (PersonDao) context.getBean("personDao");
//        AddressDao addressDao = (AddressDao) context.getBean("addressDao");

        //------------------------------------------------

//        Address address1 = new Address();
//        addressDao.saveAddress(address1);
//
//        Person person1 = new Person();
//        personDao.savePerson(person1);
//
//
//        List<Address> addresses = person1.getAddresses();
//        addresses.add(address1);
//        person1.setAddresses(addresses);
//        personDao.updatePerson(person1);


        //------------------------------------------------

//
//        Phone phone1 = new Phone();
//        phone1.setPerson(person1);
//
//        Phone phone2 = new Phone();
//        phone2.setPerson(person1);
//
//        phoneDao.savePhone(phone1);
//        phoneDao.savePhone(phone2);


    }
}
