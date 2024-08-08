package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TasksDao;
import model.task;

@Service
public class TasksService {
 @Autowired
 private TasksDao tasksDao;



public TasksService() {
	
}
public boolean updateTask(task t) {
	return tasksDao.updateTask(t);
}
public List<task> gettask() {
	return tasksDao.getTasks();
}
public List<task> getCompletedTasks() {
	return tasksDao.getCompletedTasks();
}
public void addTask(task t) {
	 tasksDao.addTask(t);
}
public task getTaskById(int taskId) {
	return tasksDao.getTaskById(taskId);
}
public boolean deleteTask(int taskId) {
	return tasksDao.deleteTask(taskId);
}
public boolean completeTask(int taskId) {
	return tasksDao.completeTask(taskId);
}



}