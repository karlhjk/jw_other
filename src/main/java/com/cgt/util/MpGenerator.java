package com.cgt.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 代码生成器演示
 * </p>
 */
public class MpGenerator {

    public static void main(String[] args) {
        String[] models = {"ssm-mapper","ssm-model","ssm-service","ssm-web"};
        for (String model : models) {
            shell(model);
        }
    }

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
        private static void shell(String model){
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
//        gc.setOutputDir("E:\\ssms");
        gc.setOutputDir("E:\\sgjf");//这里写你自己的java目录
        gc.setFileOverride(true);//是否覆盖
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("cgt");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                return super.processTypeConvert(fieldType);
            }
        });
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("foshancgt");
        dsc.setUrl("jdbc:mysql://192.168.11.30:3306/sgjf?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(new String[]{"_"});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
//        strategy.setDbColumnUnderline(true);
//        strategy.setCapitalMode(false);
        mpg.setStrategy(strategy);
        //String[] include = new String[]{"sg_project_progress"};
        //strategy.setInclude(include);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(null);
        pc.setEntity("dao.entity");
        pc.setMapper("dao");
        pc.setXml("dao.mapper");
        pc.setService("service");
        pc.setParent("com.cgt");
        pc.setController("controller");
        pc.setServiceImpl("service.impl");

//        pc.setEntity("");
//        pc.setMapper("");
//        pc.setXml("");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);

//        TemplateConfig tc = new TemplateConfig();
//        if ("ssm-mapper".equals(model)) {
//            tc.setController(null);
//            tc.setEntity(null);
//            tc.setService(null);
//            tc.setServiceImpl(null);
//        } else if ("ssm-model".equals(model)) {
//            tc.setController(null);
//            tc.setService(null);
//            tc.setServiceImpl(null);
//            tc.setMapper(null);
//            tc.setXml(null);
//        }  else if ("ssm-service".equals(model)) {
//            tc.setController(null);
//            tc.setMapper(null);
//            tc.setXml(null);
//            tc.setEntity(null);
//        } else if ("ssm-web".equals(model)) {
//            tc.setMapper(null);
//            tc.setXml(null);
//            tc.setService(null);
//            tc.setServiceImpl(null);
//            tc.setEntity(null);
//        }
//        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

    }

}