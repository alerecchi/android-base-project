package com.alerecchi.baseproject.util

import java.io.File

object JsonUtils {
    /**
     * Helper function which will load JSON from
     * the path specified
     *
     * @param path : Path of JSON file
     * @return json : JSON from file at given path
     */
    fun getJson(path: String): String? {
        val uri = this.javaClass.classLoader?.getResource(path)
        return if (uri != null) {
            val file = File(uri.path)
            String(file.readBytes())
        } else {
            null
        }
    }
}