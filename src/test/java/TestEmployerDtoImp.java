import com.study.crud.EmployerDtoImp;
import com.study.entity.Employer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.List;

import static com.study.utils.Utils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestEmployerDtoImp {

    EmployerDtoImp dtoImp;
    Employer employer11;

    public TestEmployerDtoImp(){
        employer11 = new Employer(getRandomName(), getRandomDepartment(), getRandomProject(),
                new Date(System.currentTimeMillis()));
    }


    @BeforeEach
    public void beforeEach() {
        dtoImp = new EmployerDtoImp();
    }

    @Test
    void getAllShouldReturnSavedEmployers()  { //TO-DO

        List<Employer> employers = List.of(new Employer(getRandomName(), getRandomDepartment(), getRandomProject(),
                new Date(System.currentTimeMillis())),new Employer(getRandomName(), getRandomDepartment(), getRandomProject(),
                new Date(System.currentTimeMillis())));

        for (Employer emp : employers) {
            dtoImp.addEmployee(emp);
        }
        List<Employer> actual = dtoImp.getAll();
        assertEquals(employers,actual);
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
    void testIfEmpReturnByIdOk() {
        dtoImp.addEmployee(employer11);
        Employer find = dtoImp.getById(employer11.getId());
        assertEquals(employer11.getName(), find.getName());
    }

    @Test
    void testIfDeleteOk() {
        dtoImp.addEmployee(employer11);
        dtoImp.removeEmployer(employer11);
        Employer find = dtoImp.getById(employer11.getId());
        assertEquals(null, find);
    }

    @Test
    public void TestUpdateEmployer(){
        dtoImp.addEmployee(employer11);
        Employer employer = dtoImp.updateEmployer(employer11.getId());
        Employer updated = dtoImp.getById(employer.getId());
        assertEquals(employer.getName(), updated.getName());
    }

    @Test
    public void saveTest() {
        Employer employer = new Employer();
        employer.setName("new Name");
        dtoImp.save(employer);
        String name = employer.getName();
        assertEquals("new Name", name);
    }

}
