package com.hnr.employee_android.activity

import EmployeeAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hnr.employee_android.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var employeeAdapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        linearLayoutManager = LinearLayoutManager(this)
        employeeAdapter = EmployeeAdapter(this, ArrayList())
        activity_main_rvEmployee.layoutManager = linearLayoutManager
        activity_main_rvEmployee.adapter = employeeAdapter
    }
}