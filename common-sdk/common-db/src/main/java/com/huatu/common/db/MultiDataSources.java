package com.huatu.common.db;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.Map;

/**
 * 为了省事，不实现datasource接口，算法等留待项目扩展或者别的模块实现
 * @author hanchao
 * @date 2018/4/20 14:11
 */
public class MultiDataSources {
    private Map<String,DataSource> datasources;

    public MultiDataSources(Map<String,DataSource> datasources){
        this.datasources = Collections.unmodifiableMap(datasources);
    }

    public Map<String, DataSource> getDatasources() {
        return datasources;
    }
}
