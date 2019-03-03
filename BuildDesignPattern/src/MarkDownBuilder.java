/**
 * Builder 2
 */
public class MarkDownBuilder implements DocumentBuilder {

    private String title;
    private String header;
    private String body;
    private String footer;

    @Override
    public void setTitile(String title) {
        this.title = title;
    }

    @Override
    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public void getResult() {
       System.out.println("#" + title); 
       System.out.println("##" + header);
       System.out.println(body);
       System.out.println(footer);
    }
}
