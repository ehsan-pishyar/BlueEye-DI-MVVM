package com.example.blueeye.utils

data class Resource<out T>(val status: ApiResponseStatus, val data: T?, val message: String?){

    companion object{

        fun <T> success(data: T): Resource<T>{
            return Resource(ApiResponseStatus.SUCCESS, data, null)
        }

        fun <T> error(message: String, data: T?): Resource<T>{
            return Resource(ApiResponseStatus.ERROR, data, message)
        }

        fun <T> loading(data: T?): Resource<T>{
            return Resource(ApiResponseStatus.LOADING, data, null)
        }
    }

}
