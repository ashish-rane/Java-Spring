package com.xpert.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.xpert.spring.componentscan.ComponentJdbcConnection;

// The scope prototype indicates that every time a bean is requested from application context,
// a new instance is returned.
// However the referenced bean JdbcConnection will remain the same instance.
@Component
@Scope((ConfigurableBeanFactory.SCOPE_PROTOTYPE))
public class ComponentDAO {
    public ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @Autowired
    ComponentJdbcConnection jdbcConnection;


}
