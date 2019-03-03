/**
 * Builder 1
 */
public class HtmlBuilder implements DocumentBuilder {

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
        System.out.println("<h1>" + title + "</h1>");
        System.out.println("<header>" + header + "</header>");
        System.out.println("<body>" + body + "</body>");
        System.out.println("<footer>" + footer + "</footer>");

    } 

}