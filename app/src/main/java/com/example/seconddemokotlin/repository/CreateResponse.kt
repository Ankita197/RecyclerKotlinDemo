package com.example.seconddemokotlin.repository

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CreateResponse(val data: UserData) {

   @SerializedName("status")
   @Expose
   public val status : Boolean? =null
   @SerializedName("message")
   @Expose
   public val message: Object?=null
   @SerializedName("data")
   @Expose
   public val datas :UserData?=null;

   public class UserData {
      @SerializedName("users")
      public val userList:ArrayList<User>?=null;

      @SerializedName("has_more")
      public val has_more:Boolean?=null;

   }

   public class User {
      @SerializedName("name")
      @Expose
      val name: String? = null

      @SerializedName("image")
      @Expose
      val image: String? = null

      @SerializedName("items")
      @Expose
      val imaglist: ArrayList<String>? = null

   }
   }