import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * @author ex-aipeng
 * @CreatedDate on 2020/12/7 22:09
 * @Description mybatis-plus代码生成器
 */
public class CodeGenerator {
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        //生成文件的输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
        //开发人员
        gc.setAuthor("ex-aipeng");
        //是否打开输出目录
        gc.setOpen(false);
        //默认是false 是否覆盖已有文件
        gc.setFileOverride(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解 开启 swagger2 模式
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/content_center?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName(scanner("模块名"));
        pc.setParent("com.mxnotes.contentcenter");
        pc.setEntity("domain");
        pc.setService("application");
        pc.setMapper("infrastructure");
        pc.setController("interface");
        mpg.setPackageInfo(pc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //下划线转驼峰 数据库表字段映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // //下划线转驼峰 数据库表字段映射到实体的命名策略, 未指定按照 naming 执行
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //自定义继承的Entity类全称，带包名
        //strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        //【实体】是否为lombok模型（默认 false） 3.3.2以下版本默认生成了链式模型，3.3.2以后，默认不生成，如有需要，请开启ChainModel
        strategy.setEntityLombokModel(true);
        //【实体】是否为链式模型（默认 false 即在实体类加@data 还加@Accessors(chain = true)
        strategy.setChainModel(true);
        //生成 @RestController 控制器
        strategy.setRestControllerStyle(true);
        // 公共父类
        //strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
        //strategy.setSuperEntityColumns("id");
        /**
         * 默认激活进行sql模糊表名匹配
         *
         * 关闭之后likeTable与notLikeTable将失效，include和exclude将使用内存过滤
         *
         * 如果有sql语法兼容性问题的话，请手动设置为false
         *
         * 已知无法使用：MyCat中间件，
         * 需要配合Include使用
         */
        strategy.setEnableSqlFilter(false);
        //需要包含的表名，当enableSqlFilter为false时，允许正则表达式（与exclude二选一配置)
        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        //需要排除的表名，当enableSqlFilter为false时，允许正则表达式
        //strategy.setExclude();
        //strategy.setLikeTable(模糊匹配表名)

        //驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        //表前缀
        //strategy.setTablePrefix(pc.getModuleName() + "_");
        //是否生成实体时，生成字段注解
        strategy.setEntityTableFieldAnnotationEnable(true);
        mpg.setStrategy(strategy);
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
