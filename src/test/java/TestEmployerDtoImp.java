import com.study.crud.EmployerDtoImp;
import com.study.entity.Employer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmployerDtoImp {

    EmployerDtoImp dtoImp;
    Employer employer1 = new Employer("Jordan", "playing", "basketball",
            new Date(System.currentTimeMillis()));

    @BeforeEach
    public void beforeEach() {
        dtoImp = new EmployerDtoImp();
    }

    @Test
    void testIfEmpIsAdd() {
        Employer employer = new Employer();
        employer.setName("Jordan");
        dtoImp.addEmployee(employer);
        Employer jordan = dtoImp.getById(employer.getId());
        assertEquals(employer.getName(), jordan.getName());

    }

    @Test
    void testIfEmpReturnIdOk() {
        dtoImp.addEmployee(employer1);
        Employer find = dtoImp.getById(1L);
        assertEquals("Jordan", find.getName());
    }

    @Test
    void testIfDeleteOk() {
        dtoImp.addEmployee(employer1);
        dtoImp.removeEmployer(employer1);
        Employer find = dtoImp.getById(1L);
        assertEquals(null, find);
    }




}
