package com.xy.gradleplugin.mavenconfig

import org.gradle.api.Plugin
import org.gradle.api.Project

class MavenConfigPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('mavenConfig', MavenConfig)
        project.task('mavenConfig')
    }
}