package com.mysema.query.sql;

import org.junit.Test;

public class TemplatesTest {
    
    @Test
    public void test(){
	new DerbyTemplates();
	new H2Templates();
	new HSQLDBTemplates();
	new MySQLTemplates();
	new OracleTemplates();
	new PostgresTemplates();
	new SQLTemplates();
	new SQLServerTemplates();
    }

}
