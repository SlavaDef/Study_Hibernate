import com.study.dto.EmployerDtoImp;
import com.study.entity.Employer;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmployerDtoImp {

    EmployerDtoImp dtoImp = new EmployerDtoImp();
    Employer employer1 = new Employer(11L,"Jordan", "playing", "basketball", new Date(System.currentTimeMillis()));

    @Test
    void testIfEmpIsAdd() {
        Employer employer = new Employer();
        employer.setName("Jordan");
        dtoImp.addEmployee(employer);
        Employer jordan = dtoImp.getById(employer.getId());
        assertEquals(employer.getName(),jordan.getName());

    }
}
