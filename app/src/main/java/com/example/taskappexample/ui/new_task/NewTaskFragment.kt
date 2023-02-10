package com.example.taskappexample.ui.new_task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.taskappexample.data.MainApplication
import com.example.taskappexample.databinding.FragmentNewTaskBinding

class NewTaskFragment : Fragment() {

    private var binding: FragmentNewTaskBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNewTaskBinding.inflate(LayoutInflater.from(context), container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding?.btnSave?.setOnClickListener {

            val entity = TaskEntity(
                title = binding?.etTitle?.text.toString(),
                description = binding?.etDescription?.text?.toString()
            )

            MainApplication.appDataBase?.taskDao?.insert(entity)
            findNavController().navigateUp()

        }
    }
}