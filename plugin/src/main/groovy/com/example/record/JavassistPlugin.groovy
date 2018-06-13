package com.example.record

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by dolphinWang on 15/11/02.
 */
public class JavassistPlugin implements Plugin<Project> {


    @Override
    void apply(Project project) {

        def log = project.logger
        log.error "========================";
        log.error "Javassist开始修改Class!";
        log.error "========================";
        project.android.registerTransform(new JavassistTransform(project))
    }
}

