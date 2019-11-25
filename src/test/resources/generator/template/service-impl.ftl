package ${basePackage}.service.impl;

import ${basePackage}.dao.${modelNameUpperCamel}Mapper;
import ${basePackage}.model.${modelNameUpperCamel}DO;
import ${basePackage}.service.${modelNameUpperCamel}Service;
import com.jiebai.framework.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ${author}
 *
 * @author ${author}
 * @version ${version}
 * @date ${date}
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}DO> implements ${modelNameUpperCamel}Service {
    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

    @Override
    public void updateById(${modelNameUpperCamel}DO model) {
    super.updateById(model);
    }

    @Override
    public ${modelNameUpperCamel}DO getById(Integer id) {
    return super.getById(id);
    }

    @Override
    public void removeById(Integer id) {
    super.removeById(id);
    }

}
