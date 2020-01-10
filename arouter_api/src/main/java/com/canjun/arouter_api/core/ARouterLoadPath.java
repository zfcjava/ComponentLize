package com.canjun.arouter_api.core;

import com.canjun.arouter_annotation.model.RouterBean;

import java.util.Map;


/**
 * ARouterLoadGroup
 *
 * @author zfc
 * @date 2020-01-10
 */
public interface ARouterLoadPath {

    Map<String, RouterBean> loadPath();
}
