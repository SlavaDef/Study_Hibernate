package com.study.storage;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;

public class DatabaseInitService {
    public void initDb() throws FlywayException {
    // Create the Flyway instance and point it to the database
    Flyway flyway = Flyway
            .configure()
            .dataSource(StorageConstants.MY_SQL, "root", "1234")
            .load();

    // Start the migration
        flyway.migrate();
}

}
