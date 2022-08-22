package Todo;

import Model.Todo;
import lombok.Getter;
import service.TodoServiceImpl;

import java.util.ArrayList;

@Getter
public class TodoUtils {
    private ArrayList<Todo> todos = new ArrayList<>();


}
