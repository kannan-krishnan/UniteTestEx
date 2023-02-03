package com.example.unitetestex

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before

import org.junit.Test

/**
 * Created by #kannanpvm007 on  02/02/23.
 */
class UserRegiTest {

    private lateinit var userRegi: UserRegi
    @Before
    fun setUp(){
        userRegi= UserRegi()
    }

    @Test
    fun isSame() {
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=userRegi.isSame(context,R.string.app_name,"UniteTestEx")
         assertThat(result).isTrue()
    }
    @Test
    fun isNotSame() {
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=userRegi.isSame(context,R.string.app_name,"UniteTestEx133")
         assertThat(result).isFalse()
    }
}