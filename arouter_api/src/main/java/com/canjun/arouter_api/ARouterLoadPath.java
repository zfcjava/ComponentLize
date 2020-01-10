package com.canjun.arouter_api;

import com.canjun.arouter_annotation.RouterBean;

import java.util.HashMap;

/**
 * ARouterLoadGroup
 *
 * @author zfc
 * @date 2020-01-10
 */
public interface ARouterLoadPath {

    HashMap<String, RouterBean> loadPath();
}
