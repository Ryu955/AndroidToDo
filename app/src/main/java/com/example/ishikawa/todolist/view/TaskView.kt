package com.example.ishikawa.todolist.view

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import com.example.ishikawa.todolist.R
import com.example.ishikawa.todolist.model.Task

class TaskView:FrameLayout{

    constructor(context:Context?):super(context)

    //    var taskListView:TextView? = null
    val taskListView: TextView by lazy{
        findViewById(R.id.taskList) as TextView
    }

    init {
        LayoutInflater.from(context).inflate(R.layout.view_task,this)
    }

    fun setTask(task: Task){
        taskListView?.text = task.name
    }

}
