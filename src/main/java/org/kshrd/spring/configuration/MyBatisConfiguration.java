package org.kshrd.spring.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by Obi-Voin Kenobi on 22-Jun-17.
 */
@Configuration
@MapperScan("org.kshrd.spring.repositories")
public class MyBatisConfiguration {

    private DataSource mDataSource;

    @Autowired
    public MyBatisConfiguration(DataSource mDataSource) {
        this.mDataSource = mDataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(mDataSource);
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mDataSource);
        return factoryBean;
    }

}
