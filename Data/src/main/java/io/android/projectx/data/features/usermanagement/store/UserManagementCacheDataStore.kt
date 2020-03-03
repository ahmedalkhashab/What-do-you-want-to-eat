package io.android.projectx.data.features.usermanagement.store

import io.android.projectx.data.features.usermanagement.model.UserEntity
import io.android.projectx.data.features.usermanagement.repository.UserManagementCache
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

open class UserManagementCacheDataStore @Inject constructor(
    private val userManagementCache: UserManagementCache
) : UserManagementCache {

    companion object {
        const val KEY_USER_MANAGEMENT = "key_user_management"
    }

    override fun clearUser(): Completable {
        return userManagementCache.clearUser()
    }

    override fun saveUser(userEntity: UserEntity, lastCache: Long): Completable {
        return userManagementCache.saveUser(userEntity, lastCache)
    }

    override fun areUserCached(): Single<Boolean> {
        return userManagementCache.areUserCached()
    }

    override fun logout(email: String): Completable {
        return userManagementCache.logout(email)
    }

    override fun logout(countryCode: String, mobileNumber: String): Completable {
        return userManagementCache.logout(countryCode, mobileNumber)
    }

    override fun getUser(): Observable<UserEntity> {
        return userManagementCache.getUser()
    }

}