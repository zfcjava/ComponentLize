package com.canjun.arouter_api;

import java.util.HashMap;

/**
 * ARouterLoadGroup
 *
 * @author zfc
 * @date 2020-01-10
 */
public interface ARouterLoadGroup {

    HashMap<String,Class<? extends ARouterLoadPath>> findGroup();
}
