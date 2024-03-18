CREATE TABLE hiber.employer (
                          id BIGINT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          department VARCHAR(100) NOT NULL,
                          project VARCHAR(100) NOT NULL,
                          deadline DATE

);

INSERT INTO hiber.employer
(id,name,department,project,deadline)
VALUES
    (1,'Sidni','Save planet','saivin fish','2024-01-12'),
    (2,'Bob','Creating','Creating things','2024-01-12'),
    (3,'Eddi','Save planet','saivin mushrums','2024-01-12'),
    (4,'Kate','Intelegy','programming hends','2024-01-12'),
    (5,'Sofi','Programming','SQL','2024-01-12'),
    (6,'Sonia','Save planet','saivin cats','2025-01-12'),
    (7,'Nina','Programming','Hibernate Controller','2027-01-12'),
    (8,'Jon','Programming','Spring updaiter','2030-01-12');