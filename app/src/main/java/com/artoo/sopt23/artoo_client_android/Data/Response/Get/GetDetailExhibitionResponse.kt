package com.artoo.sopt23.artoo_client_android.Data.Response.Get

import com.artoo.sopt23.artoo_client_android.Data.ExhibitionDetailData

data class GetDetailExhibitionResponse (
        var status: Int,
        var message: String,
        var data : ArrayList<ExhibitionDetailData>
)