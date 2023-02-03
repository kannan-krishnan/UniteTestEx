package com.example.unitetestex

import android.content.Context

/**
 * Created by #kannanpvm007 on  02/02/23.
 */
class UserRegi {


    fun isSame(context: Context,resorceId: Int,resorceName:String):Boolean{

        return    (context.getString(resorceId) == resorceName)

    }
}