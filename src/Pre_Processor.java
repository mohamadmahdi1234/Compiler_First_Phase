import java.util.regex.Pattern;

public class Pre_Processor {
    private Pattern all_define_expression;
    private Pattern first_two_par_of_define;
    String input;

    public Pre_Processor(String input) {
        this.input = input;
        first_two_par_of_define=Pattern.compile("(?<= |^)define\\s+[A-Za-z]+[a-zA-Z0-9]*");
        all_define_expression=Pattern.compile("(?<= |^)define\\s+[A-Za-z]+[a-zA-Z0-9]*.*");
    }
    public String handle_define(){
        find_defines();
        change_defined_values();
        return input;
    }
    public void find_defines(){

    }
    public void change_defined_values(){

    }

}
