package com.github.studenetskiya.testtemplate.services

import com.intellij.openapi.project.Project
import com.github.studenetskiya.testtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
