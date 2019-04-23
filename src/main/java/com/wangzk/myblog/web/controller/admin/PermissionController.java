package com.wangzk.myblog.web.controller.admin;

import com.mtons.mblog.modules.data.PermissionTree;
import com.mtons.mblog.modules.service.PermissionService;
import com.mtons.mblog.web.controller.BaseController;
import com.wangzk.myblog.modules.data.PermissionTree;
import com.wangzk.myblog.modules.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author - langhsu
 * @create - 2018/5/18
 */
@RestController
@RequestMapping("/admin/permission")
public class PermissionController extends BaseController {
    @Autowired
    private PermissionService permissionService;

    @GetMapping("/tree")
    public List<PermissionTree> tree() {
        return permissionService.tree();
    }
}
