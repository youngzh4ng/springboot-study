package com.test.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app")
@Validated
public class AppConfig {
    private List<String> servers = new ArrayList<>();
    private String name;
    private String description;

    private String kebabCase;
    private String camelCase;
    private String underscoreNotation;
    private String upperCase;

    @NotNull
    private String grade;

    private Security security = new Security();

    @Valid
    private List<MyPojo> list = new ArrayList<>();

    @Valid
    private Map<String, MyPojo> map = new HashMap<>();

    private String testDb;

    public String getTestDb() {
        return testDb;
    }

    public void setTestDb(String testDb) {
        this.testDb = testDb;
    }

    public Map<String, MyPojo> getMap() {
        return map;
    }

    public Security getSecurity() {
        return security;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKebabCase() {
        return kebabCase;
    }

    public void setKebabCase(String kebabCase) {
        this.kebabCase = kebabCase;
    }

    public String getCamelCase() {
        return camelCase;
    }

    public void setCamelCase(String camelCase) {
        this.camelCase = camelCase;
    }

    public String getUnderscoreNotation() {
        return underscoreNotation;
    }

    public void setUnderscoreNotation(String underscoreNotation) {
        this.underscoreNotation = underscoreNotation;
    }

    public String getUpperCase() {
        return upperCase;
    }

    public void setUpperCase(String upperCase) {
        this.upperCase = upperCase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getServers() {
        return servers;
    }

    public List<MyPojo> getList() {
        return list;
    }

    public static class Security {
        private String username;
        private String password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

    }
    public static class MyPojo {
        private String name;
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
