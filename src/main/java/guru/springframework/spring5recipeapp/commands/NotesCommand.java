package guru.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotesCommand {

    private Long id;
    private String recipeNotes;
}
