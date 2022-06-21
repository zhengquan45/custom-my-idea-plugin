package com.github.zhengquan45.custommyideaplugin.services

import com.intellij.openapi.project.Project
import com.github.zhengquan45.custommyideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
