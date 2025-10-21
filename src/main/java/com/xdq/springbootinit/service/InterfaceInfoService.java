package com.xdq.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xdq.springbootinit.model.entity.InterfaceInfo;

/**
* @author xdq
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2025-10-20 14:15:28
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);;
}
