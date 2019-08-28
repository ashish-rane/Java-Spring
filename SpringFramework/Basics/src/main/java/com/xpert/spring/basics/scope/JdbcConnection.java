package com.xpert.spring.basics.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

// For a referenced component just specifying the scope as prototype does not mean we get different
// instance of that component when a parent component is requested from the context.
// We have to specify ProxyMode which indicates Spring that the reference is a proxy and a new
// instance of this component should be created everytime this component is accessed from the parent component.
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }
}
