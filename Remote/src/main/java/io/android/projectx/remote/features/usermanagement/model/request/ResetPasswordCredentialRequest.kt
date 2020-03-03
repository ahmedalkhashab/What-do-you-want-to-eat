package io.android.projectx.remote.features.usermanagement.model.request

import com.google.gson.annotations.SerializedName

data class ResetPasswordCredentialRequest(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("pinCode")
    var pinCode: String? = null,
    @SerializedName("password")
    var password: String? = null
)