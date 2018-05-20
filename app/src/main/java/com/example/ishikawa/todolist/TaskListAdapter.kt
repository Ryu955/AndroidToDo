package com.example.ishikawa.todolist

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.ishikawa.todolist.model.Task
import com.example.ishikawa.todolist.view.TaskView

class TaskListAdapter(private val context: Context):BaseAdapter(){

    var tasks:List<Task> = emptyList()

    override fun getCount():Int = tasks.size

    override fun getItem(position: Int):Any? = tasks[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int,
                         convertView: View?,
                         parent:ViewGroup?) :View = ((convertView as? TaskView)?: TaskView(context).apply {
        setTask(tasks[position])
    })

}
