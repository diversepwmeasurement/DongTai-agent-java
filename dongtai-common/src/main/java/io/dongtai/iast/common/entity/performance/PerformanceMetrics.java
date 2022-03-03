package io.dongtai.iast.common.entity.performance;

import io.dongtai.iast.common.enums.MetricsKey;

import java.io.Serializable;

/**
 * 性能指标
 *
 * @author chenyi
 * @date 2022/2/28
 */
public class PerformanceMetrics implements Serializable {
    private static final long serialVersionUID = 8266928311545883971L;
    /**
     * 指标枚举
     */
    private MetricsKey metricsKey;

    /**
     * 指标度量值
     */
    private Object metricsValue;

    public MetricsKey getMetricsKey() {
        return metricsKey;
    }

    public <T> T getMetricsValue(Class<T> type) {
        return type.cast(metricsValue);
    }

    public void setMetricsKey(MetricsKey metricsKey) {
        this.metricsKey = metricsKey;
    }

    public void setMetricsValue(Object metricsValue) {
        this.metricsValue = metricsValue;
    }
}
