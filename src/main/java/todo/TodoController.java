/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sihai
 */
@Controller
public class TodoController {

    private static final Logger LOG = Logger.getLogger(TodoController.class.getName());

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping(path = {"/list","/"}, method = RequestMethod.GET)
    public String list(Model model) {
        List<Todo> todoList = todoRepo.findAll();
        model.addAttribute("todoList", todoList);
        return "list";
    }

    @RequestMapping(path = "/edit", method = RequestMethod.GET)
    public String edit(@RequestParam(name = "id", required = false) Integer todoId, Model model) {
        final Todo todo;
        if (todoId == null) {
            todo = new Todo();
        } else {
            todo = todoRepo.findOne(todoId);
        }
        LOG.info("todo:" + todo);
        model.addAttribute(todo);
        return "edit";
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public String update(Todo todo, Model model) {
        LOG.info("todo:" + todo.toString());
        todoRepo.save(todo);
        return "redirect:/list";
    }

    @RequestMapping(path = "/delete")
    public String delete(int id) {
        todoRepo.delete(id);
        return "redirect:/list";
    }
}
