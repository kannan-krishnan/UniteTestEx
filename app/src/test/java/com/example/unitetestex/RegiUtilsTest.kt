package com.example.unitetestex


import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by #kannanpvm007 on  02/02/23.
 */
class RegiUtilsTest {

    @Test
    fun isUserValid() {
      val res=  RegiUtils.isUserValid(
            ""
        ,"123@Kannan",
            "123@Kannan",

        )
         assertThat(res).isFalse()
    }
    @Test
    fun isSamePassword() {
      val res=  RegiUtils.isUserValid(
            ""
        ,"123@Kannan",
            "123@Kannan",

        )
         assertThat(res).isTrue()
    }
}