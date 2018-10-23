package com.t3.admin.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by luxiaotao on 2018/10/23
 * 使用方法：
 * 1.在resources文件夹下，配置generator/generatorConfig.xml文件参数
 * 2.运行GeneratorPlugin类的main方法即可
 */
public class GeneratorPlugin {

    public static void main(String[] args) throws Exception {
        generator(true);
    }

    private static void generator() throws Exception {
        List<String> warnings = new ArrayList<>();
        String configPath = Objects.requireNonNull(GeneratorPlugin.class.getClassLoader().getResource("generator/generatorConfig.xml")).getFile();
        File configFile = new File(configPath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void generator(boolean way) throws Exception {
        List<String> warnings = new ArrayList<String>();
        File configFile = new File("E:\\git in work\\t3\\t3-admin\\src\\main\\resources\\generator\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
