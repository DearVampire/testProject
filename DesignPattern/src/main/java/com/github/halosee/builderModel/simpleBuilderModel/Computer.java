package com.github.halosee.builderModel.simpleBuilderModel;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @Author: niuxiaowen
 * @Description:
 * @Date: 2021/7/7 16:05
 * @Version: 1.0
 */
@Data
@Builder
public class Computer {
    private final String cpu;
    private final String ram;
    private final int usbCount;
    private final String keyboard;
    private final String display;
}
