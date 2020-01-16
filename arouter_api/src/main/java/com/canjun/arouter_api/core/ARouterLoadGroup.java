package com.canjun.arouter_api.core;

import java.util.Map;

/**
 * ARouterLoadGroup
 * 单例，缓存管理apt生成的 XXX$$Parameter,
 *
 * @author zfc
 * @date 2020-01-10
 */
public interface ARouterLoadGroup {

    Map<String,Class<? extends ARouterLoadPath>> loadGroup();
}
