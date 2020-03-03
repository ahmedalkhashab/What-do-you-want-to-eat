package io.android.projectx.remote.features.usermanagement.model.request

import com.google.gson.annotations.SerializedName

data class MobileCredentialRequest(
    @SerializedName("mobile")
    var mobile: MobileNumber? = null,
    @SerializedName("password")
    var password: String? = null
)