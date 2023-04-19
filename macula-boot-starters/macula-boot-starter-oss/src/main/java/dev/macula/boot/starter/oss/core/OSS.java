/*
 * Copyright (c) 2023 Macula
 *   macula.dev, China
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * 爱组搭 http://aizuda.com 低代码组件化开发平台
 * ------------------------------------------
 * 受知识产权保护，请勿删除版权申明
 */
package dev.macula.boot.starter.oss.core;

import dev.macula.boot.starter.oss.config.OssProperties;
import dev.macula.boot.starter.oss.utils.SpringUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * aizuda 文件存储接口
 * <p>
 * 尊重知识产权，CV 请保留版权，爱组搭 http://aizuda.com 出品
 *
 * @author 青苗
 * @since 2022-06-09
 */
@Slf4j
public class OSS {

    /**
     * 根据平台选择文件存储实现实例
     *
     * @param platform 存储平台，对应 yml 配置 map key
     * @return 文件存储实现实例 {@link IFileStorage}
     */
    public static IFileStorage fileStorage(String platform) {
        return SpringUtils.getBean(platform, IFileStorage.class);
    }

    /**
     * 根据平台选择文件存储实现实例
     *
     * @return 文件存储实现实例 {@link IFileStorage}
     */
    public static IFileStorage fileStorage() {
        return SpringUtils.getBean(OssProperties.getDefaultPlatform(), IFileStorage.class);
    }
}
