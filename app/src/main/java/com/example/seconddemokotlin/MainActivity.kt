package com.example.seconddemokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.seconddemokotlin.repository.ApiClass
import com.example.seconddemokotlin.repository.CreateResponse
import com.example.seconddemokotlin.repository.GetData
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

  private val userList = arrayListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  makeApiCall()
        for (i :Int in 0 ..10)
        {

            userList.add(User("item $i"))
        }
        val adapter = ItemTextAdapter(userList)

        //now adding the adapter to recyclerview
        rvItem.adapter = adapter

    }
    fun makeApiCall(){
        val request = ApiClass.buildService(GetData::class.java)
        val call = request.getData()
            .enqueue(object :  retrofit2.Callback<CreateResponse> {
                override fun onFailure(call: Call<CreateResponse>, t: Throwable) {

                }

                override fun onResponse(
                    call: Call<CreateResponse>,
                    response: Response<CreateResponse>
                ) {
                    TODO("Not yet implemented")
                }

            })


    }
}


