package controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.TasksService;
import config.config;
import model.task;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String gettasks(Model model) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		TasksService tasksService =ctx.getBean("tasksService",TasksService.class);
		List<task>t =tasksService.gettask();
		model.addAttribute("tasks",t);
		ctx.close();
		return "index";
	}
	
	@RequestMapping(value="/deletetask", method=RequestMethod.POST)
	public String deleteTask(@RequestParam ("taskId") int taskId) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		TasksService tasksService =ctx.getBean("tasksService",TasksService.class);
		boolean deleted = tasksService.deleteTask(taskId);
		ctx.close();
		return "redirect:/";
	}
	
	
	@PostMapping("/completetask")
	public String completeTask(@RequestParam ("taskId") int taskId) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		TasksService tasksService =ctx.getBean("tasksService",TasksService.class);
		tasksService.completeTask(taskId);
		ctx.close();
		return "redirect:/";
	}
	
	@RequestMapping(value="/completedTask", method=RequestMethod.GET)
	public String getCompletedtasks(Model model) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		TasksService tasksService =ctx.getBean("tasksService",TasksService.class);
		List<task>t =tasksService.getCompletedTasks();
		model.addAttribute("tasks",t);
		ctx.close();
		return "completedTask";
	}

	@RequestMapping(value="/addTask", method=RequestMethod.POST)
	public String addTask( @ModelAttribute task t) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		TasksService tasksService =ctx.getBean("tasksService",TasksService.class);
		tasksService.addTask(t);
		ctx.close();
		return "redirect:/";
	}
	@RequestMapping(value="/updateTask", method=RequestMethod.POST)
	public String updateTask( @ModelAttribute task t) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		TasksService tasksService =ctx.getBean("tasksService",TasksService.class);
		tasksService.updateTask(t);
		ctx.close();
		return "redirect:/";
	}
	
}
