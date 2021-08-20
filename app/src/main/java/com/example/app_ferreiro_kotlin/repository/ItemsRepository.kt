package com.example.app_ferreiro_kotlin.repository

interface ItemsRepository {

    fun getItem()
    fun getItemByName(name: String)
} 