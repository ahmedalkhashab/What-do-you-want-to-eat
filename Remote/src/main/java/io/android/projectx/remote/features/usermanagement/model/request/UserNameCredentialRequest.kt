package io.android.projectx.remote.features.usermanagement.model.request

import com.google.gson.annotations.SerializedName

data class UserNameCredentialRequest(
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("password")
    var password: String? = null
)