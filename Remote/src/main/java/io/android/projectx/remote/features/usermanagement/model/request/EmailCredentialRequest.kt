package io.android.projectx.remote.features.usermanagement.model.request

import com.google.gson.annotations.SerializedName

data class EmailCredentialRequest(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("password")
    var password: String? = null
)