import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pre_Processor {
    private Pattern all_define_expression;
    private Pattern first_two_par_of_define;
    private Map<String,String> define_value;
    String input;
    String holder;
    String holder1;

    public Pre_Processor(String input) {
        this.input = input;
        first_two_par_of_define=Pattern.compile("(?<= |^|\n)define\\s+[A-Za-z]+[a-zA-Z0-9]*");
        all_define_expression=Pattern.compile("(?<= |^|\n)define\\s+[A-Za-z]+[a-zA-Z0-9]*.*");
        holder="(?<= |^|[+ * \\- / % < <= > >= = += \\-= *= /= == != \\&& \\|| ! ; , \\. \n ]|[\\( \\) \\{ \\}])";
        holder1="(?= |^|$|[+ * \\- / % < <= > >= = += \\-= *= /= == != \\&& \\|| ! ; , \\. \n ]|[\\( \\) \\{ \\}])";
        define_value=new HashMap<>();
    }
    public String handle_define(){
        find_defines();
        change_defined_values();
        return input;
    }
    public void find_defines(){
        Matcher all_def=all_define_expression.matcher(input);
        Matcher first_two=first_two_par_of_define.matcher(input);
        while(all_def.find()){
            first_two.find();
            define_value.put(first_two.group().split("\\s+")[1],input.substring(first_two.end(),all_def.end()).trim());
            input=all_def.replaceFirst("");
            all_def=all_define_expression.matcher(input);
            first_two=first_two_par_of_define.matcher(input);
        }
        input=input.trim();

    }
    public void change_defined_values(){
        for (String key:define_value.keySet()) {
            Pattern defined_in_string=Pattern.compile("\"[^\"]*"+holder+key+holder1+"[^\"]*\"");
            Pattern defined_variable=Pattern.compile(holder+key+holder1);
            Matcher first=defined_in_string.matcher(input);
            Matcher second=defined_variable.matcher(input);
            while (second.find()){
                if(first.find()){
                    continue;
                }
                if(second.group().length()!=key.length()){
                String[]s=second.group().split(key);
                input=input.substring(0,second.start())+s[0]+define_value.get(key)+s[1]+input.substring(second.end());
                }else{
                    input=input.substring(0,second.start())+define_value.get(key)+input.substring(second.end());
                }
                first=defined_in_string.matcher(input);
                second=defined_variable.matcher(input);

            }
        }
        input.trim();
    }

    public static void main(String[] args) {
        String s="define PI 3.14159265359\n" +
                "define FOR100 for ( i = 0 ; i < 100; i++)\n" +
                " int main ( ) {\n" +
                " int i ;\n" +
                " FOR100 {\n" +
                " Print ( i , PI ) ;\n" +
                " }\n" +
                " }";
        Pre_Processor p=new Pre_Processor(s);
        System.out.println(p.handle_define());
    }

}
