package com.canjun.arouter_api.core;

import java.util.Map;

/**
 * ARouterLoadGroup
 *
 * @author zfc
 * @date 2020-01-10
 */
public interface ARouterLoadGroup {

    Map<String,Class<? extends ARouterLoadPath>> loadGroup();
}
