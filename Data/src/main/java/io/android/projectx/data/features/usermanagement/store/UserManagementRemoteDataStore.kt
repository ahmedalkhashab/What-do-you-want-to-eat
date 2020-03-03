package io.android.projectx.data.features.usermanagement.store

import io.android.projectx.data.features.usermanagement.model.UserEntity
import io.android.projectx.data.features.usermanagement.repository.UserManagementRemote
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

open class UserManagementRemoteDataStore @Inject constructor(
    private val userManagementRemote: UserManagementRemote
) : UserManagementRemote {
    
    override fun login(email: String, password: String): Observable<UserEntity> {
        return userManagementRemote.login(email, password)
    }

    override fun login(
        countryCode: String,
        mobileNumber: String,
        password: String
    ): Observable<UserEntity> {
        return userManagementRemote.login(countryCode, mobileNumber, password)
    }

    override fun verifyByMobile(
        countryCode: String,
        mobileNumber: String,
        pinCode: String
    ): Observable<UserEntity> {
        return userManagementRemote.verifyByMobile(countryCode, mobileNumber, pinCode)
    }

    override fun verifyByEmail(email: String, pinCode: String): Observable<UserEntity> {
        return userManagementRemote.verifyByEmail(email, pinCode)
    }

    override fun forgetPassword(email: String): Completable {
        return userManagementRemote.forgetPassword(email)
    }

    override fun resetPassword(
        email: String,
        pinCode: String,
        password: String
    ): Observable<UserEntity> {
        return userManagementRemote.resetPassword(email, pinCode, password)
    }

    override fun signUp(email: String, password: String): Observable<UserEntity> {
        return userManagementRemote.signUp(email, password)
    }

    override fun signUp(
        countryCode: String,
        mobileNumber: String,
        password: String
    ): Observable<UserEntity> {
        return userManagementRemote.signUp(countryCode, mobileNumber, password)
    }

    override fun logout(email: String): Completable {
        return userManagementRemote.logout(email)
    }

    override fun logout(countryCode: String, mobileNumber: String): Completable {
        return userManagementRemote.logout(countryCode, mobileNumber)
    }

    override fun getUser(): Observable<UserEntity> {
        return userManagementRemote.getUser()
    }

}