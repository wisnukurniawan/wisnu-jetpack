package com.wisnu.try778

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations

/**
 * Created by wisnu on 8/7/18
 */
fun <X, Y> LiveData<X>.map(func: (source: X) -> Y) = Transformations.map(this, func)