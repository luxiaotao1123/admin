package com.ccclubs.ts.cache.services;

/**
 * @author yunan
 */
public interface CacheService {
    /**
     * 新增缓存
     * @param key 键
     * @param value 值
     * @return 成功或失败
     */
    boolean add(String key, Object value);

    /**
     * 新增缓存并制定缓存时间
     * @param key 键
     * @param value 值
     * @param minute 有效期(分钟)
     * @return 成功或失败
     */
    boolean add(String key, Object value, int minute);

    boolean addAsSecond(String key, Object value, int second);

    /**
     * 更新缓存（不存在则新增）
     * @param key 键
     * @param value 值
     * @return 成功或失败
     */
    boolean set(String key, Object value);

    /**
     * 更新缓存（不存在则新增）
     * @param key 键
     * @param value 值
     * @param minute 有效期(分钟)
     * @return 成功或失败
     */
    boolean set(String key, Object value, int minute);

    /**
     * 替换缓存内容
     * @param key 键
     * @param value 值
     * @return 成功或失败
     */
    boolean replace(String key, Object value);

    /**
     * 替换缓存内容
     * @param key 键
     * @param value 值
     * @param minute 有效期(分钟)
     * @return 成功或失败
     */
    boolean replace(String key, Object value, int minute);

    /**
     * 获取缓存内容
     * @param key 键
     * @return 值
     */
    Object get(String key);

    /**
     * 删除指定缓存
     * @param key 键
     * @return 成功或失败
     */
    boolean delete(String key);

    /**
     * 判断键是否存在
     * @param key 键
     * @return 是否存在
     */
    boolean containsKey(String key);
}
