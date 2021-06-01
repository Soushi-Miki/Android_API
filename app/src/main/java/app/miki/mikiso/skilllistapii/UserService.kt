package app.miki.mikiso.skilllistapii

import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface UserService {

    @GET("users/{userID}")
    suspend fun getUser (@Path("userID") userID: String): User
}