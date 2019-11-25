package com.jiebai.generator.core;

/**
 * 项目常量
 */
public final class ProjectConstant {
    /**
     *  根据自己的项目修改
      */
    public static final String PROJECT_NAME = "qqsk.goods";

    /**
     * 项目基础包名称
     */
    public static final String BASE_PACKAGE = "com.jiebai." + PROJECT_NAME;

    /**
     * Model所在包
     */
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";

    /**
     * Mapper所在包
     */
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";

    /**
     * Service所在包
     */
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";

    /**
     * ServiceImpl所在包
     */
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";

    /**
     * constant所在包
     */
    public static final String CONSTANT_PACKAGE = BASE_PACKAGE + ".constant";

    /**
     * Mapper插件基础接口的完全限定名
     */
    public static final String MAPPER_INTERFACE_REFERENCE = "com.jiebai.framework.service.Mapper";
}
