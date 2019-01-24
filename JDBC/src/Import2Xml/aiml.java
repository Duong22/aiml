package Import2Xml;

/**
 *
 * @author Lonely
 */
public class aiml {

    private int id;
    private String pattern;
    private String template;

    public aiml(int id, String aiml_question, String aiml_answer) {
        this.id = id;
        this.pattern = aiml_question;
        this.template = aiml_answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    public String getPattern() {
        return pattern;
    }

    public void setName(String aiml_question) {
        this.pattern = aiml_question;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String aiml_answer) {
        this.template = aiml_answer;
    }

}