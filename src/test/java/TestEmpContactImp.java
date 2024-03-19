import com.study.crud.EmpContactImp;
import com.study.entity.Employer;
import com.study.entity.EmployerContacts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.study.utils.Utils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmpContactImp {

    EmpContactImp dao;

     EmployerContacts contact;

     public TestEmpContactImp(){
         contact = new EmployerContacts(getRandomPhones(),getRandomAddress(),
                 getRandomEmails());
     }


    @BeforeEach
   public void inIt(){
        dao = new EmpContactImp();
    }

    @Test
    void testIfContactIsAdd() {
        EmployerContacts contacts = new EmployerContacts();
        contacts.setMobPhone("Some phone");
        contacts.setEmpEmail("some email");
        dao.addContact(contacts);
        EmployerContacts some = dao.getById(contacts.getId());
        assertEquals(contacts.getMobPhone(), some.getMobPhone());
        assertEquals(contacts.getEmpEmail(), some.getEmpEmail());
    }

    @Test
    void testIfEmpContactReturnByIdOk() {
        dao.addContact(contact);
        EmployerContacts find = dao.getById(contact.getId());
        assertEquals(contact.getMobPhone(), find.getMobPhone());
    }
}
