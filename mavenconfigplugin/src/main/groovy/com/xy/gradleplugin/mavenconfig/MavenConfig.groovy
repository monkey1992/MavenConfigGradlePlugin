package com.xy.gradleplugin.mavenconfig

/**
 * 上传到Maven仓库需要配置的参数
 */
class MavenConfig {
    String repositoryUrl = "https://gradle.xy.com/repository/xy/"
    String repositorySnapshotUrl = "https://gradle.xy.com/repository/xy-snapshots/"
    String authUsername = "xy"
    String authPassword = "xy123456"
    String groupId = "com.xy.sample"
    String artifactId = "sample1"
    String packaging = "aar"
    String version = "1.1.1"
    String description = "dependences libs"
}