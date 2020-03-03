package io.android.projectx.remote.features.usermanagement.model.request

import com.google.gson.annotations.SerializedName

data class MobileNumber(
    @SerializedName("countryCode")
    var countryCode: String,
    @SerializedName("number")
    var number: String
) {
    fun format(): String = countryCode.plus(number)
}