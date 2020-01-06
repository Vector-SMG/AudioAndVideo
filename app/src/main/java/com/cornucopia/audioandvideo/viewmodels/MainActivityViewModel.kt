package com.cornucopia.audioandvideo.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * MainActivity相关的ViewModel.
 * 参考:(1) https://blog.csdn.net/huyongl1989/article/details/71037284
 *     (2) https://blog.csdn.net/ckwccc/article/details/80363674
 *     (3) https://blog.csdn.net/weixin_42229694/article/details/89315026
 * @author Cornucopia
 * @version 1.0
 * @since 2020-01-05
 */
class MainActivityViewModel : ViewModel() {

    var isConnected = MutableLiveData<Boolean>().apply {
        Log.e("MainActivityViewModel","apply")
        postValue(false)
    }

}