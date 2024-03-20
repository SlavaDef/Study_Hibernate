import com.study.crud.EmpContactImp;
import com.study.entity.EmpContacts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.study.utils.Utils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmpContactImp {

    EmpContactImp dao;

     EmpContacts contact;

     public TestEmpContactImp(){
         contact = new EmpContacts(getRandomPhones(),getRandomAddress(),
                 getRandomEmails());
     }


    @BeforeEach
   public void inIt(){
        dao = new EmpContactImp();
    }

    @Test
    void testIfContactIsAdd() {
        EmpContacts contacts = new EmpContacts();
        contacts.setMobPhone("Some phone");
        contacts.setEmpEmail("some email");
        dao.addContact(contacts);
        EmpContacts some = dao.getById(contacts.getId());
        assertEquals(contacts.getMobPhone(), some.getMobPhone());
        assertEquals(contacts.getEmpEmail(), some.getEmpEmail());
    }

    @Test
    void testIfEmpContactReturnByIdOk() {
        dao.addContact(contact);
        EmpContacts find = dao.getById(contact.getId());
        assertEquals(contact.getMobPhone(), find.getMobPhone());
    }
}
