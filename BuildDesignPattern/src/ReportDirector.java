public class ReportDirector {

    private DocumentBuilder builder;

    public ReportDirector(DocumentBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.setTitile("Report for my assignment");
        builder.setHeader("This is my assignment");
        builder.setBody("This is body blabla...");
        builder.setFooter("I finished report my assignment.");
        builder.getResult();
    }
}
