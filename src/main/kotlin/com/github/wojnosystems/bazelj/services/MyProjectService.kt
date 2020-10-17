package com.github.wojnosystems.bazelj.services

import com.intellij.openapi.project.Project
import com.github.wojnosystems.bazelj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
