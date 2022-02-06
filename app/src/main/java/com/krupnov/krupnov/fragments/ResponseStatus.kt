package com.krupnov.krupnov.fragments

import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.json.FuelJson
import com.github.kittinunf.result.Result

class ResponseStatus {

    private lateinit var response : Result<FuelJson, FuelError>
    private var e : Exception? = null

    fun setResponse(result: Result<FuelJson, FuelError>) {
        response = result
    }

    fun setException(exc : Exception) {
        e = exc
    }

    fun getResponse() : Result<FuelJson, FuelError> {
        return response
    }

    fun getException() : Exception? {
        return e
    }
}