package com.xpert.spring.basics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// The scope prototype indicates that every time a bean is requested from application context,
// a new instance is returned.
// However the referenced bean JdbcConnection will remain the same instance.
@Component
@Scope((ConfigurableBeanFactory.SCOPE_PROTOTYPE))
public class PersonDAO {
    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
