package com.crud.tasks;

import com.curd.tasks.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {

		TaskDto taskDto = new TaskDto((long)1,"Sprzatanie","Mycie, pranie");
	//	SpringApplication.run(TasksApplication.class, args);

		long id = taskDto.getId();
		String title = taskDto.getTitle();
		String content = taskDto.getContent();

		System.out.println(id+" "+title+" "+content);
	}

}
