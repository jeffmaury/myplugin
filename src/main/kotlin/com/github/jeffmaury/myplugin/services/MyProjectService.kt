package com.github.jeffmaury.myplugin.services

import com.intellij.openapi.project.Project
import com.github.jeffmaury.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
